package com.泛型;

import java.sql.SQLOutput;

public class InterfaceFanTest<B> implements InterfaceFanXing<B>{
private B b;

    @Override
    public B test() {
        return b;
    }

    @Override
    public void test1(B b) {
        System.out.println(b);
    }
}
