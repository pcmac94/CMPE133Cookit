import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class testing {

	public static String driver = "com.mysql.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost/explorecalifornia?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public static String username = "cs133";
	public static String password = "password123";
	
	
//	public static void main(String[] args) throws Exception {
//
//		getConnection();
//	}
	
	public static void main(String[]args) throws Exception{
		{
			try {
				
				Connection myConn = DriverManager.getConnection(url, username, password);
				
				Statement myStmt = myConn.createStatement();
				
				// Adding an entry to a table 	
//				String sql = "INSERT INTO explorers" + "(firstName, lastName)" + "VALUES ('Richard', 'Smith')";
//				
				// Updating an entry to a table
//				String sql = " UPDATE explorers " + "SET firstName = 'Richard' " + " WHERE explorerId = 1 ";
				
				// Deleting an entry from a table
//				String sql = "DELETE FROM explorers WHERE lastName = 'Smith' ";
				
//				myStmt.executeUpdate(sql);
	
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM states");
				
//				while(myRs.next()){
//					System.out.println(myRs.getString("firstName") + " " + myRs.getString("lastName"));
//				}
				myRs.next();
				System.out.println(myRs.getBlob("picture"));
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
//		return null;
//		
//		class GetBlob {
//			FileOutputStream image;
//			Connection con = null;
//			PreparedStatement pstmt = null;
//			Statement stmt= null;
//			ResultSet res = null;
//			StringBuffer query=null;
//			String driverName = "com.mysql.jdbc.Driver";
//			String url = "jdbc:mysql://localhost:3306/";;
//			String dbName = "register";
//			String userName = "root";
//			String password = "root";
//
//			public GetBlob(){
//			try{
//			Class.forName(driverName);
//			con = DriverManager.getConnection(url+dbName,userName,password);
//			stmt=con.createStatement();
//			ResultSet rs=stmt.executeQuery("select * from picture where image_id='3'");
//			if (rs.next()) {
//			Blob test=rs.getBlob("image");
//			InputStream x=test.getBinaryStream();
//			int size=x.available();
//			OutputStream out=new FileOutputStream("C:\\anu.jpg");
//			byte b[]= new byte[size];
//			x.read(b);
//			out.write(b);
//			}
//			}
//			catch(Exception e){
//			System.out.println("Exception :"+e);
//			}
//			finally{
//			try{
//			stmt.close();
//			con.close();
//			}
//			catch(Exception e){
//			System.out.println(e);
//			}
//			}
//			}
//
//			}
//
//		
//	}
}
}
	

