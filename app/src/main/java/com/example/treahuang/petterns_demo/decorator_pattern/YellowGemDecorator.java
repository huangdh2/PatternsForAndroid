package com.example.treahuang.petterns_demo.decorator_pattern;

/**
 * Created by Trea Huang on 2016/8/6.
 */

public class YellowGemDecorator implements IEquipDecorator {
    /**
     * 每个装饰品维护一个装备
     */
    private IEquip equip;

    public YellowGemDecorator(IEquip equip) {
        this.equip = equip;
    }


    @Override
    public int caculateAttack() {
        return 7 + equip.caculateAttack();
    }

    @Override
    public String description() {
        return equip.description() + "黄宝石强化1";
    }
}
