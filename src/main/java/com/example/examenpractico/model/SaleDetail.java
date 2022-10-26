package com.example.examenpractico.model;

import java.util.ArrayList;

public class SaleDetail {
    private ArrayList<Product> products;
    private Double totalPrice;

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public SaleDetail(ArrayList<Product> products, Double totalPrice) {
        this.products = products;
        this.totalPrice = totalPrice;
    }
}
