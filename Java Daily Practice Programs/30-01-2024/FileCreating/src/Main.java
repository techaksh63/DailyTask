import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File dir = new File("FileCreating/Directory");
        dir.mkdirs();
        System.out.println("New directory is created");
        File file = new File("FileCreating/Directory/NewFileCreated.txt");
        file.createNewFile();
        System.out.println("New file is created as mentions above");


        if(file.delete()){
            System.out.println("File deleted Successfully");
        }
        else{
            System.out.println("File not found");
        }

    }
}