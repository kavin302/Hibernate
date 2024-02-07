package daoDesignPattern;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernateDemo.Student;

public class UpdateDao {
	public String updatedata(int id,String name)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Student st=em.find(Student.class, id);
		if(st!=null)
		{
			st.setName(name);
			et.begin();
			em.merge(st);
			et.commit();
		  	return "Updated Successfully";
		}
		else
			return "Invalid id";
		
	}
}
