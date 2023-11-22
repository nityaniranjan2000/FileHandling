import java.io.File;
import java.util.Scanner;

public class DeleteFile {
    public void deleteFile(){
        System.out.println("Which File you want to delete");
        Scanner scanner= new Scanner(System.in);
        String s=scanner.nextLine();
        File file=new File(s);
        if (file.delete()){
            System.out.println("File deleted successfully");
        }
        else {
            System.out.println("File not exist");
        }
    }
}
