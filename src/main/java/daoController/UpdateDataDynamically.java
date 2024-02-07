package daoController;

import java.util.Scanner;

import daoDesignPattern.UpdateDao;

public class UpdateDataDynamically {

	public static void main(String[] args) {
		
	Scanner scn=new Scanner(System.in);
	  System.out.println("Enter id");
	  int id=scn.nextInt();
	  
	  System.out.println("Enter to Update name");
	  String name=scn.next();
	  
	  UpdateDao ud=new UpdateDao();
	 String s1= ud.updatedata(id, name);
System.out.println(s1);
	}

}
