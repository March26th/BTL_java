package quanlykhomaytinh;

import java.sql.*;
import javax.swing.*;

public class JavaConnect {

    public static String url = "jdbc:sqlserver://DESKTOP-KMNS09Q\\SQLEXPRESS:1433;databaseName=QLMT;encrypt=true;trustServerCertificate=true;";    ;
 public static String user = "sa";
    public static String pass = "123456";

    public static Connection ConnectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, user, pass);
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Kết Nối Thất Bại" + e);
            return null;
        }
    }
}
