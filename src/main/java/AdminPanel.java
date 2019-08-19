import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPanel extends JFrame implements ActionListener
{
    JFrame frame = new JFrame("Add user");
    JPanel panel = new JPanel();

    JLabel lFirstName = new JLabel("First name"); JTextField tfFirstName = new JTextField(8);
    JLabel lLastName = new JLabel("Last name");   JTextField tfLastName = new JTextField(8);
    JLabel lLogin = new JLabel("Login");          JTextField tfLogin = new JTextField(8);
    JLabel lPassword = new JLabel("Password");    JTextField tfPassword = new JTextField(8);
    JLabel lSalary = new JLabel("Salary");        JTextField tfSalary = new JTextField(8);
    JLabel lFreeDays = new JLabel("Free days");   JTextField tfFreeDays = new JTextField(8);
    JLabel lSickDays = new JLabel("Sick days");   JTextField tfSickDays = new JTextField(8);

    JButton bAdd = new JButton("Add worker");

    public AdminPanel()
    {
        panel.setLayout(new MigLayout());

    //ADD COMPONENTS
        panel.add(lFirstName);
        panel.add(tfFirstName, "wrap");
        panel.add(lLastName);
        panel.add(tfLastName,"wrap");
        panel.add(lLogin);
        panel.add(tfLogin,"wrap");
        panel.add(lPassword);
        panel.add(tfPassword,"wrap");
        panel.add(lSalary);
        panel.add(tfSalary,"wrap");
        panel.add(lFreeDays);
        panel.add(tfFreeDays,"wrap");
        panel.add(lSickDays);
        panel.add(tfSickDays,"wrap");
        panel.add(bAdd);

    //ACTION LISTENERS
        bAdd.addActionListener(this);

    //FRAME OPTIONS
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new AdminPanel();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        Object source = actionEvent.getSource();
        if (source==bAdd)
        {
            String fName = tfFirstName.getText();
            String lName = tfLastName.getText();
            String Login = tfLogin.getText();
            String Password = tfPassword.getText();
            String Salary = tfSalary.getText();
            String fDays = tfFreeDays.getText();
            String sDays = tfSickDays.getText();

            int odp = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm worker", JOptionPane.YES_NO_OPTION);
            if (odp == JOptionPane.YES_OPTION) ConnectDB.AddUser(fName, lName, Login, Password, Salary, fDays, sDays);
        }
    }
}
