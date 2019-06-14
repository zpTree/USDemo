package com.example.demo.test.model;


public class Test {

    private String uuid;
    private String name;
    private int age;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
