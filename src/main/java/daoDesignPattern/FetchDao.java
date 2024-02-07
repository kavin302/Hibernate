package daoDesignPattern;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernateDemo.Student;

public class FetchDao {

	
	public Student fetchdata( int id)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student st=em.find(Student.class, id);
		return st;
//		System.out.println(st.getId());
//		System.out.println(st.getName());
//		System.out.println(st.getAge());
//		System.out.println(st.getYop());
	}
}
