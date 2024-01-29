public class While {
    public static void main(String[] args){
       WhileLoop WL = new WhileLoop();
       WL.loop();

       DoWhileLoop DWL = new DoWhileLoop();
       DWL.loop();
    }
}

class WhileLoop{
    int i = 0;
    void loop(){
        while (i<5){
            System.out.print(i);
            i++;
        }

    }
}


class DoWhileLoop{
    int j = 0;
    void loop(){
        do{
            System.out.print(j);
            j++;
        }
        while(j<7);
    }
}