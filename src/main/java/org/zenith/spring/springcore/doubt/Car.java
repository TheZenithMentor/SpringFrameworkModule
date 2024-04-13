package org.zenith.spring.springcore.doubt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Value("skoda")
    private String cname;

    @Autowired
    private Engine engine;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cname='" + cname + '\'' +
                ", engine=" + engine +
                '}';
    }
}
