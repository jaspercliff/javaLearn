package com.jasper.factory;

public class CoinFactory {
    public static Coin getInstance(CoinType type) {
        return type.getConstructor().get();
    }
}
