package mappings;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CountryDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Countries country1 = new Countries();
		country1.setId(1);
		country1.setName("India");
		country1.setPopulation("140 crores");

		Countries country2 = new Countries();
		country2.setId(2);
		country2.setName("China");
		country2.setPopulation("100 crores");

		PrimeMinister pm1 = new PrimeMinister();
		pm1.setId(1);
		pm1.setName("Modi Ji");
		pm1.setAge(57);
		
		PrimeMinister pm2 = new PrimeMinister();
		pm2.setId(2);
		pm2.setName("Tijanko");
		pm2.setAge(50);
		
		country1.setPrimeMinister(pm1);
		country2.setPrimeMinister(pm2);
		
		et.begin();
		em.persist(country1);
		em.persist(country2);
		em.persist(pm1);
		em.persist(pm2);
		et.commit();

	}

}
