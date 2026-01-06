package com.example.Head03_OOP.example07;

class User {
    protected String userId;
    protected String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public void printUserInfo() {
        System.out.println("ID: " + userId + ", 이름: " + name);
    }
}

class PersonalUser extends User {
    private String email;

    public PersonalUser(String id, String name, String email) {
        super(id, name);
        this.email = email;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("이메일: " + email);
    }
}

//클래스 -> 객체
// 객체를 만들려면 ? 뭔가 필요? -> 생성자 (메서드)
// new Something() -> 생성자(메서드)를 사용한다는 의미

public class InheritanceTest {
    public static void main(String[] args) {
        User u = new PersonalUser("U001", "Alice", "alice@example.com");
        u.printUserInfo();
    }
}