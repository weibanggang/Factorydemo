package com.wbg.FactoryMode;

public abstract class AbstractFoodFactory {
    /**
     * 生产面条
     *
     * @return
     */
    public abstract Powder createPowder();

    /**
     * 生产饮料
     */
    public abstract IDrinks createDrinks();
}
