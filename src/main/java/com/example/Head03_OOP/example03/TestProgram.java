package com.example.Head03_OOP.example03;

public class TestProgram {
    public static void main(String[] args) {
//        Order order = new Order();

//        Order order = new Order("1212", true);
        Order order = new Order("문자열", "김경한");
        System.out.println(order.getOrderId());
        System.out.println(order.isPaid());

        order.setOrderId("김김김");
        order.setPaid(false);

        System.out.println(order.getOrderId());
        System.out.println(order.isPaid());

    }
}
