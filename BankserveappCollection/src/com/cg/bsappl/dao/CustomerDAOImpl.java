package com.cg.bsappl.dao;

import com.cg.bsappl.beans.Customer;
import com.cg.bsappl.util.CollectionsUtil;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public Customer getCustomerdetailsById(int id) {
		
		return CollectionsUtil.getCustomerDetailsById(id);
	}

	@Override
	public void addCustomer(Customer customer) {
		CollectionsUtil.addCustomer(customer);
		
	}

	@Override
	public void deleteCustomer(int id) {
		CollectionsUtil.deleteCustomerById(id);
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		CollectionsUtil.updateCustomer(customer);
		
	}

}
