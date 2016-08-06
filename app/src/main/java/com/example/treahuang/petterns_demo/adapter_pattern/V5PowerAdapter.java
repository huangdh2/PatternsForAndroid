package com.example.treahuang.petterns_demo.adapter_pattern;

/**
 * Created by Trea Huang on 2016/8/6.
 */

public class V5PowerAdapter implements V5Power {

    /**
     * 组合的方式
     */
    private V220Power v220Power;

    public V5PowerAdapter(V220Power v220Power) {
        this.v220Power = v220Power;
    }

    @Override
    public int provideV5Power() {
        int power = v220Power.provideV220Power();
        return 5;
    }
}
