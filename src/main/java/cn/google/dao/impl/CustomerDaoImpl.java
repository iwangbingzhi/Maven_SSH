package cn.google.dao.impl;

import cn.google.dao.CustomerDao;
import cn.google.domain.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao{


    @Override
    public Customer findOne(String custId) {
        return this.getHibernateTemplate().get(Customer.class,custId);
    }
}
