public class Encapsulation {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setPrice(30);    //Data is not direct access but it through some behaviour
        System.out.println(l1.getPrice());

    }
}

class Laptop{
    public String Name;          //Public access modifier which allow this property to be access form anywhere
    protected String brand;     //Protected property access by only class and children of that class
    private int price;          //Private property access within this same class only

    public Laptop(){
        this.Name = "Gaming";
        this.brand = "HP";
        this.price = 30000;
    }
    public Laptop(String Name, String brand, int price){
        this.Name = Name;
        this.brand = brand;
        this.price = price;
    }
   public boolean setPrice(int price){      //Getter and Setter method are use in data hiding
        //is the user is Admin
        if (price > 20 && price <80){
            this.price = price;
            return true;
        }
           return false;
   }

   public int getPrice(){
       return price;
   }
}