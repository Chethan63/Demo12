package Sample1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Mainclass {
public static void main(String[] args) throws ClassNotFoundException, Exception {
	Scanner sc=new Scanner(System.in);
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","root");
	PreparedStatement pt =con.prepareStatement("insert into stu values(?,?,?)");
	pt.setInt(1, sc.nextInt());
	pt.setString(2, sc.next());
	pt.setInt(3, sc.nextInt());
	pt.execute();
	con.close();
	System.out.println("done");
	
}
}
