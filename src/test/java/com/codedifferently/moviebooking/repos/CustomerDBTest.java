package com.codedifferently.moviebooking.repos;

import com.codedifferently.moviebooking.person.customer.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

public class CustomerDBTest {
    private Repository <Customer> CustomerDataBase;
    private Customer testCustomer;

    @BeforeEach
    public void setup()throws ParseException {
        CustomerDataBase = new RepositoryImpl<>();
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        testCustomer = new Customer("John", "Smith", format.parse("01-01-2000"));
    }

    @Test
    @DisplayName("Create New Customer")
    public void saveCustomerTes01()  {
        String actual = CustomerDataBase.save(testCustomer).getId();
        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("Update Customer")
    public void saveCustomerTes02()  {
        testCustomer.setId("save-"+3l);
        CustomerDataBase.save(testCustomer);
        Optional<Customer> CustomerOptional = CustomerDataBase.findById("save-"+3l);
        Assertions.assertTrue(CustomerOptional.isPresent());

    }

    @Test
    @DisplayName("Find All")
    public void findAllTest()  {
        CustomerDataBase.save(testCustomer);
        List<Customer> actualList = CustomerDataBase.findAll();
        Integer expected = 1;
        Integer actual = actualList.size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Delete")
    public void deleteTest(){
        Customer Customer = CustomerDataBase.save(testCustomer);
        String CustomerID = Customer.getId();
        CustomerDataBase.delete(CustomerID);
        Optional<Customer> findCustomer = CustomerDataBase.findById(CustomerID);
        Assertions.assertTrue(findCustomer.isEmpty());
    }
}
