package com.wbg.FactoryMode;

public class SimplePowderFactor {
    public static final int TYPE_LZ = 1;//桂林米粉
    public static final int TYPE_PM = 2;//螺蛳粉
    public static Powder createNoodles(int type) {
    if(type==1){
        return new GlPowder();
    }else {
        return new LsfPowder();
    }
    }
}
