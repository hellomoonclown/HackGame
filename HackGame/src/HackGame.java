import javax.swing.*;

public class HackGame {
    private JPanel Panel1;
    private JTabbedPane tabbedPane1;
    private JTextField textField1;
    private JButton sendButton;

    public static void main() {
        JFrame frame = new JFrame("HackGame");
        frame.setContentPane(new HackGame().Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
