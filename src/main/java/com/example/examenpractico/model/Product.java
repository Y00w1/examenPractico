package com.example.examenpractico.model;

public class Product {
    private String code;
    private String name;
    private Double price;
    private Integer amount;
    private String category;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Product(String code, String name, Double price, Integer amount, String category) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.category = category;
    }
}
