package org.zenith.spring.springcore.stereotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zenith.spring.springcore.primitive.Employee;

public class TestInstructor {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("main/java/org/zenith/spring/springcore/stereotype/stereoconfig.xml");
        Instructor instructor = (Instructor) ctx.getBean("instructor");
        System.out.println(instructor.hashCode());
        Instructor instructor1 = (Instructor) ctx.getBean("instructor");
        System.out.println(instructor1.hashCode());
        System.out.println(instructor);
    }
}
