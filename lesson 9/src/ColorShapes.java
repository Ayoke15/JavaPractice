import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorShapes extends JFrame {
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
    public ColorShapes() {

        setSize(new Dimension(320, 320));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                JButton button = new JButton("Click me");
                button.setBounds(10, 10, 100, 50);
                button.addActionListener(new ListenerAction());
                add(button);
            }
        };

        setTitle("My Shapes");
        this.getContentPane().add(p);
    }
    class ListenerAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Graphics g = getGraphics();
            g.clearRect(0, 0, 320, 320);
            int r = (int) (Math.random() * 3);
            switch (r) {
                case 0:
                    g.setColor(Color.RED);
                    g.fillOval(100, 100, 50, 50);
                    break;
                case 1:
                    g.setColor(Color.BLUE);
                    g.fillRect(100, 100, 50, 50);
                    break;
                case 2:
                    g.setColor(Color.GREEN);
                    int[] x = {100, 150, 125};
                    int[] y = {100, 100, 150};
                    g.fillPolygon(x, y, 3);
                    break;
            }
        }
    }

    public static void main(String arg[]) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                new ColorShapes();
            }
        });
    }

}


