package cn.google.service.impl;

import cn.google.dao.CustomerDao;
import cn.google.domain.Customer;
import cn.google.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public Customer findOne(String custId) {
        return customerDao.findOne(custId);
    }
}
