package com.example.firstservice;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    private List<Customer> customers = new ArrayList<>();
    private List<Customer> result = new ArrayList<>();

    public CustomerController(){
        customers.add(new Customer("1000","John","Male",25));
        customers.add(new Customer("1018","Peter","Male",24));
        customers.add(new Customer("1019","Sara","Female",23));
        customers.add(new Customer("1010","Rose","Female",23));
        customers.add(new Customer("1001","Emma","Female",30));
    }

    @RequestMapping (value = "/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers(){return customers;}
    @RequestMapping (value = "/customerByID/{id}", method = RequestMethod.GET)
    public List<Customer> getCustomerByID(@PathVariable("id") String ID){
        for(Customer person:customers){
            if(person.getID().equals(ID)){
                result.add(person);
//                return person;
            }
        }
        return result;
    }
    @RequestMapping (value = "/customerByName/{n}", method = RequestMethod.GET)
    public List<Customer> getCustomerByName(@PathVariable("n") String name){
        for(Customer person:customers){
            if(person.getName().equals(name)){
                result.add(person);
            }
        }
        return result;
    }
    @RequestMapping (value = "/customerDelByid/{id}", method = RequestMethod.DELETE)
    public List<Customer> delCustomerByID(@PathVariable("id") String ID){
        for(Customer person:customers){
            if(person.getID().equals(ID)){
                customers.remove(person);
            }
        }
        return customers;
    }
    @RequestMapping (value = "/customerDelByName/{n}", method = RequestMethod.DELETE)
    public List<Customer> delCustomerByName(@PathVariable("n") String name){
        for(Customer person:customers){
            if(person.getName().equals(name)){
                customers.remove(person);
            }
        }
        return customers;
    }
    @RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
    public List<Customer> addCustomer(@RequestParam("ID") String ID,
                                      @RequestParam("n") String Name,
                                      @RequestParam("s") String Sex,
                                      @RequestParam("a") int Age){
        customers.add(new Customer(ID,Name,Sex,Age));
        return customers;
    }





}
