package com.userServiceImpl;
import com.service.*;
import java.util.Scanner;
import com.model.*;


public class SBI implements RBI{
	Account ac=new Account();
	Scanner sc =new Scanner(System.in);

	@Override
	public void createAccount() {
		System.out.println("Enter Name");
		ac.setName(sc.next());
		System.out.println("Enter Mobile number");
		ac.setMobileNo(sc.nextLong());
		System.out.println("Enter Address");
		ac.setAddress(sc.next());
		System.out.println("Enter Account number");
		ac.setAccNo(sc.nextInt());
		System.out.println("Enter Account Balance");
		ac.setBalance(sc.nextFloat());
		System.out.println("******Account Created******\n\n");
	}

	@Override
	public void viewAccountDetails() {
		
		System.out.println("***Account Details***\n"+ac.toString());
		System.out.println("\n");
		
	}

	@Override
	public void viewAccountBalance() {
		System.out.println("Account Balance : "+ ac.getBalance());
		System.out.println("\n");
		
		
	}

	@Override
	public void depositAmount() {
		System.out.println("Enter amount to deposit");
		float newAmount=sc.nextFloat();
		float oldAmount=ac.getBalance();
		ac.setBalance(newAmount +oldAmount);
		System.out.println("**Amount Deposited**\n\n");
		
		
	}

	@Override
	public void withdrawlAmount() {
		
		System.out.println("Enter amount to withdraw");
		float newAmount=sc.nextFloat();
		float oldAmount=ac.getBalance();
		ac.setBalance(oldAmount-newAmount);
		System.out.println("**Amount Withdrawed**\n\n");
		
	}

	@Override
	public void update() {
		boolean flag =true;
		while(flag) {
			System.out.println("Enter chocice what you wont to update");
			System.out.println("1.  Name \n2.  Mobile number \n3.  Address \n0.  Exit");
			int ch=sc.nextInt();
			
			switch (ch) {
				case 1:{
					System.out.println("Enter name to update");
					ac.setName(sc.next());
					break;
					
				}
				case 2:{
					System.out.println("Enter Mobile number to update");
					ac.setMobileNo(sc.nextLong());
					break;
					
				}case 3:{
					System.out.println("Enter Address to update");
					ac.setAddress(sc.next());
					break;
					
				}case 0:{
					System.out.println("Updation completed\n\n");
					
					flag=false;
					break;
					
				}
				default:{
					System.out.println("Enter vaild input");
				}
			}
			
			
		}
		
		
		
		
		
	}

}
