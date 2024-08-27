package com.example.demo;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEntry {
private String name;
private long balance;
private long accountNumber2;
private long amount;
private long phoneNumber;
private ArrayList<Long> data=new ArrayList<Long>();
@Id
private long accountNumber;

public long getAccountNumber2() {
	return accountNumber2;
}
public void setAccountNumber2(long accountNumber2) {
	this.accountNumber2 = accountNumber2;
}
public void setData(ArrayList<Long> data) {
	this.data = data;
}
public ArrayList<Long> getData() {
	return data;
}
public void setData(long amount2) {
	data.add(amount2);
}
public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long count) {
	this.accountNumber = count;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public long getBalance() {
	return balance;
}
public void setBalance(long balance) {
	this.balance = balance;
}
public long getAmount() {
	return amount;
}
public void setAmount(long amount) {
	this.amount = amount;
}
public String toString() {
	return this.accountNumber+" "+accountNumber2+" "+phoneNumber+" "+name+" "+amount+" "+balance;
}



}
