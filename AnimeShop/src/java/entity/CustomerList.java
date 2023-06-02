/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class CustomerList {
    private static Customer[] customers;
    private static ArrayList<Customer> customerbyCardAccountNumber = new ArrayList<>();

    
    Address address1 = new Address("Людникова",17,249);
     Address address2 = new Address("Чкалова",19,43);
      Address address3 = new Address("Луговая",9,9);
    
    static {
        customers = new Customer[3];
        customers[0] = new Customer(1, "Кунсманайте","Эвелина", "Арвидасовна","25661GHCV4412",123456);
        customers[1] = new Customer(2, "Рябицкий","Андрей", "Викторович","854512hjkhftfg56653",654321);
        customers[2] = new Customer(3, "Драбков","Дмитрий", "Александрович","45145jhjjk542544",321654);
    }
    
     public static List<Customer> getCustomer() {
        return Arrays.asList(customers);
    }

    public static ArrayList<Customer> getCustomerbyCardAccountNumber(int from, int to) {
                
        for (Customer customer : getCustomer()) {
            if (from < customer.getCardAccountNumber() && customer.getCardAccountNumber() < to){
customerbyCardAccountNumber.add(customer);
        }
}
        return customerbyCardAccountNumber;
    }
  
}
