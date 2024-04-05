package org.zenith.spring.springcore.datadependecies.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSchool {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("main/java/org/zenith/spring/springcore/datadependecies/map/mapconfig.xml");
        School school = (School) context.getBean("school");
        System.out.println(school);
    }
}
