package com.wbg.FactoryMode;

public class createGlFactory extends PowderFactory{
    @Override
    public Powder create() {
        return new GlPowder();
    }
}
