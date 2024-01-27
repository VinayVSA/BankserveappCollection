package com.cg.bsappl.dao;

import java.util.List;

import com.cg.bsappl.beans.Transaction;

public interface TransactionDAO {
	
	
public void addTransaction(Transaction transaction);

public List<Transaction> getTransactionsByAccountId(int accId);
	
	
}
