package org.zenith.spring.springcore.injectinginterfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zenith.spring.springcore.primitive.Employee;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("main/java/org/zenith/spring/springcore/injectinginterfaces/spring9config.xml");
        OrderBO orderBO = (OrderBO) ctx.getBean("orderBO");
        orderBO.placeOrder();
    }
}
