package org.zenith.spring.springcore.autowiring.xmlbased;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private Address address;


    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }

    @Autowired
    public Employee(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
