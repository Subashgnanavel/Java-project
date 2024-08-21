import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update1 {
    // Make these variables static so they can be accessed in the static main method
    private static final String URL = "jdbc:mysql://localhost:3306/Students";
    private static final String USER = "root"; 
    private static final String PASSWORD = "subashgnanavel@1805"; 

    public static void main(String[] upd) {
        try {
            // Connection to the database
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            // Update Operation - Corrected SQL query
            String updateSQL = "UPDATE Patient SET Problem = ? WHERE Age = ? AND Gender = ?";
            PreparedStatement updateStatement = con.prepareStatement(updateSQL);

            updateStatement.setString(1, "Fever"); // New Problem
            updateStatement.setINT(2, "22");  // Age
            updateStatement.setString(3, "Male");  // Gender

            // Execute the update
            int rowsUpdated = updateStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Update operation completed. Rows updated: " + rowsUpdated);
            } else {
                System.out.println("No rows updated. Check the provided names.");
            }

        } catch (SQLException e) {
            System.out.println("Error during update: " + e.getMessage());
        }
    }
}

