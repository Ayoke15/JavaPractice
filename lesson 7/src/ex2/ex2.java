package ex2;

public class ex2 {
    public static void main(String[] args) {
        Corgi corgi = new Corgi("Corgi", 10, "Adult Dog","Brown","Candy");
        System.out.println(corgi);
        //create test for cass husky
        Husky husky = new Husky("Husky", 20, "Puppy","White","Bobik");
        System.out.println(husky);
    }

}
 class Dog{
    String breed;
    int Age;
    public Dog(String breed,int Age){
        this.breed=breed;
    }

    public String getBreed() {
        return breed;
    }
    public int humanAge(int Age){
        return Age*7;
    }

}
class Corgi extends Dog{
    String Size;
    String Color;
    String Name;
    public Corgi(String breed,int Age,String Size,String Color,String Name){
        super(breed,Age);
        this.Size = Size;
        this.Age=Age;
        this.Color=Color;
        this.Name=Name;

    }
    public String getColor() {
        return Color;
    }

    public String getName() {
        return Name;
    }

    public String getSize() {
        return Size;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSize(String size) {
        Size = size;
    }

    @Override
    public String toString() {
        return "Corgi{" +
                "Size='" + Size + '\'' +
                ", Color='" + Color + '\'' +
                ", Name='" + Name + '\'' +
                ", breed='" + breed + '\'' +
                ", Age=" + Age +
                '}';
    }
}
class Husky extends Dog{
    String Size;
    String Color;
    String Name;
    public Husky(String breed,int Age,String Size,String Color,String Name){
        super(breed,Age);
        this.Size = Size;
        this.Age=Age;
        this.Color=Color;
        this.Name=Name;

    }
    public String getColor() {
        return Color;
    }

    public String getName() {
        return Name;
    }

    public String getSize() {
        return Size;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSize(String size) {
        Size = size;
    }

    @Override
    public String toString() {
        return "Husky{" +
                "Size='" + Size + '\'' +
                ", Color='" + Color + '\'' +
                ", Name='" + Name + '\'' +
                ", breed='" + breed + '\'' +
                ", Age=" + Age +
                '}';
    }
}

