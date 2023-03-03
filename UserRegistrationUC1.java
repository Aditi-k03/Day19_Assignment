package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC1 {

	static Scanner scanner = new Scanner(System.in);

	
	public static void validFirstName() {

		System.out.println("Enter First Name:");
		String name = scanner.next();
		String regex = "^[A-Z]{1}[a-z]*";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		boolean r = m.matches();

		if (r)
			System.out.println("It Is A Valid First Name");
		else
			System.out.println("It Is Invalid First Name");

	}

}