package com.wbg.FactoryMode;

public class createLsfFactory extends PowderFactory {
    @Override
    public Powder create() {
        return new LsfPowder();
    }
}
