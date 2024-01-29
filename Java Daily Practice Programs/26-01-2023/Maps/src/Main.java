import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(11, "Aksh");
        map.put(8, "Morvin");
        map.put(12, "Yash");
        map.put(15, "Darshan");
        map.put(6, "Jinang");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("Key is : "+ entry.getKey()+ ", Value is : "+ entry.getValue());
        }
        System.out.println("***Search by Key***");
        for(Integer key: map.keySet()){
            System.out.println("Key is : "+ key + ", Values is : "+ map.get(key));
        }

    }
}