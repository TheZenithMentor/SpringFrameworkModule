package org.zenith.spring.springcore.injectinginterfaces;

public class OrderDaoImpl implements  OrderDao{

    @Override
    public void createOrder() {
        System.out.println("Creating order");
    }
}
