package ex3;

import javax.swing.*;
import java.awt.*;

public class ex3  extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("test");
                frame.setSize(800, 400);

                JLabel jLabel = new JLabel();
                Image image = Toolkit.getDefaultToolkit().createImage("C:\\Users\\Admin\\Documents\\вузовские файлы\\3 сем\\джава\\lesson 8\\src\\наруто.gif");
                ImageIcon imageIcon = new ImageIcon(image);
                imageIcon.setImageObserver(jLabel);
                jLabel.setIcon(imageIcon);

                frame.add(jLabel);

                frame.setVisible(true);
            }
        });
    }
}


