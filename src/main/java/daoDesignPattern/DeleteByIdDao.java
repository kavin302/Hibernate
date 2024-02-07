package daoDesignPattern;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernateDemo.Student;

public class DeleteByIdDao {

	
	public void deletedata(int id)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Student st=em.find(Student.class, id);
		et.begin();
		em.remove(st);
		et.commit();
	}
}
