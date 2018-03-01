package cn.google.dao;

import cn.google.domain.Customer;

public interface CustomerDao {
    Customer findOne(String custId);
}
