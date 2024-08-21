import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/MM_Hospital";
        String USER = "root";
        String PASSWORD = "subashgnanavel@1805";

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            // Read Operation
            String selectSQL = "SELECT * FROM Patient";
            Statement selectStatement = con.createStatement();
            ResultSet resultSet = selectStatement.executeQuery(selectSQL);

            System.out.println("Read operation results:");
            while (resultSet.next()) {
                // Corrected column names to match your table schema
                System.out.println("PatientId: " + resultSet.getInt("PatientId") 
                    + ", Name: " + resultSet.getString("Name") 
                    + ", Age: " + resultSet.getInt("Age")
                    + ", Gender: " + resultSet.getString("Gender") 
                    + ", Problem: " + resultSet.getString("Problem") 
                    + ", OP Joining Date: " + resultSet.getDate("Joining_date"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}

