package com.model;

public class Account {
	private String name;
	private long mobileNo;
	private String address;
	private int accNo;
	private float balance;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
	@Override
	public String toString() {
		return "Name: "+name+"\nMobile Number: "+mobileNo+"\nAddress: "+address+"\nAccount Number: "+accNo+"\nBalance: "+balance;
	}
	
	

}
