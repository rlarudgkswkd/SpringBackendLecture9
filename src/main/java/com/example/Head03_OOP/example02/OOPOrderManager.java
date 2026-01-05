package com.example.Head03_OOP.example02;

public class OOPOrderManager {
    public static void main(String[] args) {
        Order order = new Order("Alice", "Book", 2, 15000);
        Order order1 = new Order("혜민", "폭풍의언덕", 1, 25000);
        Order order2 = new Order("유빈", "동물농장", 1, 15000);
        order.printOrderSummary();
    }
}