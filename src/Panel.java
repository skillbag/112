import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Panel extends JPanel {
   public void paintComponent (Graphics g) {
       g.setColor (Color.red);
       g.fillRect(20,50,100,100);
   }
}