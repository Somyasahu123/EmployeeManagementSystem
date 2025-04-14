package employee.management.system;
import java.sql.*;

public class Conn {
        Connection c;
        Statement s;
        
   public Conn(){
       try{
           Class.forName("com.mysql.cj.jdbc.Driver"); //1st Step of JDBC Connectivity.
           c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "mysql123");//2nd step 
           s = c.createStatement();//3rd step : Connection string ki help se statement ko likhna hota hai 
       }catch(Exception e){
           e.printStackTrace();
       }
   } 
}
