package com.letigation.service;
import java.io.IOException;
import java.net.http.HttpHeaders;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.letigation.mapper.UserMapper;

import com.letigation.model.attorneytable;
import com.letigation.model.litigationdetails;
import com.letigation.model.litigationmaster;




@Service
public class UserService {
	
	@Autowired
	   private UserMapper userMapper;
	
	
	public List<attorneytable> findAll11()
	{
		
		return userMapper.findAll11();
		
		
	}

	public List<litigationdetails> findAll2()
	{
		
		return userMapper.findAll2();
		
		
	}
	
	public void insert(litigationmaster user) {
		   
		   
		     userMapper.insert(user);
	   }

	public List<litigationmaster> findAll() {
	
		return userMapper.findAll();
	}

	
//	   
//	   public void  delete(int id) {
//		   
//		   
//		  userMapper.delete(id);
//	   }
//	   public void update(Letigation mobileid1) {
//		   
//		   userMapper.update(mobileid1);
//	   }
//	   public Letigation getById(int id) {
//		   
//		  return userMapper.getById(id);
//	   }
//
//public  List<Letigation> getBybrand(String brand1)
//{
//	
//return userMapper.getBybrand(brand1);
//}
//
//public  List<Letigation> getByprice()
//{
//	
//return userMapper.getByprice();
//}
//
//public List<Letigation> comparebyid(String str)
//{
//
//return userMapper.comparebyid(str);
//}
//
//
//public List<Letigation> deleteAll()
//{
//	
//	return userMapper.deleteAll();
//}
//



  

	




}
