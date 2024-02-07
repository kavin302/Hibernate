package daoController;

import java.util.Scanner;

import daoDesignPattern.FetchDao;
import hibernateDemo.Student;

 

public class FetchDataDynamically {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		 System.out.println("Enter id");
		 int id=scn.nextInt();
		 
		 FetchDao fd=new FetchDao();
		Student s= fd.fetchdata(id);
         System.out.println(s.getId());
         System.out.println(s.getName());
         System.out.println(s.getAge());
         System.out.println(s.getYop());
	}

}
