package ex.ex3;

public class ex3 {
        public static void main(String[] args) {
            book Tales = new book("black",700,"Fairy Tales");
            System.out.println("Tales");
            System.out.println("Color: "+ Tales.getColor() + " Price: "+ Tales.getPrice()+" Firm: "+ Tales.getName());

        }

    }
    class book{
        String color;
        int price;
        String name;
        public book(String color, int price,String name){
            this.color=color;
            this.price=price;
            this.name=name;
        }
        public String getColor(){return color;}
        public int getPrice(){return price;}
        public String getName(){return name;}

    }


