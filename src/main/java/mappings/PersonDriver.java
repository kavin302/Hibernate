package mappings;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person p1=new Person();
		p1.setId(100);
		p1.setName("kavin");
		p1.setAge(23);
		
		Person p2=new Person();
		p2.setId(101);
		p2.setName("dinesh");
		p2.setAge(24);
		
		Pan pan1=new Pan();
		pan1.setId(200);
		pan1.setPanNumber("kavin1234");
		pan1.setAddress("Namakkal");
		
		Pan pan2=new Pan();
		pan2.setId(201);
		pan2.setPanNumber("dinesh1234");
		pan2.setAddress("Karur");
		
		p1.setPan(pan1);
		p2.setPan(pan2);
		
		et.begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(pan1);
		em.persist(pan2);
		et.commit();
	
	}

}
