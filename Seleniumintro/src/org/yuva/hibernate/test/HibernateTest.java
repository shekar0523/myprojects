package org.yuva.hibernate.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.yuva.hibernate.Address;
import org.yuva.hibernate.FourWheeler;
import org.yuva.hibernate.TwoWheeler;
import org.yuva.hibernate.Vehicle;
import org.yuva.hibernate.userdetails;

public class HibernateTest {

	public static void main(String[] args) {
		for(int i=0;i<10;i++){
		userdetails user = new userdetails();
		user.setUserName("user"+i);
		}
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		for(int i=0;i<10;i++){
			userdetails user = new userdetails();
			user.setUserName("user "+i);
			session.save(user);
			}
		session.getTransaction().commit();
		session.close();
/*		session=sessionfactory.openSession();
		session.beginTransaction();
		for(int i=1;i<=10;i++){
			userdetails user=(userdetails)session.get(userdetails.class,i);
			System.out.println("user name is "+user.getUserName());
			}
		session.getTransaction().commit();
		session.close();
		session=sessionfactory.openSession();
		session.beginTransaction();
		userdetails user=(userdetails)session.get(userdetails.class,6);
		session.delete(user);
		session.getTransaction().commit();
		session.close();*/
		session=sessionfactory.openSession();
		session.beginTransaction();
		userdetails updateuser=(userdetails)session.get(userdetails.class,5);
		updateuser.setUserName("user4 update");
		session.update(updateuser);
		session.getTransaction().commit();
		session.close();
	}

}
