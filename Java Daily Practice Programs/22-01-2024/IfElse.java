public class IfElse {
    public static void main(String[] args){
      IfStatement I1 = new IfStatement();
      IfElseStatement I2 = new IfElseStatement();
      IfElseLadderStatement I3 = new IfElseLadderStatement();
    }
}

class IfStatement{
    int a = 5;
    void IF(){
        if(a<10){
            System.out.print("Running the if Condition");
        }
    }
}

class IfElseStatement{
    int b = 45;
    void IfElse(){
        if(b>50){
            System.out.print("If statement is running");
        }
        else{
            System.out.print("Else statement is running");
        }
    }
}


class IfElseLadderStatement{
    int time = 22;
    void IfElseLadder(){
        if (time < 12) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good Afternoon.");
        } else {
            System.out.println("Good evening.");
        }

        //Ternary Operator
        String result = (time > 18) ? "Good Day" : "Good Evening";
    }
}