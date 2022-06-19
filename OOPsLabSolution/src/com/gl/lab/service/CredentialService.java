package com.gl.lab.service;

import java.util.Random;
import com.gl.lab.Employee;

public class CredentialService {
	
	public CredentialService() {
		// TODO Auto-generated constructor stub
	}
	
	public String generateEmailAddress(Employee emp) {
		
		String company=".greatlearning.com";
		String email =emp.getFirstName()+emp.getLastName()+"@"+emp.getDepartment()+company;
		emp.setEmail(email);
		return email;
	}
	
	
	public char[] generatePassword(Employee emp) {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";
 
        String values = upper + lower + numbers + symbols;
                        
        int len = 8;
        Random rndm = new Random();
 
        char[] password = new char[len];
        
        password[0] = upper.charAt(rndm.nextInt(upper.length()));
        password[1] = numbers.charAt(rndm.nextInt(numbers.length()));
        password[2] = symbols.charAt(rndm.nextInt(symbols.length()));
        password[3] = lower.charAt(rndm.nextInt(lower.length()));
 
        for (int i = 4; i < len; i++)
        {
            
            password[i] = values.charAt(rndm.nextInt(values.length()));
 
        }
        emp.setPassword(String.valueOf(password));   
		return password;

	} 
	
	public void showCredentials(Employee emp) {
		
		System.out.println("Dear "+emp.getFirstName()+" your generated password is:");
		System.out.println("Email ---> "+emp.getEmail());
		System.out.println("Password ---> "+emp.getPassword());
		
		}
	
	
}
