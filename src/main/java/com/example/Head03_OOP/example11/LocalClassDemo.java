package com.example.Head03_OOP.example11;

import java.util.ArrayList;
import java.util.List;

public class LocalClassDemo {
    public void executeTask() {
        int taskId = 999;  // Java 8 이후로는 사실상 final이면 가능

//        taskId = 32;
        // 메소드 내부에 클래스 정의
        class LocalWorker {
            public void run() {
                System.out.println("LocalWorker started with taskId = " + taskId);
            }
        }
//        taskId = 32;

        LocalWorker worker = new LocalWorker();
        worker.run();
    }

    public static void main(String[] args) {
        LocalClassDemo demo = new LocalClassDemo();

        List<Integer> list = new ArrayList<>();
        demo.executeTask();
    }
}

