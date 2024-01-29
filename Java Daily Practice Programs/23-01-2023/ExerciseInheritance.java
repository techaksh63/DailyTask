import java.util.ArrayList;
import java.util.List;

public class ExerciseInheritance {
    public static void main(String[] args){
/*
        Animal animal = new Animal();
        System.out.println(animal.ShowInfo());

        Reptile reptile = new Reptile();
        System.out.println(reptile.showInfo());

        Crocodile crocodile = new Crocodile();
        System.out.println(crocodile.showInfo());

        Fish fish = new Fish();
        System.out.println(fish.showInfo());

        Eel eel = new Eel();
        System.out.println(eel.showInfo());

        Bird bird = new Bird();
        System.out.println(bird.showInfo());

        Eagle eagle = new Eagle();
        System.out.println(eagle.showInfo());
*/


        List<Animal> animals = new ArrayList<>();
        Animal animal = new Animal();
        Animal reptile = new Reptile();
        Animal crocodile = new Crocodile();
        Animal fish = new Fish();
        Animal eel = new Eel();
        Animal bird = new Bird();
        Animal eagle = new Eagle();

        animals.add(animal);
        animals.add(reptile);
        animals.add(crocodile);
        animals.add(fish);
        animals.add(eel);
        animals.add(bird);
        animals.add(eagle);
        listAnimals(animals);
     }
     public static void listAnimals(List<Animal> animals){
        for(Animal animal: animals){
            System.out.println(animal.showInfo());
        }
     }
}

class Animal{
    protected float heightInFeet;
    protected float weightInKilos;
    protected String animalType;
    protected String bloodType;

    public Animal(){
        this.heightInFeet = 0;
        this.weightInKilos = 0;
        this.animalType = "unknown";
        this.bloodType = "unknown";
    }

    public String showInfo(){
        return "Animal [HeightInFeet = "+heightInFeet+", WeightInKilos = "+weightInKilos+", AnimalType = "+animalType+", BloodType= "+bloodType+"]";
    }
}

class Reptile extends Animal{
    protected String skin, egg;
    protected boolean backbone;

    public Reptile(){
        heightInFeet = 5;
        weightInKilos = 20;
        animalType = "Reptile";
        bloodType = "Cold";
        this.skin = "Dry Skin";
        this.egg = "Soft shelled";
        this.backbone = true;
    }

    public String showInfo() {
        return "Reptile [Skin =" + skin + ", Egg =" + egg + ", Backbone =" + backbone
                + "HeightInFeet = "+heightInFeet+", WeightInKilos = "+weightInKilos+", AnimalType = "+animalType+", BloodType= "+bloodType+"]";
    }
}


class Fish extends Animal{
    protected boolean waterBone;
    protected boolean gills;

    public Fish(){
        animalType = "Fish";
        this.waterBone = true;
        this.gills = true;
    }
    public String showInfo() {
        return "Fish [WaterBone = " + waterBone + ", Gills = " + gills
                + "HeightInFeet = "+heightInFeet+", WeightInKilos = "+weightInKilos+", AnimalType = "+animalType+", BloodType= "+bloodType+"]";
    }
}

class Bird extends Animal{
    protected boolean feather;
    protected boolean canFly;

    public Bird(){
        this.feather = true;
        this.canFly = true;
    }
    public String showInfo() {
        return "Bird [Feather = " + feather + ", CanFly = " + canFly
                + "HeightInFeet = "+heightInFeet+", WeightInKilos = "+weightInKilos+", AnimalType = "+animalType+", BloodType= "+bloodType+"]";
    }
}

class Crocodile extends Reptile{
   public Crocodile(){
       super();
       egg = "Hard Shelled";
   }
    public String showInfo() {
        return "Crocodile [Skin = " + skin + ", Egg = " + egg + ", Backbone = " + backbone
                + "HeightInFeet = "+heightInFeet+", WeightInKilos = "+weightInKilos+", AnimalType = "+animalType+", BloodType= "+bloodType+"]";
    }
}

class Eel extends Fish{
    private String special;

    public Eel(){
        super();
        this.special = "Releases electric stock";
    }
    public String showInfo() {
        return "Eel [Special = " + special+", WaterBone = " + waterBone + ", Gills = " + gills
                + "HeightInFeet = "+heightInFeet+", WeightInKilos = "+weightInKilos+", AnimalType = "+animalType+", BloodType= "+bloodType+"]";
    }
}

class Eagle extends Bird{
    public String showInfo() {
        return "Eagle [Feather = " + feather + ", CanFly = " + canFly
                + "HeightInFeet = "+heightInFeet+", WeightInKilos = "+weightInKilos+", AnimalType = "+animalType+", BloodType= "+bloodType+"]";
    }
}