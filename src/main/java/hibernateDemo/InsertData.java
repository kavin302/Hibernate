package hibernateDemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertData {
   public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Scanner s=new Scanner(System.in);
	
	Student st=new Student();
	
	System.out.println("Enter id");
	int id=s.nextInt();
	st.setId(id);
	
	System.out.println("Enter name");
	String name=s.next();
	st.setName(name);
	
	System.out.println("Enter age");
	int age=s.nextInt();
	st.setAge(age);
	
	System.out.println("Enter year");
	int yop=s.nextInt();
	st.setYop(yop);
	
	et.begin();
	em.persist(st);
	et.commit();
}
}
