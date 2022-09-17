package ex1;

public class ex1 {
    public static void main(String[] args) {
        Shape s1 = new Circle(false, "RED", 5.5);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());


        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());


        Shape s3 = new Rectangle(false, "RED",2.0 , 1.0);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());


        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());



    }
}
abstract class  Shape{
    protected String color;
    protected boolean filled;
    public Shape(){
    }
    public Shape(boolean filled,String color){
        this.color = color;
        this.filled=filled;
    }
    public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }
        public abstract double getArea();
        public abstract double getPerimeter();
    }
    class Circle extends Shape{
        double radius;

        public Circle(boolean filled,String color,double radius) {
            super(filled,color);
            this.radius=radius;
        }

        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return 3.14*radius*radius;
        }

        @Override
        public double getPerimeter() {
            return 2*3.14*radius;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "radius=" + radius +
                    '}';
        }
    }
    class Rectangle extends Shape{

        double width;
        double height;

        public Rectangle(boolean filled,String color, double width,double height) {
            super(filled,color);
            this.width=width;
            this.height=height;
        }
        @Override
        public String getColor() {
            return super.getColor();
        }

        @Override
        public void setColor(String color) {
            super.setColor(color);
        }

        public double getPerimeter(){

            return width * 2 + height * 2;
        }

        public double getArea(){

            return width * height;
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "width=" + width +
                    ", height=" + height +
                    '}';
        }
    }
    class Square extends Shape{
        double Side;
        public Square(double Side) {

            this.Side=Side;
        }
        public Square(double Side,boolean filled,String color) {
            super(filled,color);
            this.Side=Side;
        }

        public double getSide() {
            return Side;
        }

        @Override
        public double getPerimeter() {
            return Side*4;
        }

        @Override
        public double getArea() {
            return Side*Side;
        }

        @Override
        public String toString() {
            return "Square{" +
                    "Side=" + Side +
                    '}';
        }
    }
