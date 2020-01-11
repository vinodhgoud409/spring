package com.app.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Pancard;
import com.app.model.Person;
import com.app.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Transaction tx=null;
		try(Session ses=HibernateUtil.getsf().openSession()){
			tx=ses.beginTransaction();
			Pancard p=new Pancard();
			p.setPanId(101);
			p.setNameOnPan("vishnu");
			p.setFatherName("kjhgf");
			p.setDob("78.90.90");
			p.setDateOfIssue("1.05.2019");
			Person p1=new Person();
			p1.setPerId(9);
			p1.setPerName("ghana");
			p1.setLoc("hyd");
			p1.setPob(p);
			ses.save(p);
			ses.save(p1);
			tx.commit();
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
			
			
			}
System.out.println("done");
	}

}
