package asd.labs.lab2.bank.tracker;

import asd.labs.lab2.bank.domain.Account;

public class SMSSender implements Tracker {
	public void sendSMS(String text){
		System.out.println("SMSSender:"+text);
	}
	
	public void update(Account account,String description){
		if(description.equals("deposit")||description.equals("withdraw"))
		sendSMS("Blance changed Account "+account.getAccountnumber()+"  , New Balance :"+account.getBalance());
	}
}
