package org.jsp.adminhospital.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.jsp.adminhospital.dto.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDao {
	@Autowired
EntityManager m;
	
	public Admin saveAdmin(Admin a) {
		EntityTransaction t=m.getTransaction();
		m.persist(a);
		t.begin();
		t.commit();
		return a;
	}
	public Admin updateAdmin(Admin a) {
		EntityTransaction t=m.getTransaction();
		m.merge(a);
		t.begin();
		t.commit();
		return a;
	}
	public boolean deleteAdmin(int id) {
		EntityTransaction t=m.getTransaction();
		Admin a=m.find(Admin.class, id);
		if(a!=null) {
			m.remove(a);
			t.begin();
			t.commit();
			return true;
			}
		return false;
	}
	public Admin verifyAdmin(long phone,String password) {
		String hql="select a from Admin a where a.phone=?1 and a.password=?2";
		Query q=m.createQuery(hql);
		q.setParameter(1, phone);
		q.setParameter(2,password);
		try {
			return (Admin)q.getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
	}

	
}
