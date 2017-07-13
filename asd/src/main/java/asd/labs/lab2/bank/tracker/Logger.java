package asd.labs.lab2.bank.tracker;

import asd.labs.lab2.bank.domain.Account;

public class Logger implements Tracker {
	public void log(String log){
		System.out.println("Bank Logger:"+log);
	}
	
	public void update(Account account,String description){
		
		log("Account Activity Transaction Type :"+description+" Account Number: "+account.getAccountnumber()+"  , New Balance :"+account.getBalance());
	}
}
