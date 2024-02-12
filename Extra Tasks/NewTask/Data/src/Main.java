import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Year> years = new ArrayList<>();

        for(int i=1;i<=12;i++){
            years.add(new Year(new Lenovo("i5",46),new Mac("i5",78),new HP("i5",18),i));
        }
        int HpTotal = 0;
        int LenovoTotal = 0;
        int MacTotal = 0;
        for(int j=1;j<=years.size()-1;j++){
           HpTotal = years.get(j).getHp().getQuantity() + HpTotal;
           LenovoTotal = years.get(j).getLenovo().getQuantity() + LenovoTotal;
           MacTotal = years.get(j).getMac().getQuantity() + MacTotal;
        }
        Output output = new Output(HpTotal,LenovoTotal,MacTotal);
        System.out.println(output);
    }
}