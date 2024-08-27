package com.Controller;
import com.userServiceImpl.*;
import com.service.*;
import java.util.Scanner;

public class AdminController {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("______*BANK APPLICATION STARTED*______\n");
		
		
		boolean flag=true;
		RBI rbi =new SBI();
		while(flag) {
			System.out.println("*****************MENU*****************");
			System.out.println("1.  Create Account \n2.  View Account Details \n3.  View Account Balance \n4.  Deposit Amount \n5.  Withdrawl Amount \n6.  Update Details \n0.  Exit ");
			int ch=sc.nextInt();
			switch(ch) {
				case 1:{
					rbi.createAccount();
					break;
					}
				case 2:{
					rbi.viewAccountDetails();
					break;
				
					}
				case 3:{
					rbi.viewAccountBalance();
					break;
				
					}
				case 4:{
					rbi.depositAmount();
					break;
				
					}
				case 5:{
					rbi.withdrawlAmount();
					break;
				
					}
				case 6:{
					rbi.update();
					break;
				}
				case 0:{
					System.out.println("**Thank you for Visting**");
					flag=false;
					break;
				}
				default:{
					System.out.println("Enter Vaild Input");
				}
		
		}
		}
		
	}

}
