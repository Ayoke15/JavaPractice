package ex3;

public class ex3 {
    public static void main(String[] args) {
        Chair chair = new Chair("Chair", 100, "Red", "WOOD");
        System.out.println(chair);
        Table table = new Table("Table", 200, "Blue", "TabAbe",4);
        System.out.println(table);
        FurnitureShop furnitureShop = new FurnitureShop("FurnitureShop", 30, 55, 85);
        System.out.println(furnitureShop);
    }

}
abstract class Furniture{
    protected String Form;
    public Furniture(String Form){
        this.Form=Form;
    }

    public String getForm() {
        return Form;
    }

    public void setForm(String form) {
        this.Form = form;
    }
}
class Chair extends Furniture{
    int Price;
    String Color;
    String Firm;
    public Chair(String Form,int Price, String Color, String Firm){
        super(Form);
        this.Price=Price;
        this.Color=Color;
        this.Firm=Firm;
    }

    public String getColor() {
        return Color;
    }

    public int getPrice() {
        return Price;
    }

    public String getFirm() {
        return Firm;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setFirm(String firm) {
        Firm = firm;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "Price=" + Price +
                ", Color='" + Color + '\'' +
                ", Firm='" + Firm + '\'' +
                ", Form='" + Form + '\'' +
                '}';
    }
}
class Table extends Furniture{
    int Price;
    String Color;
    String Firm;
    int TableLeg;
    public Table(String Form,int Price, String Color, String Firm,int TableLeg){
        super(Form);
        this.Price=Price;
        this.Color=Color;
        this.Firm=Firm;
        this.TableLeg=TableLeg;
    }

    public String getColor() {
        return Color;
    }

    public int getPrice() {
        return Price;
    }

    public String getFirm() {
        return Firm;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setFirm(String firm) {
        Firm = firm;
    }

    public int getTableLeg() {
        return TableLeg;
    }

    public void setTableLeg(int tableLeg) {
        TableLeg = tableLeg;
    }

    @Override
    public String toString() {
        return "Table{" +
                "Price=" + Price +
                ", Color='" + Color + '\'' +
                ", Firm='" + Firm + '\'' +
                ", TableLeg=" + TableLeg +
                ", Form='" + Form + '\'' +
                '}';
    }
}
class FurnitureShop{
    String name;
    int NumCh;
    int NumTa;
    int SumNum;
    public FurnitureShop(String name, int NumCh,int NumTa,int SumNum){
        this.name=name;
        this.NumCh=NumCh;
        this.NumTa=NumTa;
        this.SumNum=SumNum;
    }

    public String getName() {
        return name;
    }

    public int getNumCh() {
        return NumCh;
    }

    public int getNumTa() {
        return NumTa;
    }

    public int getSumNum() {
        return SumNum;
    }

    public void Info(){
        System.out.println(getName());
        System.out.println("Items: "+getSumNum());
        System.out.println("Chair: "+getNumCh());
        System.out.println("Table: "+getNumTa());
    }
    @Override
    public String toString() {
        return "FurnitureShop{" +
                "name='" + name + '\'' +
                ", NumCh=" + NumCh +
                ", NumTa=" + NumTa +
                ", SumNum=" + SumNum +
                '}';
    }
}
