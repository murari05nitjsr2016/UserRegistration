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


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
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




	}



}
