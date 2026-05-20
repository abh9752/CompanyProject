package dao;

import java.util.List;

import entity.Member;

public interface MemberDao {
	//create
		void addMember(Member member);
		
		
		//read
		List<Member> login(String username,String password);//登入帳號密碼
		
		boolean checkUsername(String username);//檢查帳號是否重複
		//update
		
		
		
		//delete

}
