import java.time.LocalDate;
import java.util.Scanner;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Main {
  public static void main(String[] args) {
    LocalDate myObj1 = LocalDate.now();
    System.out.println("---------------------------------------------------");
    System.out.println("EpikApp. MobizLTD v1.0 Rev 3. " + myObj1);
    System.out.println("---------------------------------------------------");

    ImageIcon image = new ImageIcon("halal.jpg");

    JLabel label = new JLabel();
    label.setText("Stay Halal Brother");
    label.setIcon(image);
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.TOP);

    JFrame frame = new JFrame();
    frame.setTitle("EpikApp");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000,600);
    frame.setVisible(true);
    frame.add(label);
  }
}
