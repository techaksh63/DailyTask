import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        IntPredicate lessThan18 = i -> i<18;
        IntPredicate greaterThan30 = i -> i>30;

//        System.out.println(lessThan18.test(15));
        System.out.println(lessThan18.and(greaterThan30).test(20));
    }
}