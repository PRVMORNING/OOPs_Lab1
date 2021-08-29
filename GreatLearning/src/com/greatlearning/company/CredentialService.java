package com.greatlearning.company;
import java.util.Random;

public class CredentialService
{
	 
	public void generatePassword() 
		{   
			String content1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String content2="abcdefghijklmnopqrstuvwxyz";
			String content3="0123456789";
			String content4="@#$&*";
			                              // total character 26+26+10+5=67
		
			Random g=new Random();
			String pass=" ";
			char []passC=new char[10];    //8 will be the length of password
			for(int i=0;i<10;i++)
			{
				
				int c=g.nextInt(4);
				switch(c+1)
				{
				
				case 1: passC[i]= content1.charAt(g.nextInt(26));
				        break;
				case 2: passC[i]= content2.charAt(g.nextInt(26));
						break;
				case 3: passC[i]= content3.charAt(g.nextInt(10));
						break;
				case 4: passC[i]= content4.charAt(g.nextInt(5));
						break;
				}
			}
			for(int i=0;i<10;i++) 
			{
				pass+= passC[i];
			}
			System.out.println("Password-->"+pass);
		}
		
	 String EmailAddress="FirstNmaeLastNmae@department.company.com";
     String firstName= "FirstName";
     String lastName= "LastName"	;	
     String department=" ";
	
		public String generateCredentials() 
		{
	     
	      
	      return EmailAddress=firstName+lastName;
		}
		
		
	    public void Employee(String firstName, String lastName)
		{
			
			this.firstName= firstName;
			this.lastName= lastName;
			
		
		   
		}
		
	    
	    void showCredentials() {
	    	
	    	
		    System.out.print("Email-->");
	    }

		
			
}


