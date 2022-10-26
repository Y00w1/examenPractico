package com.example.examenpractico.model;

public class Client extends User{
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Client(String id, String username, String phone, String email, String address) {
        super(id, username, phone, email);
        this.address = address;
    }
}
