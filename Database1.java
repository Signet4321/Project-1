
package Project1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database1{

    Connection con = null;
    String user = "root";
    String password = "r";

    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Project1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",user,password);
        }
        catch(Exception e){
            System.out.println("Databse Error : "+e);
        }
        return con;
    }

    
}
