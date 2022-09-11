package ex2;


public class ex2 {
    public static void main(String[] args) {
        Human Tom = new Human("Tom",25);
        Head Brown = new Head("Brown","Blue");
        Leg Right = new Leg("Right", 39);
        Hand RightH = new Hand("Necklace","silver ring");
        System.out.println(Tom.getName() + "Age: "+ Tom.getAge() );
        System.out.println(Brown.getColor()+"Eyecolor: "+Brown.getEyecolor());
        System.out.println(Right.getName()+"Number: "+Right.getNumber());
        System.out.println(RightH.getDecorations()+"Rings : "+RightH.getRings());
    }
}
class Human{
    String name;
    int age;
    public Human(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Head{
    String color;
    String eyecolor;
    public Head(String color,String eyecolor){
        this.color=color;
        this.eyecolor=eyecolor;
    }
    public String getColor() {
        return color;
    }
    public String getEyecolor() {
        return eyecolor;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setEyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
    }
}
class Leg{
    String name;
    int number;
    public Leg(String name,int number){
        this.name=name;
        this.number=number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
class Hand{
    String decorations;
    String rings;
    public Hand(String decorations,String rings){
        this.decorations=decorations;
        this.rings=rings;
    }
    public String getDecorations() {
        return decorations;
    }
    public String getRings() {
        return rings;
    }
    public void setDecorations(String decorations) {
        this.decorations = decorations;
    }
    public void setRings(String rings) {
        this.rings = rings;
    }
}