package com.company.design.facade;

public class Main {
    public static void main(String[] args) {
        SftpClient sftpClient = new SftpClient("www.foo.co.kr",22,"/home/etc","text.tmp");
        sftpClient.connect();
        sftpClient.writer();
        sftpClient.read();
        sftpClient.disConnect();
    }
}
