import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Aksh");
        set.add("Vinit");
        set.add("Yash");
        set.add("Jay");

        for (String name : set){
            System.out.println(name);
        }
        System.out.println(set.contains("Aksh"));

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(11);
        set1.add(21);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);

        for (Integer number : set1){
            System.out.println(number);
        }

        Set<Integer> set2 = new TreeSet<>();
        set2.add(111);
        set2.add(112);
        set2.add(119);
        set2.add(114);
        set2.add(115);
        set2.add(116);

        for (Integer number : set2){
            System.out.println(number);
        }
    }
}