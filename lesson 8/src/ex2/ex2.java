package ex2;



import javax.swing.*;
import java.awt.*;


public class ex2 extends JFrame {
    public ex2() {
        setSize(new Dimension(320, 320));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.drawImage(new ImageIcon("C:\\Users\\Admin\\Documents\\вузовские файлы\\3 сем\\джава\\lesson 8\\src\\кот.jpg").getImage(), 0, 0, null);
            }
        };
        add(p);
    }
    public static void main(String[] args) {
        new ex2();
    }
}



