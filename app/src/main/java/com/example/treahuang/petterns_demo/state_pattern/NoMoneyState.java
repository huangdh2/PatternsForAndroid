package com.example.treahuang.petterns_demo.state_pattern;

/**
 * Created by Trea Huang on 2016/8/6.
 */

public class NoMoneyState implements State{
    private VendingMachine machine;

    public NoMoneyState(VendingMachine machine)
    {
        this.machine = machine;

    }

    @Override
    public String insertMoney() {
        String string = "投币成功";
        machine.setState(machine.getHasMoneyState());
        return string;
    }

    @Override
    public String backMoney() {
        return "您未投币，想退钱？...";
    }

    @Override
    public String turnCrank() {
        return "您未投币，想拿东西么？...";
    }

    @Override
    public String dispense() {
        throw new IllegalStateException("非法状态！");
    }
}
