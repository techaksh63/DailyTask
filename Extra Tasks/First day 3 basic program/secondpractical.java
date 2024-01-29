public class secondpractical {
    public static void main(String[] args){
        String s1 = "There is bomb";
       // String s2 = "Hey, did  you think there is bomb?";
       // String s3 = "This goes boom";

        bomb b = new bomb();
      String output =  b.bombdetect(s1);
      System.out.println(output);

    }
}

class bomb{
      String bombdetect(String s1){
        if(s1.contains("bomb")){
           return "Duck!!!" ;
        }
        else{
            return "There is no bomb, relex" ;
        }
       
    }
}