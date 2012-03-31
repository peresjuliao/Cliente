package br.com.teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.bean.Cliente;

public class ClienteTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNome("Peres");
		cliente.setSobrenome("Juliao");
		cliente.setCpf("0314567890");
		cliente.setSalario(1000.00);
		cliente.setSituacao("Aposentado");
		
		session.save(cliente);
		
		session.beginTransaction().commit();
		

	}
	
	

}
