package com.cg.bsappl.service;

import java.util.Date;
import java.util.List;

import com.cg.bsappl.beans.Transaction;

public interface TransactionService {
	
	public void addTransaction(Transaction transaction);

	public List<Transaction> getTransactionsByAccountId(int accId);
	
	public List<Transaction> getTransactionByDate(Date startdate,Date enddate);
	
}
