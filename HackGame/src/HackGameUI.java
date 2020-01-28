import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class HackGameUI {
    private JPanel Panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JButton registerButton;

    // method for checking login and password
    // should check to make sure both are "admin" before opening the panel
    public HackGameUI() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String user = textField1.getText().toString();
                String pass = String.valueOf(passwordField1.getPassword());

                try {
                    if(user.equals("admin") && pass.equals("admin")) {
                        new HackGame();
                        HackGame.main();
                        System.out.println("you have been logged in as admin...");

                    }else System.out.println("wrong user name or password...");

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }


    // make the login form show up
    public static void main(String[] args) {
        JFrame frame = new JFrame("HackGameUI");
        frame.setContentPane(new HackGameUI().Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
