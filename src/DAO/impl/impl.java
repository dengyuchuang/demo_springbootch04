package DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.infoDao;
import zy01.Demo01;

public class impl implements infoDao{

	@Override
	public int deleteuUser(int id) {
		Connection con=new Demo01().getcon();
		PreparedStatement ps=null;
		String sql="DELETE FROM info WHERE id=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return 0;
	}

	@Override
	public int addUser(String name) {
		Connection con=new Demo01().getcon();
		PreparedStatement ps=null;
		String sql="INSERT INTO info(id,NAME,age) VALUES(16,'Εν½ά',22)";
		return 0;
	}

}
