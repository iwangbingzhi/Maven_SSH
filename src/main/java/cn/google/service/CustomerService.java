package cn.google.service;

import cn.google.domain.Customer;

public interface CustomerService {

    Customer findOne(String custId);
}
