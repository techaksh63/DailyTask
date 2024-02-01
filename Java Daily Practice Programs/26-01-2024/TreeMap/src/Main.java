import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code> {
    private final String season;
    private final String lecture;

    public Code(String season, String lecture) {
        this.season = season;
        this.lecture = lecture;
    }

    public String getSeason() {
        return season;
    }

    public String getLecture() {
        return lecture;
    }

    @Override
    public String toString() {
        return "{" +
                "season='" + season + '\'' +
                ", lecture='" + lecture + '\'' +
                '}';
    }

    @Override
    public int compareTo(Code code) {
        String code1 = season.concat(lecture);
        String code2 = code.getSeason()+code.getLecture();
        return code1.compareTo(code2);
    }
}


public class Main {
    public static void main(String[] args) {

        Map<Code, String> map = new TreeMap<>();
        map.put(new Code("S01", "L03"), "OOPS");
        map.put(new Code("S04", "L02"), "File Handling");
        map.put(new Code("S01", "L03"), "Basic Java");
        map.put(new Code("S03", "L01"), "Nik");

        for (Map.Entry<Code, String> entry: map.entrySet()){
            System.out.println("Key : "+ entry.getKey()+ ",  Value : "+ entry.getValue());
        }

        System.out.println("Search by it's value");
        Code code = null;
        for(Map.Entry<Code, String > entry: map.entrySet()){
            if (entry.getValue().equals("Nik")){
                code = entry.getKey();
            }
        }
        System.out.println("The key of the value Nik is : "+ code);
    }
}