package ex.ex2;

public class ex2 {
    public static void main(String[] args) {
        ball micasa = new ball("yellow",2500,"Micasa");
        System.out.println("Micasa");
        System.out.println("Color: "+ micasa.getColor() + " Price: "+micasa.getPrice()+" Firm: "+micasa.getFirm());

    }

}
class ball{
    String color;
    int price;
    String firm;
    public ball(String color, int price,String firm){
        this.color=color;
        this.price=price;
        this.firm=firm;
    }
    public String getColor(){return color;}
    public int getPrice(){return price;}
    public String getFirm(){return firm;}

}
