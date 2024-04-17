package org.zenith.spring.springcore.propertiesfileread;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zenith.spring.springcore.primitive.Employee;

public class TestDao {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("main/java/org/zenith/spring/springcore/propertiesfileread/dao.xml");
        MyDAO dao = (MyDAO) ctx.getBean("myDao");
        System.out.println(dao);
    }
}
