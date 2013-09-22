package kz.sayan.service;

import java.util.HashMap;

import kz.sayan.entity.User;

public class LoginService {
	
	HashMap< String , String> map = new HashMap<String, String>();
	
	public LoginService(){
		map.put("1", "Sayan");
		map.put("2", "Muha");
		map.put("3", "Manar");
	}

	public boolean authenticate(String login, String password){
		if(password==null || password.trim()==""){
			return false;
		}
		
		return true;
	}
	
	public User getUser(String id){
		User user = new User();
		user.setUserName(map.get(id));
		user.setUserId(id);
		return user;
	}
}
