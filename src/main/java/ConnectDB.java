import java.sql.*;

public class ConnectDB
{
    public static void AddUser(String fName, String lName, String log, String pas, String sala, String fDay, String sDay)
    {
        String question = "INSERT INTO `workersdata` (`ID`, `First_name`, `Last_name`, `login`, `password`, `salary`, `free_days`, `sick_days`, `worked_hours`) VALUES (NULL, '"+fName+"', '"+lName+"', '"+log+"', '"+pas+"', '"+sala+"', '"+fDay+"', '"+sDay+"', '0');";
        String url = "jdbc:mysql://localhost/workersdb?useUnicode=true&characterEncoding=utf-8";
        String user = "root";
        String password = "";
        try
        {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            myStmt.executeUpdate(question);
            myConn.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static boolean Login(String user, String pass) {
        boolean b=false;
        try {
            if (user != null && pass != null) {
                String sql = "Select * from workersdata Where login='" + user + "' and password='" + pass + "'";
                Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/workersdb?useUnicode=true&characterEncoding=utf-8", "root", "");
                Statement myStmt = myConn.createStatement();
                ResultSet rs = myStmt.executeQuery(sql);
                if (rs.next()) {
                    System.out.println("Zalogowano!");
                    b = true;
                } else {
                    System.out.println("Błędny login lub hasło!");
                    b = false;
                }
            }
        } catch (SQLException err) {
            err.printStackTrace();
        }
    return b;
    }
}
