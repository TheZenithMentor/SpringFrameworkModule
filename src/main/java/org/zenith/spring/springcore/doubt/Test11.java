package org.zenith.spring.springcore.doubt;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zenith.spring.springcore.autowiring.xmlbased.Employee;

public class Test11 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("main/java/org/zenith/spring/springcore/doubt/doubt.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
    }
}
