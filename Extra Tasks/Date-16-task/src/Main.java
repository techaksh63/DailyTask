import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input= sc.next();

        Map<String, String> mainMaps = new LinkedHashMap<>();


        String[] arr = input.split(";");
        for(String s : arr){
            Map<String, String> maps = new LinkedHashMap<>();


            String kept = s.substring( 0, s.indexOf(":"));
            String remainder = s.substring(s.indexOf(":")+1);
         mainMaps.put(kept,remainder);

//            System.out.println("Key :"+kept);
//            System.out.println("Values :"+remainder);

            remainder = remainder.replaceAll("[\\[\\]]", "");
            String[] sub = remainder.split(",");

            for(int k = 0; k<sub.length; k++){
                int colonIndex = sub[k].indexOf(":");
                if (colonIndex != -1) {
                    String kepts = sub[k].substring(0, colonIndex);
                    String remainders = sub[k].substring(colonIndex + 1);

//                System.out.println("sub key: "+kepts);
//                System.out.println("sub values: "+remainders);

                    maps.put(kepts,remainders);
                    mainMaps.replace(kept, maps.toString());
                }
            }


        }
        LocalDate date = LocalDate.of(Integer.valueOf(mainMaps.get("year")), Integer.valueOf(mainMaps.get("month")), Integer.valueOf(mainMaps.get("day")));
        date = date.plusDays(Integer.valueOf(mainMaps.get("duration")));
        mainMaps.remove("day");
        mainMaps.remove("month");
        mainMaps.remove("year");
        mainMaps.remove("duration");
        mainMaps.put("date",String.valueOf(date));
        System.out.println(mainMaps);


//        Map<String, String> mainMap = new LinkedHashMap<>();
//        Map<String, String> map = new LinkedHashMap<>();
//        input = input.replaceAll("[\\[\\];,:]", " ");
//        input = input.replaceAll("  ", " ");
//
//        String[] arr = input.split(" ");
//
//        for(int i = 1;i<arr.length;i++){
//            map.put(arr[i], arr[i+1]);
//            i++;
//        }


//        LocalDate date = LocalDate.of(Integer.valueOf(map.get("year")), Integer.valueOf(map.get("month")), Integer.valueOf(map.get("day")));
//        date = date.plusDays(Integer.valueOf(map.get("duration")));
//        map.remove("day");
//        map.remove("month");
//        map.remove("year");
//        map.remove("duration");
//        String values =  String.valueOf(map);
//        mainMap.put(arr[0], values);
//        mainMap.put("date",String.valueOf(date));
//        System.out.println(mainMap);
    }

}













