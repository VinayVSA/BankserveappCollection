package com.cg.bsappl.service;

import java.util.Date;
import java.util.List;

import com.cg.bsappl.beans.Transaction;
import com.cg.bsappl.dao.TransactionDAO;

public class TransactionServiceImpl implements TransactionService{

	private TransactionDAO transdao;
	
	public TransactionServiceImpl(TransactionDAO transdao)
	{
		this.transdao=transdao;
	}
	@Override
	public void addTransaction(Transaction transaction) {
		
		transdao.addTransaction(transaction);
	}

	@Override
	public List<Transaction> getTransactionsByAccountId(int accId) {
		
		return transdao.getTransactionsByAccountId(accId);
	}

	@Override
	public List<Transaction> getTransactionByDate(Date startdate, Date enddate) {
		
		return null;
	}

}
