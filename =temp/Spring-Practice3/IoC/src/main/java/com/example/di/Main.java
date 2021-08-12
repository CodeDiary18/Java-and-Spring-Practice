package com.example.di;

public class Main {
    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        Encoder encoder1 = new Encoder(new Base64Encoder());
        System.out.println(encoder1.encode(url));

        Encoder encoder2 = new Encoder(new UrlEncoder());
        System.out.println(encoder2.encode(url));
    }
}