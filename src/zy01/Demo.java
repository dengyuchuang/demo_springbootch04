package zy01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo {
	public static void main(String[] args) {	
		PreparedStatement pst=null;
		ResultSet rs=null;
		Demo01 demo=new Demo01();
		Connection con1=demo.getcon();
		try {
		
			String sql="SELECT id,name,age FROM info";
			pst=con1.prepareStatement(sql);
			rs= pst.executeQuery();
			int id=0;
			String name="";
			String age="";
			System.out.println("----------获取mysql数据表---------");
			while(rs.next()){
				id= rs.getInt("id");
				name= rs.getString("name");
				age= rs.getString("age");
				System.out.println(id+"\t"+name+"\t"+age);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			
		}
	}
}
