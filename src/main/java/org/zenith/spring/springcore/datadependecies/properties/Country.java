package org.zenith.spring.springcore.datadependecies.properties;

import java.util.Properties;

public class Country {
    // pojo : plain old java object

    private Properties stateAndLanguages;

    public Properties getStateAndLanguages() {
        return stateAndLanguages;
    }

    public void setStateAndLanguages(Properties stateAndLanguages) {
        this.stateAndLanguages = stateAndLanguages;
    }

    @Override
    public String toString() {
        return "Country{" +
                "stateAndLanguages=" + stateAndLanguages +
                '}';
    }
}
