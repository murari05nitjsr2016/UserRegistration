package com.usreregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile(" abc", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("hi abce");
		boolean matchFound = matcher.find();
		if(matchFound)
		{
			System.out.println("Match Found"+"matcher.start(),matcher.end()");
		}
		else {
			System.out.println("Match not Found");
		}



	}

	

}
