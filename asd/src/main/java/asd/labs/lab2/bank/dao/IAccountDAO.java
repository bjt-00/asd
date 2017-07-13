package asd.labs.lab2.bank.dao;

import java.util.Collection;

import asd.labs.lab2.bank.domain.Account;

public interface IAccountDAO {
	void saveAccount(Account account);
	void updateAccount(Account account);
	Account loadAccount(long accountnumber);
	Collection<Account> getAccounts();
}
