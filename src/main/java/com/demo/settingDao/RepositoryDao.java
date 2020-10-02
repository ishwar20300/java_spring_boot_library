/**
 * 
 */
package com.demo.settingDao;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class RepositoryDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private DataSource dataSource;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addnew(Object object) throws Exception {
		getSession().persist(object);
	};

	public void update(Object object) throws Exception {
		getSession().saveOrUpdate(object);
	};

	public void delete(Object object) throws Exception {
		getSession().delete(object);
	};

	protected DataSource getDataSource() {
		return dataSource;
	}

}
