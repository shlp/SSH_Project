package com.custom.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.custom.entity.Custom;

/*
 * 20165874-…Ú¿ˆ∆º
 */

public class CustomDaoImpl implements CustomDao {

	SessionFactory sessionFactory;	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public Custom findById(int customId) {
		Custom custom=null;
		custom=(Custom)this.getSession().get(Custom.class, customId);
		return custom;
	}
	@Override
	public List<Custom> findAll() {
		 String hql = "from Custom";
			Query query=getSession().createQuery(hql);
			List<Custom> list =query.list();
			return list;
	}
	@Override
	public void updateCustom(Custom custom) {
		this.getSession().update(custom);
		
	}
	@Override
	public void deleteCustom(Custom custom) {
		this.getSession().delete(custom);		
	}
	
}
