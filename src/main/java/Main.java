import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener
{
    JFrame frame = new JFrame("Sign in");

    //loginPanel
        JPanel loginPanel = new JPanel();
        JLabel jlLogin = new JLabel("Login");
        JTextField jtfLogin = new JTextField(8);
        JLabel jlPassword = new JLabel("Password");
        JPasswordField jpfPassword = new JPasswordField(8);
        JButton jbSignIn = new JButton("Sign in");
        JLabel jlImg = new JLabel();
        String login, password;

    //userPanel
        JPanel userPanel = new JPanel();
        JTabbedPane jtPane = new JTabbedPane();
        JPanel jpInfo = new JPanel();
        JPanel jpFreeDays = new JPanel();
        JTable jtCalendar = new JTable();

    public Main()
    {
        jlImg.setIcon(new ImageIcon("E:\\Java CLOUD\\workspace\\Workerprofile\\src\\main\\java\\logo.png"));

    //loginPanel Components
        loginPanel.setLayout(new MigLayout());
        loginPanel.add(jlImg);
        loginPanel.add(jlLogin);
        loginPanel.add(jtfLogin);
        loginPanel.add(jlPassword);
        loginPanel.add(jpfPassword);
        loginPanel.add(jbSignIn);

    //userPanel Components
        userPanel.setLayout(new BorderLayout());

        jtPane.add("Informations", jpInfo);
        jtPane.add("Plan holiday", jpFreeDays);

        userPanel.add(jtPane);
        jpInfo.add(jtCalendar);

    //ACTION LISTENERS
        jpfPassword.addActionListener(this);
        jbSignIn.addActionListener(this);

    //FRAME OPTIONS
        frame.add(loginPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        Object source = actionEvent.getSource();

        if (source == jbSignIn || source == jpfPassword)
        {
            login = jtfLogin.getText();
            password = jpfPassword.getText();
            if (ConnectDB.Login(login, password))
            {
                JOptionPane.showMessageDialog(null, "Welcome");
                loginPanel.setVisible(false);
                frame.setTitle("User Panel");
                frame.add(userPanel);
            }
            else JOptionPane.showMessageDialog(null,"Password or login wrong");
        }
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
               new Main();
            }
        });
    }
}
