package com.Simplilearnproject;



	
	import java.util.regex.*;  //email validation
	import java.util.Scanner; // user input
	import java.util.*;      // arraylist
	public class Emailvalidation1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

	System.out.println("Please Enter Mail ");
			
			Scanner sc = new Scanner(System.in);
			String userinp =sc.next();
			
			
			System.out.println("User Enter Email => "+userinp);
			
			boolean check =validEmail(userinp);
			
			if(check==true) {
				System.out.println("Email Id Is Valid");
				System.out.println();
				
				findEmailId(userinp);
				
			}
			else {
				System.out.println("Invalid Email Id");
			}
			
		}
		
		
		public static boolean validEmail(String input) {  // this method use for check email validation
			String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
			Pattern emailpat = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
			Matcher matcher= emailpat.matcher(input);
			
			return matcher.find();
		}
		
		public static void findEmailId(String ui) {  // this method use for find email id 
			ArrayList<String> listofemp = new ArrayList<String>();   
			listofemp.add("employeeA@gmail.com");
			listofemp.add("employeeB@gmail.com");
			listofemp.add("employeeC@gmail.com");
			listofemp.add("employeeD@gmail.com");
			listofemp.add("employeeE@gmail.com");
			
			System.out.println("This is list of Empolyees ");
			for(String el:listofemp)
			{
				System.out.println(el);
			}
			
			System.out.println();
			
			
			int m=0;
			
			for(int i=0; i< listofemp.size(); i++)
			{
				if(ui.equals(listofemp.get(i)))  // check if found then 
				{
					m=i+1;
					//System.out.println("email ID " + ui + " found "+"position "+(i+1));
					//System.out.println("Email found in List of Employees position "+(i+1));
					break;
				}	
				
			}
			
			if(m>0)
			{
				System.out.println("email ID " + ui + " found "+"position "+m);
			}
			else {
				System.out.println("email ID " + ui + " not found in given list");
			}
		}

	}