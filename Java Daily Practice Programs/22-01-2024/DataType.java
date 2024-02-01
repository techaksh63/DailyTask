public class DataType {
    public static void main(String[] args){
       MyDataTypes Data = new MyDataTypes();
       System.out.println(Data.myByte);
       System.out.println(Data.myShort);
       System.out.println(Data.myInt);
       System.out.println(Data.myLong);
       System.out.println(Data.myFloat);
       System.out.println(Data.myDouble);
       System.out.println(Data.myBoolean);
       System.out.println(Data.myChar);
       System.out.println(Data.myInt2);
    }
}

class MyDataTypes{
    byte myByte = 120;
    short myShort = 10565;
    int myInt = 45646886;
    long myLong = 4768464654654546L;
    float myFloat = 15456.455f;
    double myDouble = 46546546.4654654d;
    boolean myBoolean = true;
    char myChar = 'A';
    final int myInt2 = 424685;
}