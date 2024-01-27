package com.cg.bsappl.util;

import java.util.*;
import com.cg.bsappl.beans.*;
public class CollectionsUtil {
	
	private static List<Account> accounts=new ArrayList<>();
	private static List<Customer> customers=new ArrayList<>();
	private static List<Transaction> transactions=new ArrayList<>();
	
	static {
		customers.add(new Customer(1,"Leo","Das","leo@gmail.com"));
		customers.add(new Customer(2,"harold","Das","harold@gmail.com"));
		customers.add(new Customer(3,"Antony","Das","Antony@gmail.com"));
		customers.add(new Customer(4,"Ranvijay","singh","vijay@gmail.com"));
		customers.add(new Customer(5,"pushpa","raj","raj@gmail.com"));
	
		 accounts.add(new Account(1, 10000.0, customers.get(0)));
	     accounts.add(new Account(2, 9500.0, customers.get(1)));
	     accounts.add(new Account(3, 8500.0, customers.get(2)));
	     accounts.add(new Account(4, 7500.0, customers.get(3)));
	     accounts.add(new Account(5, 20000.0, customers.get(4)));
	        
	}

	public static void createAccount(Account acc1) {
        accounts.add(acc1);
    }

    public static void deleteAccountById(int id) {
    	int i;
        for (i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNum() == id && accounts.get(i)!=null) {
                accounts.remove(i);
                
                break;
            }
        }
        if(i==accounts.size()) {
        throw new NullPointerException("the account with account number "+ id+" did not exist");}
    }

    public static void updateAccount(Account updateAccount) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNum() == updateAccount.getAccountNum()) {
                accounts.set(i, updateAccount);
                break;
            }
        }
    }

    public static Account getAccountdetailsById(int accNum) {
        for (Account account : accounts) {
            if (account.getAccountNum() == accNum) {
                return account;
            }
        }
        return null;
    }
    public static int getNumberofAccount()
	{
		return accounts.size();
	}
    public static void addCustomer(Customer customer)
    {
    	customers.add(customer);
    }
    public static void deleteCustomerById(int id)
    {
    	for(Customer cust:customers)
    	{
    		if(cust.getCustomerId()==id && cust !=null)
    		{
    			cust=null;
    			break;
    		}
    	}
    }
    public static void updateCustomer(Customer updateCustomer)throws NullPointerException
    {
    	int j;
    	for( j=0;j<customers.size();j++)
    	{
    	
    	if(customers.get(j).getCustomerId()==updateCustomer.getCustomerId())
    	{
    		customers.set(j, updateCustomer);
    		break;
    	}
    	
    	}
    	if(j==customers.size())
    	{
    		throw new NullPointerException("this account does not exist");
    	}
    }
    public static Customer getCustomerDetailsById(int id)
    {
    	for(Customer cust:customers)
    	{
    		
    		if(cust !=null && cust.getCustomerId()==id)
    		{
    			return cust;
    		}
    	}
    	return null;
    }
    public static void addTransaction(Transaction transaction)
    {
    	transactions.add(transaction);
    }
    public static List<Transaction> getTransactionsByAccountId(int id)
    {
    	List<Transaction> trans=transactions;
    	List<Transaction> trans1=new ArrayList<Transaction>();
    	
    	for(Transaction tr:trans)
    	{
    		if(tr!=null && tr.getAccountId()==id)
    		{
    			trans1.add(tr);
    		}
    	}
    	return trans1;
    }

}
