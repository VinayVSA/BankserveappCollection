package com.cg.bsappl.dao;

import com.cg.bsappl.beans.Account;
import com.cg.bsappl.util.CollectionsUtil;

public class AccountDAOImpl implements AccountDAO {

	@Override
	public Account getAccountById(int Id) {

		return CollectionsUtil.getAccountdetailsById(Id);
	}

	@Override
	public void createAccount(Account account) {
		CollectionsUtil.createAccount(account);
		
	}

	@Override
	public int getNumberofAccounts() {
		
		return CollectionsUtil.getNumberofAccount();
	}

	@Override
	public void updateAccount(Account updateAccount) {
		CollectionsUtil.updateAccount(updateAccount);
		
	}

	@Override
	public void deleteAccount(int id) {
		
		CollectionsUtil.deleteAccountById(id);
		
	}

	

}
