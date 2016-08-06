package com.example.treahuang.petterns_demo.decorator_pattern;

/**
 * Created by Trea Huang on 2016/8/6.
 * 护腕
 * 攻击力 5
 */

public class WristEquip implements IEquip {
    @Override
    public int caculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战护腕";
    }
}
