package com.usreregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	static void validationLastName(String lName) {
		Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{3,}$");
		Matcher matcher = pattern.matcher(lName);
		boolean matchFound = matcher.find();
		if(matchFound)
		{
			System.out.println("Match Found");
		}
		else {
			System.out.println("Match not Found");
		}

	}
	static void emailRegistration(String email)
	{
		String regex = "^[a-zA-Z0-9]+[._+-]?[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]{2,4})([.][a-zA-Z]{2,4})?$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(email);
				boolean matchFound = matcher.find();
				if(matchFound)
				{
					System.out.println("Valid email");
				}
				else {
					System.out.println("Invalid email");
				}
	}
	static void mobileNumberValidation(String mobNo)
	{
		String regex = ("^[1-9]{2}[\\s][6-9]{1}[0-9]{9}$");
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobNo);
		boolean matchFound = matcher.find();
		if(matchFound)
		{
			System.out.println("Valid mobile number");
		}
		else {
			System.out.println("Invalid mobile number");
		}
		
	}
	static void passwordValidation(String pwd)
	{
		String regex = "^(?=.*[0-9])(?=.*[!@#$%^&*|'<>.-^*()%!])(?=.*[A-Z])[^\\s]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pwd);
		boolean matchFound = matcher.find();
		if(matchFound)
		{
			System.out.println("Valid passwors");
		}
		else {
			System.out.println("Invalid password");
		}
		
	}


	public static void main(String[] args) {

		
		 Scanner sc = new Scanner(System.in);
		 /*
		System.out.println("Enter the first Name: ");
		String fName = sc.next();
		System.out.println("Enter last name ");
		String lname = sc.next();
		Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{3,}$");
		Matcher matcher = pattern.matcher(fName);
		boolean matchFound = matcher.find();
		if(matchFound)
		{
			System.out.println("Match Found");
		}
		else {
			System.out.println("Match not Found");
		}
		validationLastName(lname);
		System.out.println("enter your email  ");
		String email = sc.next();
		emailRegistration(email);
*/
		System.out.println("Enter your mobile no :");
		String mobNo = sc.next();
		mobileNumberValidation(mobNo);
		System.out.println("enter your password  ");
		String pwd = sc.next();
		passwordValidation(pwd);
		
		




	}



}
