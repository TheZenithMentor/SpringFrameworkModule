package org.zenith.spring.springcore.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zenith.spring.springcore.datadependecies.list.Hospital;

public class TestCar {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("main/java/org/zenith/spring/springcore/constructorinjection/config2.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
    }
}
