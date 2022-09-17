package ex1;

public class ex1 {
    public static void main(String[] args) {
        Cup cup = new Cup("Cup", 100, "Red");
        System.out.println(cup);
        Plate plate = new Plate("Plate", 200, "Blue");
        System.out.println(plate);
    }

}

class Dish {
    String Form;
    public Dish(String Form){
        this.Form=Form;
    }

    public String getForm() {
        return Form;
    }

    public void setForm(String form) {
        this.Form = form;
    }
}
class Cup extends Dish{
    int Price;
    String Color;
    public Cup(String Form,int Price,String Color){
        super(Form);
        this.Price=Price;
        this.Color=Color;
    }

    public int getPrice() {
        return Price;
    }

    public String getColor() {
        return Color;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "Price=" + Price +
                ", Color='" + Color + '\'' +
                ", Form='" + Form + '\'' +
                '}';
    }
}
class Plate extends Dish {
    int Price;
    String Color;
    public Plate(String Form,int Price,String Color){
        super(Form);
        this.Price=Price;
        this.Color=Color;
    }

    public int getPrice() {
        return Price;
    }

    public String getColor() {
        return Color;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "Price=" + Price +
                ", Color='" + Color + '\'' +
                ", Form='" + Form + '\'' +
                '}';
    }
}
