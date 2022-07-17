import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Button implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        Button button = new Button();
        button.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("fack me");
        button.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        button.setText("Deep fack me");
    }


}
