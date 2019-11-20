package com.custom.service;

import java.util.List;

import com.custom.dao.CustomDao;
import com.custom.entity.Custom;
/*
 * 20165874-…Ú¿ˆ∆º
 */
public class CustomServiceImpl implements CustomService {

	private CustomDao customDao;

	public CustomDao getCustomDao() {
		return customDao;
	}

	public void setCustomDao(CustomDao customDao) {
		this.customDao = customDao;
	}

	@Override
	public Custom findById(int customId) {	
		return customDao.findById(customId);
	}

	@Override
	public List<Custom> findAll() {
		return customDao.findAll();
	}

	@Override
	public void updateCustom(Custom custom) {
		customDao.updateCustom(custom);		
	}

	@Override
	public void deleteCustom(Custom custom) {
		customDao.deleteCustom(custom);
	}
	
}
