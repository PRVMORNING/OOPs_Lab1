package com.greatlearning.company;

import java.util.Scanner;

public class Employee extends CredentialService
{

	
	
	public static void main(String[] args) 
    {   
	
		Scanner sc= new Scanner(System.in);
		CredentialService show=new CredentialService();
		System.out.println("Enter your first name");
		String firstName= sc.nextLine();
		
		System.out.println("Enter your last name");
	    String lastName= sc.nextLine();
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		String department= sc.nextLine();
		show.Employee(firstName,lastName);
		
		
			String name=show.generateCredentials();			
			System.out.println("Dear "+firstName+" your generated credentials are as follows");
			show.showCredentials();
			System.out.println(name+"@"+department+".tata.com");
			show.generatePassword();
			
	
     }	
}
