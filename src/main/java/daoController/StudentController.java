package daoController;

import java.util.Scanner;

import daoDesignPattern.StudentDao;
import hibernateDemo.Student;

public class StudentController {
          public static void main(String[] args) {
			Scanner scn=new Scanner(System.in);
			
			System.out.println("enter id");
			int id=scn.nextInt();
			
			System.out.println("enter name");
			String name=scn.next();
			
			System.out.println("enter age");
			int age=scn.nextInt();
			
			System.out.println("enter yop");
			int yop=scn.nextInt();
			
			Student st=new Student();
			st.setId(id);
			st.setName(name);
			st.setAge(age);
			st.setYop(yop);
			
			StudentDao dao=new StudentDao();
			dao.saveStudent(st);
        	  
		}
}
