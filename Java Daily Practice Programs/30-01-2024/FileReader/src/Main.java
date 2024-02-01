import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("FileReader/NewFolder");
        file.mkdir();
        file = new File("FileReader/NewFolder/NewFile");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
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

        try {
            BufferedReader br = new BufferedReader(new FileReader("FileReader/NewFolder/NewFile"));
            String line;
            System.out.println("***** File Reading is Starting *****");
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not Found Exception");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }

        System.out.println("***** Another Alternative Solution to read the file using Scanner Object *****");
        try {
            Scanner sc = new Scanner(new File("FileReader/NewFolder/NewFile"));
            String lines;
            while(sc.hasNext()){
                lines = sc.nextLine();
                System.out.println(lines);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found Exception while using Scanner Object");
        }

    }
}