import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        CreateFile createFile=new CreateFile();
        CheckFile check=new CheckFile();
        WriteFile writeFile=new WriteFile();
        ReadFile readFile=new ReadFile();
        ListFile listfile=new ListFile();
        DeleteFile deleteFile=new DeleteFile();
        System.out.println("1. Create a File");
        System.out.println("2. Write file");
        System.out.println("3  Read file");
        System.out.println("4. Check file");
        System.out.println("5. Delete file");
        System.out.println("Choose a action you need");
        Scanner scanner=new Scanner(System.in);
        int s= scanner.nextInt();
        switch (s){
            case 1:
                createFile.createFile();
                break;
            case 2:
                writeFile.writeFile();
                break;
            case 3:
                readFile.readFile();
                break;
            case 4:
                check.checkFile();
                break;
            case 5:
                deleteFile.deleteFile();
                break;
            default:
                System.out.println("Enter valid option");
                break;

        }
    }
}
