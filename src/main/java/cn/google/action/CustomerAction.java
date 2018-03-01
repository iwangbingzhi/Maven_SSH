package cn.google.action;

import cn.google.domain.Customer;
import cn.google.service.CustomerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {
    private CustomerService customerService;
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }
    //根据主键查询
    public void setCustId(String custId) {
        this.custId = custId;
    }
    private String custId;
    public String findOne() throws Exception {
        Customer customer = customerService.findOne(custId);
        ActionContext.getContext().getValueStack().push(customer);
        return SUCCESS;
    }
}
