package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.PorderDao;
import entity.Porder;
import utils.DbConnection;

public class PorderDaoImpl implements PorderDao {

	public static void main(String[] args) {
		//Porder porder=new Porder("123",1,5,3);
		//new PorderDaoImpl().addPorder(porder);
		

	}
	Connection conn=DbConnection.getDb();
	@Override
	public void addPorder(Porder porder) {
		String sql="insert into porder(name,A,B,C) values(?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, porder.getName());
			ps.setInt(2, porder.getA());
			ps.setInt(3, porder.getB());
			ps.setInt(4, porder.getC());
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Porder> allPorder() {
		String sql="select * from porder";
		List<Porder> l=new ArrayList<>();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Porder porder=new Porder();
				porder.setId(rs.getInt("id"));
				porder.setA(rs.getInt("a"));
				porder.setB(rs.getInt("b"));
				porder.setC(rs.getInt("C"));
				l.add(porder);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
		
		
		
	}

	@Override
	public List<Porder> selectByName(String name) {
		String sql="select * from porder where name=?";
		List<Porder> l=new ArrayList<>();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Porder porder=new Porder();
				porder.setId(rs.getInt("id"));
				porder.setA(rs.getInt("a"));
				porder.setB(rs.getInt("b"));
				porder.setC(rs.getInt("C"));
				l.add(porder);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
		
		
		
		
		
	}

}
