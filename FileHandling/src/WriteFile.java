import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public void writeFile(){
        System.out.println("Enter the file name to write in it");
        Scanner scanner= new Scanner(System.in) ;
        String str= scanner.nextLine();
        System.out.println("Enter text to write in file");
        Scanner sc= new Scanner(System.in);
        String text=sc.nextLine();

        try {
            FileWriter fw = new FileWriter(str);

            fw.write(text);
            fw.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
