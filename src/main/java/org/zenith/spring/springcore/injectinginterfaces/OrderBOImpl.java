package org.zenith.spring.springcore.injectinginterfaces;

public class OrderBOImpl implements OrderBO{

    private OrderDaoImpl orderDao;

    public OrderDaoImpl getOrderDao() {
        return orderDao;
    }

    public void setOrderDao(OrderDaoImpl orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public String toString() {
        return "OrderBOImpl{" +
                "orderDao=" + orderDao +
                '}';
    }

    @Override
    public void placeOrder() {
        orderDao.createOrder();
        System.out.println("placing order");
    }
}
