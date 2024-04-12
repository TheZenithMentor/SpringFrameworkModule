package org.zenith.spring.springcore.autowiring.xmlbased;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zenith.spring.springcore.datadependecies.list.Hospital;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("main/java/org/zenith/spring/springcore/autowiring/xmlbased/xmlbasedautowire.xml");
        Employee employee = (Employee) ctx.getBean("employee");
        System.out.println(employee);
    }
}
