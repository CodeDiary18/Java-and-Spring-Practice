package com.example.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Encoder {
    private IEncoder iEncoder;

/*
    public Encoder(@Qualifier("urlEncoder") IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }
*/

    public Encoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public String encode(String message) {
        return iEncoder.encode(message);
    }

    public void setIEncoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }
}
