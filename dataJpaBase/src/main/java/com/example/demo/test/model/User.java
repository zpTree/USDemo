package com.example.demo.test.model;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String userName;

    @Column(columnDefinition = "varchar(255) comment '居住地址'")
    private String homeAddress;

    private Long homeTel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Long getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(Long homeTel) {
        this.homeTel = homeTel;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", homeTel=" + homeTel +
                '}';
    }
}
