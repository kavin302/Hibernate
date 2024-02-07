package hibernateDemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchData {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Scanner scn=new Scanner(System.in);
		int id=scn.nextInt();
		Student s=em.find(Student.class, id);
		if(s==null)
			System.out.println("invalid id");
		else
		{
			System.out.print(s.getId()+"\t");
			System.out.print(s.getName()+"\t");
			System.out.print(s.getAge()+"\t");
			System.out.print(s.getYop()+"\t");
			System.out.println();
		}
	}

}
