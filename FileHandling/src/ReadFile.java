import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public void readFile(){
        try {
            File file = new File("Test.txt");
            Scanner read = new Scanner(file);
            if(read.hasNextLine()){
                String data= read.nextLine();
                System.out.println(data);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
