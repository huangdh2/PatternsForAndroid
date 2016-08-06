package com.example.treahuang.petterns_demo.state_pattern;

/**
 * Created by Trea Huang on 2016/8/6.
 */

public class SoldOutState implements State {

    private VendingMachine machine;

    public SoldOutState(VendingMachine machine)
    {
        this.machine = machine;
    }

    @Override
    public String insertMoney() {
        return "投币失败，商品已售罄";
    }

    @Override
    public String backMoney() {
        return "您未投币，想退钱么？...";
    }

    @Override
    public String turnCrank() {
        return "商品售罄，转动手柄也木有用";
    }

    @Override
    public String dispense() {
        throw new IllegalStateException("非法状态！");
    }
}
