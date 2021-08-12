package com.example.hello.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class User2 {
    private String name;
    private int age;

    @JsonProperty("phone_number")
    private String phoneNumber;

    public User2(){
        this.name = null;
        this.age = 0;
        this.phoneNumber = null;
    }

    public User2 defaultUser(){
        return new User2("default",0);
    }

    public User2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User2(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
