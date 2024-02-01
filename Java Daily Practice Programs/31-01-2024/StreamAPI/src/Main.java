import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Map method of Stream
        List<Integer> number = Arrays.asList(2,3,4,5);
        List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);

        //Filter Method of Stream
        List<String> names = Arrays.asList("Aksh", "Yash", "Jay", "Dhaval", "Vijay", "Vipul", "Parth", "Vanraj");
        List<String> filter = names.stream().filter(s -> s.startsWith("V")).collect(Collectors.toList());
        System.out.println(filter);

        //Short Method of Stream
        List<String> list = Arrays.asList("Darshan", "Jayesh", "Dhruv", "Vijay", "Vivan", "Parthik", "Raj");
        List<String> shorted = list.stream().sorted().collect(Collectors.toList());
        System.out.println(shorted);
    }
}