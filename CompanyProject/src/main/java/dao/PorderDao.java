package dao;

import java.util.List;

import entity.Porder;

public interface PorderDao {
	
	//create
		void addPorder(Porder porder);
		//read-->列印報表
		List<Porder> allPorder();
		List<Porder> selectByName(String name);
		
		//update
		
		//delete

}
