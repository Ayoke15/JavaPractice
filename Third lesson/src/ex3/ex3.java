package ex3;

public class ex3 {
    public static void main(String[] args) {
        Book Tales = new Book("Fairy Tales","Hans Christian","1850");
        System.out.println(" Name: "+ Tales.getName()+" Author: "+Tales.getAutor()+" Year: "+Tales.getNumber());
    }
}
class Book{
    String name;
    String autor;
    String number;
    public Book(String name,String autor,String number){
        this.autor=autor;
        this.name=name;
        this.number=number;
    }
    public String getName() {
        return name;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getNumber() {
        return number;
    }
    public void setName(String name) {
        this.name = name;
    }
}
