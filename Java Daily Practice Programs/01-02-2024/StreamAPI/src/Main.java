import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(12,56,19,2,35,9,12,45,6,1,84,45);

//        Stream<Integer> data = number.stream().map(a -> a*a);
//        data.forEach(System.out::println);

          // Convert Stream to Collection.
//        List<Integer> listData  = data.collect(Collectors.toList());
//        System.out.println(listData);

        //Count method to count the number of element in the stream.
//        long data2 = number.stream().count();
//        System.out.println(data2);
//
//        //Sort in Reverse order
//        List<Integer> num = number.stream().sorted((a,b)-> b-a).collect(Collectors.toList());
//        System.out.println(num);

        //Min and Max
//          Integer maximum = number.stream().max(Comparator.comparing(Integer::valueOf)).get();
//          System.out.println(maximum);
//
//          Integer minimum = number.stream().min(Comparator.comparing(Integer::valueOf)).get();
//          System.out.println(minimum);
//
//          List<Integer> first = number.stream().findFirst().stream().collect(Collectors.toList());
//          System.out.println(first);
//
//          List<Integer> dist = number.stream().distinct().collect(Collectors.toList());
//          System.out.println(dist);

          List<Integer> peek = number.stream().peek(System.out::println).collect(Collectors.toList());



    }
}