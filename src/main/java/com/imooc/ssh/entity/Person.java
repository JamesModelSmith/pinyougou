package com.imooc.ssh.entity;

import javax.persistence.*;

@Entity
@Table(name="person")
public class Person {
    private String id;
    private String name;
    private String idCard;
    private String phone;
    private String address;
    @Id
    @Column(name="id",nullable = false,length = 32,unique = true)
    @GeneratedValue(generator = "generator")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
