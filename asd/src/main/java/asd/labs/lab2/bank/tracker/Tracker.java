package asd.labs.lab2.bank.tracker;

import asd.labs.lab2.bank.domain.Account;

public interface Tracker {
		public void update(Account account,String description);
}
