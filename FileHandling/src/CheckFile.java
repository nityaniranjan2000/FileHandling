import java.io.File;

public class CheckFile {
    public void checkFile(){
        File f= new File("Test.txt");
    if (f.exists()){
        System.out.println("File available");
    }
    }
}
