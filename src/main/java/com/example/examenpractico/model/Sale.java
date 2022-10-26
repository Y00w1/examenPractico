package com.example.examenpractico.model;

import java.time.LocalDate;

public class Sale {
    private String id; //work as a sales number
    private LocalDate date;
    private Client client;
    private SaleDetail detail;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public SaleDetail getDetail() {
        return detail;
    }

    public void setDetail(SaleDetail detail) {
        this.detail = detail;
    }

    public Sale(String id, LocalDate date, Client client, SaleDetail detail) {
        this.id = id;
        this.date = date;
        this.client = client;
        this.detail = detail;
    }
}
