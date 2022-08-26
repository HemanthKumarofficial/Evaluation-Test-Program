package Task;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test{   
        
        public static void main(String[] args)throws ClassNotFoundException{
	        	all();
	        	delete();
	        	
    
		}
        
        public static void all() throws ClassNotFoundException {
        	try {
	        	Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.0.155:3306/employeedb", "dbboy", "challenge");
				String sql = "Select * from employees";
				PreparedStatement ps = connection.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					System.out.println( rs.getString(1)+" "+rs.getString(2)+" "+
							rs.getString(3)+" | "+rs.getString(4)+" | "
							+ ""+ rs.getString(5)+" | "+rs.getString(6)+" | "
							+rs.getString(7)+" | "+rs.getString(8)+" | "+rs.getString(9)+" | "+rs.getString(10));
				}
        	}
        	catch(SQLException e){
        		e.printStackTrace();
        	}
        }
        
        public static void delete() throws ClassNotFoundException {
        	try {
	        	Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.0.155:3306/employeedb", "dbboy", "challenge");
				String dsql = "delete * from employees = 208";
				PreparedStatement ps = connection.prepareStatement(dsql);
				ResultSet rs = ps.executeQuery();
				all();
        	}
        	catch(SQLException e){
        		e.printStackTrace();
        	}
        }
               
}
 