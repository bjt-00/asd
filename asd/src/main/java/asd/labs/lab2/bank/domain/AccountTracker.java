package asd.labs.lab2.bank.domain;

import java.util.ArrayList;
import java.util.List;

import asd.labs.lab2.bank.tracker.EmailSender;
import asd.labs.lab2.bank.tracker.Logger;
import asd.labs.lab2.bank.tracker.SMSSender;
import asd.labs.lab2.bank.tracker.Tracker;


class AccountTracker {
	private List<Tracker> trackers = new ArrayList<Tracker>();
	
	{
		trackers.add(new Logger());
		trackers.add(new SMSSender());
		trackers.add(new EmailSender());
	};
	
	public void notify(Account account,String description){
		trackers.forEach(t->{t.update(account,description);});
	}
}
