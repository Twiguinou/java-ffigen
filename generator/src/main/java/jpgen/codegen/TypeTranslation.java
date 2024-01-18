package jpgen.codegen;

import jpgen.data.TypeManifold;

public interface TypeTranslation
{
    HeaderInformation headerInfo();

    RecordInformation recordInfo(TypeManifold type);
}
