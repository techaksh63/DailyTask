import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("WriteFile/NewFolder");
        file.mkdir();
        file = new File("WriteFile/NewFolder/NewFile");
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write("Aksh");
            bw.newLine();
            bw.write("Yash");
            bw.newLine();
            bw.write("Parth");
            bw.newLine();
            bw.write("Darshan");
            bw.newLine();
            bw.newLine();
            bw.close();
            System.out.println("Writing in file is completed");
        } catch (IOException e) {
            System.out.println("Error occur while creating file");
        }

    }
}