package com.company;

public class Person {
    String name;
    int balance;
    Company company;
    void sendMoney (Person otherPerson, int amount) {
        otherPerson.balance += amount;
        this.balance -= amount;
    }
}
