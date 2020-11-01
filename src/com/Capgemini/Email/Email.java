package com.Capgemini.Email;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter Email Part To Validate");
		String email = sc.nextLine();
		Email e = new Email();
		e.checkEmail(email);
		//sc.close();
	}
	}

	public void checkEmail(String str) {
		String regex = "(^[a-zA-Z0-9]+[+_.-]?[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z]{2,}.[A-Za-z]{2}$)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		boolean valid = matcher.matches();
		if (valid == true) {
			System.out.println("Valid Email ");
		} else if (valid == false) {
			System.out.println("Invalid Email ");
		}

	}
}
