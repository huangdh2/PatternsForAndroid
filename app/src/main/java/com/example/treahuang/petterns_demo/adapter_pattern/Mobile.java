package com.example.treahuang.petterns_demo.adapter_pattern;

/**
 * Created by Trea Huang on 2016/8/6.
 */

public class Mobile {
    /**
     * 充电
     *
     * @param power
     */
    public String inputPower(V5Power power) {
        int provideV5Power = power.provideV5Power();
        return "手机（客户端）：我需要5V电压充电，现在是-->" + provideV5Power + "V";
    }
}
