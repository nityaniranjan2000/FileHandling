import java.io.File;
import java.io.IOException;

public class ListFile {
    public void listFile() throws IOException {
        File file = new File("FileHandling/Test.txt");
        String[] files = file.list();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
}