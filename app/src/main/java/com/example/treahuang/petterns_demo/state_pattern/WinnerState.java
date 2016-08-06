package com.example.treahuang.petterns_demo.state_pattern;

/**
 * Created by Trea Huang on 2016/8/6.
 */

public class WinnerState implements State {

    private VendingMachine machine;

    public WinnerState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public String insertMoney() {
        throw new IllegalStateException("非法状态");
    }

    @Override
    public String backMoney() {
        throw new IllegalStateException("非法状态");
    }

    @Override
    public String turnCrank() {
        throw new IllegalStateException("非法状态");
    }

    @Override
    public String dispense() {
        String string = "你中奖了，恭喜你，将得到2件商品";
        machine.dispense();

        if (machine.getCount() == 0) {
            string = "商品已经售罄";
            machine.setState(machine.getSoldOutState());
        } else {
            machine.dispense();
            if (machine.getCount() > 0) {
                machine.setState(machine.getNoMoneyState());
            } else {
                string = "商品已经售罄";
                machine.setState(machine.getSoldOutState());
            }

        }
        return string;
    }
}
