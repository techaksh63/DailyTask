import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("India");
        linkedList.add("China");
        linkedList.add("Poland");
        linkedList.add("Egypt");
        linkedList.add("Africa");
        System.out.println(linkedList);

        linkedList.add(3, "Brazil");
        System.out.println(linkedList);

        linkedList.set(2,"England");
        System.out.println(linkedList);

        linkedList.remove(4);
        System.out.println(linkedList);
    }
}