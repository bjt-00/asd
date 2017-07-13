package asd.labs.lab2.bank.tracker;

import asd.labs.lab2.bank.domain.Account;

public class EmailSender implements Tracker {
	public void sendEmail(String contents){
		System.out.println("EmailSender :"+contents);
	}
	
	public void update(Account account,String description){
		if(description.equals("new")){
		sendEmail("New account created.. Account No = "+account.getAccountnumber());
		}
	}
}
