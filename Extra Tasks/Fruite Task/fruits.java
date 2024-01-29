import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class fruits {
   public static void main(String[] args) {
       ArrayList<HashMap<String, Integer>> arrayOfFruits = new ArrayList<>();
       arrayOfFruits.add(new HashMap<String, Integer>() {{
           put("apple", 10);
           put("orange", 2);
           put("banana", 3);
       }});
       arrayOfFruits.add(new HashMap<String, Integer>() {{
           put("mango", 4);
           put("guava", 3);
           put("grapes", 9);
       }});
       arrayOfFruits.add(new HashMap<String, Integer>() {{
           put("papaya", 10);
           put("apple", 9);
           put("orange", 9);
       }});
       arrayOfFruits.add(new HashMap<String, Integer>() {{
           put("orange", 8);
           put("mango", 2);
           put("grapes", 3);
           put("customFruit", 9);
       }});

       HashMap<String, Integer> output = new HashMap<>();

       for (HashMap<String, Integer> fruitObject : arrayOfFruits) {
           for (Map.Entry<String, Integer> entry : fruitObject.entrySet()) {
               String fruit = entry.getKey();
               Integer count = entry.getValue();

               output.putIfAbsent(fruit, 0); 
               output.put(fruit, output.get(fruit) + count); 
           }
       }

       System.out.println(output);
   }
}
