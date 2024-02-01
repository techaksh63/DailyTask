import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {

        // Full implementation of BiFunction Interface with overriding the apply method
        BiFunction<Integer,Integer,Integer > adder = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer i, Integer j) {
                return i+j;
            }
        };
        System.out.println(adder.apply(20,30));


        // Use of Lambda Expression Implementation of BiFunction Interface
        BiFunction<Integer, Integer,Integer > adder1 = (i , j) -> i+j ;
        System.out.println(adder1.apply(75,25));


        //Method Reference of Arithmetic class in Implementation of BiFunction Interface
        BiFunction<Integer, Integer,Integer > adder2 = Arithmetic::add;
        int result = adder2.apply(15, 65);
        System.out.println(result);



    }
}

class Arithmetic{
    public static int add(int i, int j){
        return i+j;
    }
}