package _241208.com.patikadev.IntelliJ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  Example extends JFrame{
    private JPanel wrapper;
    private JPanel wtop;
    private JPanel wbuttom;
    private JTextField field_username;
    private JPasswordField field_password;
    private JButton button_login;

    public Example(){

        for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
            System.out.println(info.getName()+" ==> "+info.getClassName() );
            if("Nimbus".equals(info.getName())){
                try {
//                    UIManager.setLookAndFeel(info.getClassName());
                    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                         UnsupportedLookAndFeelException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        //this.add(wrapper);
        setContentPane(wrapper);
        setSize(400,300);
        setTitle("Application Name");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        int x= (Toolkit.getDefaultToolkit().getScreenSize().width-getSize().width)/2;
        int y= (Toolkit.getDefaultToolkit().getScreenSize().height-getSize().height)/2;
        setLocation(x,y);
        setVisible(true);

        button_login.addActionListener(e-> {

            if(field_username.getText().length()==0||field_password.getText().length()==0){
                JOptionPane.showMessageDialog(null,"Please fill both fields.","Error",JOptionPane.INFORMATION_MESSAGE);
            }
//            System.out.println(field_username.getText());
/*        button_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Log in button is clicked. ");

            }
  */      });
    }

}
