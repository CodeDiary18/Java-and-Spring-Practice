package com.example.calculator.component;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DollarCalculator implements ICalculator{
    private int market = 0;
    private final MarketApi marketServer;

    @Override
    public void init(){
        this.market = marketServer.connect();
    }

    @Override
    public int sum(int x, int y) {
        x *= market;
        y *= market;
        return x + y ;
    }

    @Override
    public int minus(int x, int y) {
        x *= market;
        y *= market;
        return x - y;
    }

    @Override
    public int multiply(int x, int y) {
        x *= market;
        y *= market;
        return x * y;
    }

    @Override
    public int division(int x, int y) {
        x *= market;
        y *= market;
        return x / y;
    }
}
