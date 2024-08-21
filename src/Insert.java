import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/MM_Hospital";
        String USER = "root";
        String PASSWORD = "subashgnanavel@1805";

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            // Corrected query for inserting data into the Patient table
            String insertSQL = "INSERT INTO PATIENT (PatientId, Name, Age, Gender, Problem, Joining_date) VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement insertStatement = con.prepareStatement(insertSQL);
            insertStatement.setInt(1, 20245); // Id
            insertStatement.setString(2, "Subash"); // Name
            insertStatement.setInt(3, 21); // Age
            insertStatement.setString(4, "Male"); // Gender
            insertStatement.setString(5, "fever"); // Problem
            insertStatement.setString(6, "2024-08-21"); // Joining_date in proper format 'YYYY-MM-DD'

            insertStatement.executeUpdate();
            System.out.println("Insert operation completed successfully");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}

