import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String Name = sc.nextLine();
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        System.out.println("Hey Your Name is "+Name+" and your age is "+age+". Have a nice Day");
        sc.close();
    }
}