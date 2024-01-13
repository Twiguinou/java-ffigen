package jpgen;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Writer;
import java.util.Collection;
import java.util.Optional;

public record ProgramOptions(String[] headers, Optional<String> templateFile, FunctionSymbol[] functions, String[] includePaths, String packageName, String mainClassName)
{
    public record FunctionSymbol(String name, boolean trivial) {}

    public static ProgramOptions fromJsonFile(File file) throws FileNotFoundException
    {
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new FileReader(file));
        JsonObject mainObject = gson.fromJson(jsonReader, JsonObject.class);

        String[] headers;
        if (mainObject.has("headers"))
        {
            JsonArray array = mainObject.getAsJsonArray("headers");
            headers = new String[array.size()];
            for (int i = 0; i < headers.length; i++)
            {
                headers[i] = array.get(i).getAsString();
            }
        }
        else
        {
            headers = new String[0];
        }

        Optional<String> templateFile;
        if (mainObject.has("templateFile"))
        {
            templateFile = Optional.of(mainObject.getAsJsonPrimitive("templateFile").getAsString());
        }
        else
        {
            templateFile = Optional.empty();
        }

        FunctionSymbol[] functions;
        if (mainObject.has("functions"))
        {
            JsonArray array = mainObject.getAsJsonArray("functions");
            functions = new FunctionSymbol[array.size()];
            for (int i = 0; i < functions.length; i++)
            {
                if (array.get(i).isJsonPrimitive())
                {
                    functions[i] = new FunctionSymbol(array.get(i).getAsString(), false);
                }
                else if (array.get(i).isJsonObject())
                {
                    JsonObject functionSpec = array.get(i).getAsJsonObject();
                    String name = functionSpec.getAsJsonPrimitive("name").getAsString();
                    boolean trivial = functionSpec.has("trivial") && functionSpec.getAsJsonPrimitive("trivial").getAsBoolean();
                    functions[i] = new FunctionSymbol(name, trivial);
                }
                else
                {
                    throw new IllegalStateException("Unexpected container for json element.");
                }
            }
        }
        else
        {
            functions = new FunctionSymbol[0];
        }

        String[] includePaths;
        if (mainObject.has("includePaths"))
        {
            JsonArray array = mainObject.getAsJsonArray("includePaths");
            includePaths = new String[array.size()];
            for (int i = 0; i < includePaths.length; i++)
            {
                includePaths[i] = array.get(i).getAsString();
            }
        }
        else
        {
            includePaths = new String[0];
        }

        String packageName = mainObject.getAsJsonPrimitive("package").getAsString();
        String mainClassName = mainObject.getAsJsonPrimitive("mainClass").getAsString();

        return new ProgramOptions(headers, templateFile, functions, includePaths, packageName, mainClassName);
    }

    public void writeTemplate(Collection<String> functionSymbols, Writer writer)
    {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        JsonObject mainObject = new JsonObject();

        JsonArray headersElement = new JsonArray();
        for (String header : this.headers)
        {
            headersElement.add(header);
        }
        mainObject.add("headers", headersElement);

        JsonArray includePathsElement = new JsonArray();
        for (String path : this.includePaths)
        {
            includePathsElement.add(path);
        }
        mainObject.add("includePaths", includePathsElement);

        mainObject.addProperty("package", this.packageName);
        mainObject.addProperty("mainClass", this.mainClassName);

        JsonArray functionsElement = new JsonArray();
        for (String symbol : functionSymbols)
        {
            JsonObject functionObject = new JsonObject();
            functionObject.addProperty("name", symbol);
            functionsElement.add(functionObject);
        }
        mainObject.add("functions", functionsElement);

        gson.toJson(mainObject, writer);
    }
}
