package com.gl.driver;

import java.util.Scanner;

import com.gl.lab.Employee;
import com.gl.lab.service.CredentialService;


public class Driver {
	
	
	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String firstname;
		String lastname;
		String department = null;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter your Name");
		firstname =sc.next();
		System.out.println("Please enter your Last Name");
		lastname =sc.next();
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical\n2. Admin\n3. Human Resources\n4. Legal");
		
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
		       department ="tech";
		       break;
		case 2:
			department ="admin";
		       break;
		case 3:
			department ="hr";
		       break;
		case 4:
			department ="legal";
		       break;
		default:
			   System.out.println("Wrong choice");
	
		
		}
		
		Employee emp=new Employee(firstname,lastname,department);
		CredentialService cred=new CredentialService();
		cred.generateEmailAddress(emp);
		cred.generatePassword(emp);
		cred.showCredentials(emp);
		
		
		
		sc.close();

	}
	

}
