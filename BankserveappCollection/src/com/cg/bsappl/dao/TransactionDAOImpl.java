package com.cg.bsappl.dao;

import java.util.List;

import com.cg.bsappl.beans.Transaction;
import com.cg.bsappl.util.CollectionsUtil;

public class TransactionDAOImpl implements TransactionDAO {

	@Override
	public void addTransaction(Transaction transaction) {
		
		CollectionsUtil.addTransaction(transaction);
		
	}

	@Override
	public List<Transaction> getTransactionsByAccountId(int accId) {
		
		return CollectionsUtil.getTransactionsByAccountId(accId);
	}

}
