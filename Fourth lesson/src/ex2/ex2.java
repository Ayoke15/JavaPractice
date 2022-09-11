package ex2;

public class ex2 {
        public static void main(String[] args) {
            Shape s1 = new Circle(false, "RED", 5.5); // Upcast Circle to Shape
            System.out.println(s1); // which version?
            System.out.println(s1.getArea()); // which version?
            System.out.println(s1.getPerimeter()); // which version?
            System.out.println(s1.getColor());
            System.out.println(s1.isFilled());
            System.out.println(s1.getRadius());

            Circle c1 = (Circle) s1; // Downcast back to Circle
            System.out.println(c1);
            System.out.println(c1.getArea());
            System.out.println(c1.getPerimeter());
            System.out.println(c1.getColor());
            System.out.println(c1.isFilled());
            System.out.println(c1.getRadius());

            //Shape s2 = new Shape();

            Shape s3 = new Rectangle(false, "RED",2.0 , 1.0); // Upcast
            System.out.println(s3);
            System.out.println(s3.getArea());
            System.out.println(s3.getPerimeter());
            System.out.println(s3.getColor());
            System.out.println(s3.getLength());

            Rectangle r1 = (Rectangle) s3; // downcast
            System.out.println(r1);
            System.out.println(r1.getArea());
            System.out.println(r1.getColor());
            System.out.println(r1.getLength());

            Shape s4 = new Square(6.6); // Upcast
            System.out.println(s4);
            System.out.println(s4.getArea());
            System.out.println(s4.getColor());
            System.out.println(s4.getSide());


            // Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
            Rectangle r2 = (Rectangle) s4;
            System.out.println(r2);
            System.out.println(r2.getArea());
            System.out.println(r2.getColor());
            System.out.println(r2.getSide());
            System.out.println(r2.getLength());

            // Downcast Rectangle r2 to Square
            Square sq1 = (Square) r2;
            System.out.println(sq1);
            System.out.println(sq1.getArea());
            System.out.println(sq1.getColor());
            System.out.println(sq1.getSide());
            System.out.println(sq1.getLength());
        }
    }
    abstract class  Shape{
        protected String color;
        protected boolean filled;
        public Shape(){};
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
    class Circle extends Shape {
        double radius;
        public Circle(){};
        public Circle(double radius){
            this.radius=radius;
        }
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
    class Rectangle extends Shape {

        double width;
        double length;
        public Rectangle(){};
        public Rectangle(double wigth,double length){
            this.length=length;
            this.width=wigth;
        }

        public Rectangle(boolean filled,String color, double width,double height) {
            super(filled,color);
            this.width=width;
            this.length=length;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getPerimeter(){

            return width * 2 + length * 2;
        }

        public double getArea(){

            return width * length;
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "width=" + width +
                    ", height=" + length +
                    '}';
        }
    }
    class Square extends Shape {
        double Side;
        public Square(){};
        public Square(double Side){
            this.Side=Side;
        }
        public Square(boolean filled,String color, double Side) {
            super(filled,color);
            this.Side=Side;
        }

        public double getSide() {
            return Side;
        }

        @Override
        public void setColor(String color) {
            super.setColor(color);
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


