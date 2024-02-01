import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowThrows {
    public static void main(String[] args) {
        try {
            method();
            System.out.println("Try block");
        }catch (FileNotFoundException e){
            System.out.println("File Not found Exception");
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
    public static void method() throws Exception {
        FileReader in = new FileReader("file.txt");
        System.out.println("Message form method");

        throw new Exception();
    }
}
