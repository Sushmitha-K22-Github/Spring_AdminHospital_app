package org.jsp.adminhospital.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.jsp.adminhospital.dto.Admin;
import org.jsp.adminhospital.dto.Hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class HospitalDao {
	@Autowired
	EntityManager m;
		
		public Hospital saveHospital(Hospital h) {
			EntityTransaction t=m.getTransaction();
			m.persist(h);
			t.begin();
			t.commit();
			return h;
		}
		public Hospital updateHospital(Hospital h) {
			EntityTransaction t=m.getTransaction();
			m.merge(h);
			t.begin();
			t.commit();
			return h;
		}
		public boolean deleteHospital(int id) {
			EntityTransaction t=m.getTransaction();
			Hospital h=m.find(Hospital.class, id);
			if(h!=null) {
				m.remove(h);
				t.begin();
				t.commit();
				return true;
				}
			return false;
		}
		public Hospital verifyHospital(long phone,String password) {
			String hql="select h from Hospital h where h.phone=?1 and h.password=?2";
			Query q=m.createQuery(hql);
			q.setParameter(1, phone);
			q.setParameter(2,password);
			try {
				return (Hospital)q.getSingleResult();
			}catch(NoResultException e) {
				return null;
			}
		}
}
