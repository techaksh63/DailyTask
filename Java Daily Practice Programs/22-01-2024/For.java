public class For {
    public static void main(String[] args){
       ForLoop FL = new ForLoop();
       FL.loop();

       ForEachLoop FEL = new ForEachLoop();
       FEL.loop();
    }
}

class ForLoop{
    void loop(){
        for(int i=0; i<8; i++){
            System.out.print(i);
        }
    }
}


class ForEachLoop{
    String[] Car = {"Ford", "Volvo", "BMW", "Jeep", "Audi"};
    void loop(){
       for (String s : Car){
           System.out.print(" "+s);
       }
    }
}