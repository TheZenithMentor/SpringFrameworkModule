package org.zenith.spring.springcore.primitive;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("main/java/org/zenith/spring/springcore/primitive/springconfig.xml");
        Employee emp = (Employee) ctx.getBean("employee");
        System.out.println(emp);
    }
}
