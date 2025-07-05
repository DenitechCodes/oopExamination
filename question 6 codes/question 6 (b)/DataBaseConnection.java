// File: DBConnection.java
import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
    private static final String DB_URL = "jdbc:ucanaccess://C:/Users/DXB GADGETS/Desktop/OOP Exam/question 6 codes/question 6 (b)/VUE_Exhibition.accdb";
    
    public static Connection getConnection() throws Exception {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        return DriverManager.getConnection(DB_URL);
    }
}