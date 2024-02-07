package mappings;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDetails {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
            Countries country =em.find(Countries.class, 1);
            System.out.println("country name="+country.getName());
            System.out.println("country population="+country.getPopulation());
            
            PrimeMinister pm=country.getPrimeMinister();
            System.out.println("PrimeMinister name="+pm.getName());
            System.out.println("PrimeMinister id="+pm.getId());
            System.out.println("PrimeMinister age="+pm.getAge());
	}

}
