package com.example.Head03_OOP.example08;

class SeungHyun {
    private int userId;
    private String userName;

    public SeungHyun(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public void SeungHa (){
        System.out.println("승하~");
    }
}

public class SeungHyunTest {
    public static void main(String[] args) {
        SeungHyun seungHyun = new SeungHyun(12,"김김김");
        seungHyun.SeungHa();
    }
}
