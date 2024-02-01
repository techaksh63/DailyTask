public class Strings {
    public static void main(String[] args){
      Str S = new Str();
      S.string();
    }
}

class Str{
    String st = "Hello";
    String st1 = "World";

    void string(){
        System.out.println(st);

        //String Length
        System.out.println("The length of String is "+ st.length());

        //UpperCase
        System.out.println(st.toUpperCase());

        //LowerCase
        System.out.println(st.toLowerCase());

        //find character in string
        System.out.println(st.indexOf('l'));

        //Concat String
        System.out.println(st.concat(st1));

    }
}