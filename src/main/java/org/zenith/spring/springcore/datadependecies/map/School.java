package org.zenith.spring.springcore.datadependecies.map;

import java.util.Map;

public class School {
    private String schoolName;

    private Map<Integer,Integer> studentRegistered;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Map<Integer, Integer> getStudentRegistered() {
        return studentRegistered;
    }

    public void setStudentRegistered(Map<Integer, Integer> studentRegistered) {
        this.studentRegistered = studentRegistered;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", studentRegistered=" + studentRegistered +
                '}';
    }
}
