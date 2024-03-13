import java.util.Scanner;

public class Tech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main(new language(4,5,6),05,01,2,2024);

        Tech tech = new Tech();
        System.out.println(tech.output(main.language.getJava(),main.language.getReact(),main.language.getBi(),main.getDuration(), main.getDay(), main.getMonth(), main.getYear()));

    }
    public String output(int java,int react, int bi, int duration, int day, int month, int year) {
        int date = duration+day;
        return "tech ={" +
                "java=" + java +
                ", react=" + react +
                ", bi=" + bi +
                '}' +
                ", date=" + date +"/"+month+"/"+year+
                '}';

    }

}
