package com.wbg.FactoryMode;

public class hodelFoodFactory extends AbstractFoodFactory {
    @Override
    public Powder createPowder() {
        return new GlPowder();//桂林米粉很好吃，酒店都有了
    }

    @Override
    public IDrinks createDrinks() {
        return new ColaDrinks();//卖可乐
    }
}
