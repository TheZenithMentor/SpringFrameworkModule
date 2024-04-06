package org.zenith.spring.springcore.datadependecies.referencetype;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zenith.spring.springcore.datadependecies.properties.Country;

public class TestStudent {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("main/java/org/zenith/spring/springcore/datadependecies/referencetype/refconfig.xml");
        Student std = (Student) context.getBean("student");
        System.out.println(std);
    }
}
