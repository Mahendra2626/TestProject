package com.tweetapp;

import java.util.Scanner;

import com.tweetapp.register.saveuser;

public class Start {

	
	
	public static void menu() {
		
		
		try {
			
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Introdution menu Guest User");
		System.out.println("Register - Please press 1");
		System.out.println("Login - Please press 2");
		System.out.println("Forgot Password - Please press 3");
		Integer choose = scanner.nextInt();
		
		System.out.println(choose);
		
		if(choose == 1) {
			System.out.println("Register User");
			System.out.println("please enter your name");
			String username = scanner.nextLine();
			System.out.println("Password");
			String password = scanner.nextLine();
			System.out.println("Email");
			String email = scanner.nextLine();
			saveuser sa = new saveuser();
			sa.register(username,password,email);
				
			
		}else if(choose == 2) {
			System.out.println("Login User");
			System.out.println("please enter your name");
			String username = scanner.nextLine();
			System.out.println("Password");
			String password = scanner.nextLine();
			saveuser sa = new saveuser();
			String ret = sa.login(username,password);
			
			if(ret.equalsIgnoreCase("success")) {
				newmenu();
			}else {
				menu();
			}
			
			
		
		}else if(choose == 3) {
			System.out.println("Forgot password");
			System.out.println("please enter your name");
			String username = scanner.nextLine();
			System.out.println("Old Password");
			String oldpassword = scanner.nextLine();
			System.out.println("New  Password");
			System.out.println("Confirm Password");
			String newpassword = scanner.nextLine();
			saveuser sa = new saveuser();
			sa.forgotpassword(username, oldpassword, newpassword);
		
		}else if(choose>3) {
			
			System.out.println("Please enter valid input.....");
			menu();
		}
		
		
		
		System.out.println("login user");
		
		}catch(Exception e) {
			
			System.out.println("Please enter valid input.....");
			menu();
		}
		
	}
	
	
	
	private static void newmenu() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Menu for logged in user");
		System.out.println("Post a tweet");
		System.out.println("view my tweet");
		System.out.println("View all tweet");
		System.out.println("Reset Password");
		System.out.println("Logout");
Integer choose = scanner.nextInt();
		
		System.out.println(choose);
		
		
		
		if(choose == 1) {
			System.out.println("Post a tweet");
		
		}else if(choose == 2) {
			System.out.println("view my tweet");
		
		}else if(choose == 3) {
			System.out.println("View all tweet");
			
		}else if(choose == 4) {
			System.out.println("Reset Password");
			
		}else if(choose == 5) {
			System.out.println("Logout");
		}
		
		

		
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
menu();
	}

}
