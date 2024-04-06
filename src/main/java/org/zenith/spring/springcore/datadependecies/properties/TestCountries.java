package org.zenith.spring.springcore.datadependecies.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCountries {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("main/java/org/zenith/spring/springcore/datadependecies/properties/propconfig.xml");
        Country country = (Country) context.getBean("country");
        System.out.println(country);
    }
}
