package com.example.treahuang.petterns_demo.decorator_pattern;

/**
 * Created by Trea Huang on 2016/8/6.
 * 装备接口
 */

public interface IEquip {
    /**
     * 计算攻击力
     *
     * @return
     */
    public int caculateAttack();

    /**
     * 装备的描述
     *
     * @return
     */
    public String description();
}
