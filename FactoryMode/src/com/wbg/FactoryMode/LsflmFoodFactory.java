package com.wbg.FactoryMode;

public class LsflmFoodFactory extends AbstractFoodFactory {
    @Override
    public Powder createPowder() {
        return new LsfPowder();//螺蛳粉
    }

    @Override
    public IDrinks createDrinks() {
        return new WaterDrinks();//卖水
    }
}
