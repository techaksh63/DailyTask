import java.util.ArrayList;

public class Main {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
          list.add("Aksh");
          list.add("Parth");
          list.add("Yash");
          list.add("Darshan");

          Main main = new Main();
          main.displayList(list);

//          main.removeNameByPosition(2);
//          main.displayList(list);
//
//          main.removeNameByString("Darshan");
//          main.displayList(list);

            main.modifyName(2, "Smit");
            main.displayList(list);

            int position = main.search("Parth");
            if (position != -1){
                main.modifyName(position,"Vinit");
                main.displayList(list);
            }
            else{
                System.out.println("Invalid Name");
            }

    }

    void displayList(ArrayList<String> names){
        for (String name : names){
            System.out.println(name);
        }
        System.out.println("************");
    }
    void removeNameByPosition(int position){
        list.remove(position);
    }
    void removeNameByString(String name){
        list.remove(name);
    }
    void modifyName(int position, String name){
        list.set(position, name);
    }
    int search(String name){
        return list.indexOf(name);
    }
}