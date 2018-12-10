package com.wbg.FactoryMode;

public class StaticPowderFactor {
    /**
     * 传入Class实例化粉产品类
     *
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T extends Powder>T createPowder(Class<T> tClass){
        T result=null;
        try {
            result= (T) Class.forName(tClass.getName()).newInstance();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}
