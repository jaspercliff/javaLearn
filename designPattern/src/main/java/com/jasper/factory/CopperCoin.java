package com.jasper.factory;

public class CopperCoin implements Coin{
    static final String DESCRIPTION = "this is Copper Coin";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
