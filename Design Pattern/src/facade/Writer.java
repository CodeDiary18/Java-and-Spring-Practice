package com.company.design.facade;

public class Writer {
    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Writer %s로 연결",fileName);
        System.out.println(msg);
    }

    public void fileDisconnect(){
        String msg = String.format("Writer %s로 연결 종료",fileName);
        System.out.println(msg);
    }

    public void write(){
        String msg = String.format("Writer %s로 파일 쓰기",fileName);
        System.out.println(msg);
    }
}
