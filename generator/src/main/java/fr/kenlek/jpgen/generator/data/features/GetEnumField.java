package fr.kenlek.jpgen.generator.data.features;

import com.palantir.javapoet.FieldSpec;
import fr.kenlek.jpgen.generator.data.EnumType;

import static fr.kenlek.jpgen.generator.data.EnumDeclaration.CONSTANT_MODIFIER_SET;

public record GetEnumField(EnumType.Constant constant) implements TypeFeature<FieldSpec>
{
    @Override
    public FieldSpec check(Object result)
    {
        FieldSpec field = (FieldSpec) result;
        if (!field.name().equals(this.constant().name()))
        {
            throw new IllegalArgumentException("Field must have the same name as the enum constant.");
        }

        if (!field.modifiers().equals(CONSTANT_MODIFIER_SET))
        {
            throw new IllegalArgumentException("Field must have these exact modifiers: " + CONSTANT_MODIFIER_SET);
        }

        return field;
    }
}
