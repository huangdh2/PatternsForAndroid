package com.example.treahuang.petterns_demo.state_pattern;

import java.util.Random;

/**
 * Created by Trea Huang on 2016/8/6.
 */

public class HasMoneyState implements State {

    private VendingMachine machine;
    private Random random = new Random();

    public HasMoneyState(VendingMachine machine)
    {
        this.machine = machine;
    }

    @Override
    public String insertMoney() {
        return "您已经投过币了，无需再投....";
    }

    @Override
    public String backMoney() {
        String string = "退币成功";
        machine.setState(machine.getNoMoneyState());
        return string;
    }

    @Override
    public String turnCrank() {
        int winner = random.nextInt(10);
        if (winner == 0 && machine.getCount() > 1)
        {
            machine.setState(machine.getWinnerState());
        } else
        {
            machine.setState(machine.getSoldState());
        }
        return "你转动了手柄";
    }

    @Override
    public String dispense() {
        throw new IllegalStateException("非法状态！");
    }
}
