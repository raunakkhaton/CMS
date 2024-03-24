package com.dkyoutube.dineshyoutube.service;

import com.dkyoutube.dineshyoutube.dao.CustomerDAO;
import com.dkyoutube.dineshyoutube.exception.CustomerNotFoundException;
import com.dkyoutube.dineshyoutube.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
@Component
public class CustomerService {

@Autowired
    private CustomerDAO customerDAO;

    private int customerIdCount =1;
    private List<Customer> customerList = new CopyOnWriteArrayList<>();
    public Customer addCustomer(Customer customer){
//        customer.setCustomerId(customerIdCount);
//        customerList.add(customer);
//        customerList.add(customer);
//        customerIdCount++;
//        return customer;

        return customerDAO.save(customer);
    }
    public List<Customer> getCustomers(){
        return customerDAO.findAll();
//        return customerList;
    }
    public Customer getCustomer(int customerId){

        Optional<Customer> optionalCustomer = customerDAO.findById(customerId);
//        return customerList
//                .stream()
//                .filter(c -> c.getCustomerId() == customerId)
//                .findFirst()
//                .get();

        if(!optionalCustomer.isPresent())
            throw new CustomerNotFoundException("Customer record is not available....");
        return optionalCustomer.get();
    }

    public Customer updateCustomer(int customerId, Customer customer){

        customer.setCustomerId(customerId);

//        customerList
//                .stream()
//                .forEach(c-> {
//                    if(c.getCustomerId()== customerId){
//                        c.setCustomerFirstName(customer.getCustomerFirstName());
//                        c.setCustomerLastName(customer.getCustomerLastName());
//                        c.setCustomerEmail(customer.getCustomerEmail());
//                    }
//                });
//        return customerList
//                .stream()
//                .filter(c-> c.getCustomerId()== customerId)
//                .findFirst()
//                .get();

        return customerDAO.save(customer);
    }

    public void deleteCustomer(int customerId){
//        customerList
//                .stream()
//                .forEach(c-> {
//                    if(c.getCustomerId()== customerId){
//                        customerList.remove(c);
//                    }
//                });

        customerDAO.deleteById(customerId);
    }
}
