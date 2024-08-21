import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    // Static variables for database connection
    private static final String URL = "jdbc:mysql://localhost:3306/MM_Hospital";
    private static final String USER = "root"; 
    private static final String PASSWORD = "subashgnanavel@1805"; 

    public static void main(String[] args) {
        try {
            // Connection to the database
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            // Delete Operation SQL query based on L_Name
            String deleteSQL = "DELETE FROM Patient WHERE P_Name = ?";
            PreparedStatement deleteStatement = con.prepareStatement(deleteSQL);

            // Set the last name for the record to delete
            deleteStatement.setString(1, "Subash");  // Last name (L_Name)

            // Execute the delete operation
            int rowsDeleted = deleteStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Delete operation completed. Rows deleted: " + rowsDeleted);
            } else {
                System.out.println("No rows deleted. Check the provided last name.");
            }

        } catch (SQLException e) {
            System.out.println("Error during delete: " + e.getMessage());
        }
    }
}

