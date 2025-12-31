package com.example.Head02_JavaProgramming;

public class IfExample {
    public static void main(String[] args) {
        int score = 105;

        if (false) {
            System.out.println("A 학점");
        } else if (false) {
            System.out.println("B 학점");
        } else {
            System.out.println("C 이하");
        }

        boolean flag = false;
        int num = flag ? 20 : 30;
        System.out.println(num);

        /// ///////
        ///

        /**
         * 안녕하세요 코드입니다.
         */

        int age = 20;
        boolean isStudent = true;

        if (age >= 18) {
            if (isStudent) {
                System.out.println("성인 학생");
            }
        }
    }
}
