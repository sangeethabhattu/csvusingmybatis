package com.letigation.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.letigation.model.litigationmaster;
import com.letigation.model.litigationdetails;

import com.letigation.model.attorneytable;


@Mapper
public interface UserMapper {
	
	


	
	public List<litigationdetails> findAll2();

	public List<attorneytable> findAll11();
	public  void insert(litigationmaster user);

	public List<litigationmaster> findAll();

	

	

}

