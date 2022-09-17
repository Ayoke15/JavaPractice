package ex1_2;

import javax.swing.*;
import java.awt.*;


public class ex1_2 extends JFrame {

    private static final long serialVersionUID = 1L;
    abstract class Shape {
        int x, y;
        Color color;
        public Shape(int x, int y, Color color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }
    }
    class Circle extends Shape {
        int radius;
        public Circle(int x, int y, Color color, int radius) {
            super(x, y, color);
            this.radius = radius;
        }
    }
    class Rectangle extends Shape {
        int width, height;
        public Rectangle(int x, int y, Color color, int width, int height) {
            super(x, y, color);
            this.width = width;
            this.height = height;
        }
    }
    class Triangle extends Shape {
        int width, height;
        public Triangle(int x, int y, Color color, int width, int height) {
            super(x, y, color);
            this.width = width;
            this.height = height;
        }
    }
    public ex1_2() {

        setSize(new Dimension(320, 320));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                Shape[] shapes = new Shape[20];
                for (int i = 0; i < 5; i++) {
                    shapes[i] = new Rectangle(50, 30, Color.RED, 50, 50 );
                }
                for (int i = 5; i < 10; i++) {
                    shapes[i] = new Circle(50, 30, Color.BLUE, 50 );
                }
                for (int i = 10; i < 20; i++) {
                    shapes[i] = new Triangle(50, 30, Color.GREEN, 50 , 50 );
                }
                for (int i = 0; i < shapes.length; i++) {
                    int j = (int) (Math.random() * shapes.length);
                    Shape temp = shapes[i];
                    shapes[i] = shapes[j];
                    shapes[j] = temp;
                }
                for (int i = 0; i < 20; i++) {
                    if (shapes[i] instanceof Rectangle) {
                        Rectangle r = (Rectangle) shapes[i];
                        g2.setColor(new Color((int) (Math.random() * 0x1000000)));
                        g2.fillRect(r.x + (i * 50), r.y, r.width, r.height);
                    }
                    if (shapes[i] instanceof Circle) {
                        Circle c = (Circle) shapes[i];
                        g2.setColor(new Color((int) (Math.random() * 0x1000000)));
                        g2.fillOval(c.x + (i * 50), c.y, c.radius, c.radius);
                    }
                    if (shapes[i] instanceof Triangle) {
                        Triangle t = (Triangle) shapes[i];
                        g2.setColor(new Color((int) (Math.random() * 0x1000000)));
                        g2.fillPolygon(new int[] {t.x + (i * 50), t.x + (i * 50) + t.width, t.x + (i * 50) + t.width / 2}, new int[] {t.y, t.y, t.y + t.height}, 3);
                    }
                }
            }
        };
        setTitle("My Shapes");
        this.getContentPane().add(p);
    }

    public static void main(String arg[]) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                new ex1_2();
            }
        });
    }

}




