package com.usreregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Name: ");
		String fName = sc.next();
		Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(fName);
		boolean matchFound = matcher.find();
		if(matchFound)
		{
			System.out.println("Match Found");
		}
		else {
			System.out.println("Match not Found");
		}


	}

	

}
