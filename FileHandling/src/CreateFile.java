import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public String s;
    public void createFile() {
        System.out.println("Enetr the file name wwith format 'filename.txt' which you want to create" );
        Scanner scanner=new Scanner(System.in);

                s=scanner.nextLine();

        try {
            File file = new File(s);
            if (file.createNewFile()) {
                System.out.println(s+ "File is Created");
            }
            else {System.out.println("not Created already Available");}
        }
        catch(IOException e){

            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}