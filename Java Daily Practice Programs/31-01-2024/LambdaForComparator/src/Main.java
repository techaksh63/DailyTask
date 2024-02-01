import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Data> data = new ArrayList<>();
        data.add(new Data("Aksh"));
        data.add(new Data("Jay"));
        data.add(new Data("Yash"));
        data.add(new Data("Darshan"));
        data.add(new Data("Parth"));

        data.sort((Data d1, Data d2) -> d1.getName().compareTo(d2.getName()));
        for(Data data1 : data){
            System.out.println(data1.getName());
        }
        //for each loop using lambda expression
        data.forEach(temp->{
            System.out.println(temp.getName());
        });


        // Call by Method
        data.forEach(System.out::println);
    }
}