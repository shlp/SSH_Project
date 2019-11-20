package com.custom.dao;

import java.util.List;

import com.custom.entity.Custom;
/*
 * 20165874-����Ƽ
 */
public interface CustomDao {

	//ͨ��id��ѯ
	Custom findById(int customId);
	
	//��ѯ����
	List<Custom> findAll();
	
	//�޸��û�
	void updateCustom(Custom custom);
	
	
	//ɾ���û�
	void deleteCustom(Custom custom);
	
}
