public class Main {
    public static void main(String[] args) {
        Lambda lambda = (String str)-> {
            System.out.println("Hello This is lambda expression first statement");
            System.out.println(str);
        };

        lambda.demo("This is another string");
    }
}
interface Lambda{
    void demo(String str);
}