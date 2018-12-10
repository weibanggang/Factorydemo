package com.wbg.FactoryMode;

public class VariedPowderFactor {
    /**
     * 生产桂林米粉
     * @return
     */
    public static Powder createGl(){
        return new GlPowder();
    }
    /**
     * 生产螺丝粉
     * @return
     */
    public static Powder createLsf(){
        return new LsfPowder();
    }
}
