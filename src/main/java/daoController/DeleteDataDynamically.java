package daoController;

import java.util.Scanner;

import daoDesignPattern.DeleteByIdDao;
import daoDesignPattern.FetchDao;
import hibernateDemo.Student;

public class DeleteDataDynamically {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		 System.out.println("Enter id");
		 int id=scn.nextInt();
		 
		 DeleteByIdDao dd=new DeleteByIdDao();
		dd.deletedata(id);
        System.out.println("Deleted Successgully");

	}

}
