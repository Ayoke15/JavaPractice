package ex.ex4;

public class ex4 {
    public static void main(String[] args) {
        dog Doge = new dog("Bobik", 5);
        Doge.ToString();
    }
}
class dog{
    String name;
    int age;
    int i=0;
    public dog(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i=i;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int humanAge(){
        return age*7;
    }
    public void ToString(){
        System.out.println(" Name: "+name+" Age: "+age);
    }
}
