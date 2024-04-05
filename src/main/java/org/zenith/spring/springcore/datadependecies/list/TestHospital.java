package org.zenith.spring.springcore.datadependecies.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHospital {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("main/java/org/zenith/spring/springcore/datadependecies/list/listconfig.xml");
        Hospital hospital = (Hospital) ctx.getBean("hospital");
        System.out.println(hospital);
    }
}
