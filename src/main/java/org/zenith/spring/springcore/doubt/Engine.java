package org.zenith.spring.springcore.doubt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

    @Value("12")
    private String eno;

    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "eno='" + eno + '\'' +
                '}';
    }
}
