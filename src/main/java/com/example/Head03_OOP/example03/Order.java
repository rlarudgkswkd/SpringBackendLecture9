package com.example.Head03_OOP.example03;

public class Order {
    private String orderId;
    private boolean isPaid;
    private String name;

    public Order(String orderId, boolean isPaid) {
        this.orderId = orderId;
        this.isPaid = isPaid;
    }

    public Order(String orderId, String name) {
        this.orderId = orderId;
        this.name = name;
    }

    public String getOrderId() {
        return orderId;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    //getter or setter 생성 법 실습
}