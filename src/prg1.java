import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Prg1 {
    public static void main(String[] sgd){
        String URL="jdbc:mysql://localhost:3306/MM_Hospital";
        String USER="root";
        String PASSWORD="subashgnanavel@1805";
        try{
            Connection con=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Success");
            Statement selectStatement=con.createStatement();
            //create table
            String createTableSQL="CREATE  TABLE PATIENT("
+"PatientId INT AUTO_INCREMENT PRIMARY KEY,"
+"P_Name VARCHAR(20) NOT NULL,"
+"Age INT NOT NULL,"
+"Gender VARCHAR(15)NOT NULL,"
+"Problem VARCHAR(50)NOT NULL,"
+"OP_date DATE NOT NULL"+")";
selectStatement.executeUpdate(createTableSQL);
System.out.println("Table created successfully");

        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}