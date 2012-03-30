package br.com.teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClienteTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		

	}
	
	

}
