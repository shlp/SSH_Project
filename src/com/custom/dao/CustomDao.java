package com.custom.dao;

import java.util.List;

import com.custom.entity.Custom;
/*
 * 20165874-沈丽萍
 */
public interface CustomDao {

	//通过id查询
	Custom findById(int customId);
	
	//查询所有
	List<Custom> findAll();
	
	//修改用户
	void updateCustom(Custom custom);
	
	
	//删除用户
	void deleteCustom(Custom custom);
	
}
