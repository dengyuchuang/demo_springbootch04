package zy01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo01 {
	public  String DriverName="com.mysql.jdbc.Driver";
	public String url="jdbc:mysql://localhost:3306/my_db";
	public  String usrname="root";
	public  String  pwd="root";
	
	public  Connection getcon(){
		Connection con=null;//声明1个通道
		try {
			Class.forName(DriverName);
		 return DriverManager.getConnection(url,usrname,pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	} 
	
	
	
 
}
