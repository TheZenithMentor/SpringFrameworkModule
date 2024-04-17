package org.zenith.spring.springcore.constructorinjection;

public class Car {
    private String cname;

    public Car(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
