package com.sird.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sird.dao.AssemblyDao;
import com.sird.domain.Student;

@Repository
public class AssemblyDaoImpl implements AssemblyDao {

	@Autowired
	private SessionFactory sessionFactory;

	 

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getAll() {
		Session session = this.sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		session.close();
		return criteria.list();
	}

	@Override
	public void save(Student assembly) {
		// TODO Auto-generated method stub
		
	}

}
