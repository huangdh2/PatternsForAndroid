package com.example.treahuang.petterns_demo.state_pattern;

/**
 * Created by Trea Huang on 2016/8/6.
 */

public class SoldState implements State {
    private VendingMachine machine;

    public SoldState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public String insertMoney() {
        return "正在出货，请勿投币";
    }

    @Override
    public String backMoney() {
        return "正在出货，没有可退的钱";
    }

    @Override
    public String turnCrank() {
        return "正在出货，请勿重复转动手柄";
    }

    @Override
    public String dispense() {
        String string  = machine.dispense();
        if (machine.getCount() > 0)
        {
            machine.setState(machine.getNoMoneyState());
        } else
        {
            string = "商品已经售罄";
            machine.setState(machine.getSoldOutState());
        }
        return string;
    }
}
