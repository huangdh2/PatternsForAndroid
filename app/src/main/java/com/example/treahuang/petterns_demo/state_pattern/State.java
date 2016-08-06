package com.example.treahuang.petterns_demo.state_pattern;

/**
 * Created by Trea Huang on 2016/8/6.
 *
 * 状态接口
 */

public interface State {
    /**
     * 放钱
     */
    public String insertMoney();
    /**
     * 退钱
     */
    public String backMoney();
    /**
     * 转动曲柄
     */
    public String turnCrank();
    /**
     * 出商品
     */
    public String dispense();
}
