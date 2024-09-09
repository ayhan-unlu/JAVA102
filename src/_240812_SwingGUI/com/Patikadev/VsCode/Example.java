package _240812_SwingGUI.com.Patikadev.VsCode;

import javax.swing.*;
import java.awt.Toolkit;

public class Example extends JFrame {

    private JPanel wrapper = new JPanel();

    public Example() {
        // this.add(wrapper);
        setContentPane(wrapper);
        setSize(400, 400);
        setTitle("Application Name");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        int x=(int)(Toolkit.getDefaultToolkit().getScreenSize().width-getSize().getWidth())/2;
        int y=(int)(Toolkit.getDefaultToolkit().getScreenSize().height-getSize().getHeight())/2;
        setLocation(x,y);
        setVisible(true);
    }

    /*
     * public static void main(String[] args) {
     * JFrame frame = new JFrame("Example");
     * frame.setContentPane(new Example().wrapper);
     * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     * frame.pack();
     * frame.setVisible(true);
     * 
     * }
     */
}
