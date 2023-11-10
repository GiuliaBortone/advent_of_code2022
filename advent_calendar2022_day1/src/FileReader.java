import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {

    public static String copyFileContentToString(String filePath) {
        String fileContent = "";

        try {
            fileContent = Files.readString(Paths.get(filePath));
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return fileContent;
    }
}
