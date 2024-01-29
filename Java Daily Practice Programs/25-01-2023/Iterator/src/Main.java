import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("India");
        list.add("China");
        list.add("Poland");
        list.add("Egypt");
        list.add("Africa");

        Main main = new Main();
        main.printList(list);
        System.out.println("*********");

        list.sort(null);
        main.printList(list);
        System.out.println("*********");

        Collections.reverse(list);
        main.printList(list);

    }
    void printList(List<String> list){
         ListIterator<String> iterator = list.listIterator();

        if (iterator.hasNext()) {
            do {
                System.out.println("Elements: " + iterator.next());
            } while (iterator.hasNext());
        }
    }
}