package com.example.examenpractico.model;

public class Client extends User{
    private String address;
    private Integer age;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Client(String id, String username, String phone, String email, String address, Integer age) {
        super(id, username, phone, email);
        this.address = address;
        this.age = age;
    }
}
