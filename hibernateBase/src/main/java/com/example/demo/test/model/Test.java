package com.example.demo.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TEST")
public class Test extends BaseEntity{

    @Column(name = "AGE")
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test{" +
                "age=" + age +
                '}';
    }
}
