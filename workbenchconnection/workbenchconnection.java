package workbenchconnection;
import java.sql.Connection;
import java.sql.DriverManager;
public class workbenchconnection {
	
	public static void main(String[] args) {
		
		Connection con = null;
		try {
			con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sdpproject","root","JALAjnj@5752");
			
			if(con!=null) {
				System.out.println("Database is connected");
			}
			
		}catch (Exception e) {
			System.out.println("Not connected");
		}
		
		
	}

}
