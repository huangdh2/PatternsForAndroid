package com.example.treahuang.petterns_demo.state_pattern;

/**
 * Created by Trea Huang on 2016/8/6.
 * 自动售货机主体类
 */

public class VendingMachine {
    private State noMoneyState;
    private State hasMoneyState;
    private State soldState;

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public void setNoMoneyState(State noMoneyState) {
        this.noMoneyState = noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public void setHasMoneyState(State hasMoneyState) {
        this.hasMoneyState = hasMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    private State soldOutState;
    private State winnerState;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    private int count = 0;
    private State currentState = noMoneyState;

    public VendingMachine(int count) {
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        if (count > 0) {
            this.count = count;
            currentState = noMoneyState;
        }
    }

    public String insertMoney() {
        return currentState.insertMoney();
    }

    public String backMoney() {
        return currentState.backMoney();
    }

    public String turnCrank() {
        String string = currentState.turnCrank();
        if (currentState == soldState || currentState == winnerState)
            string = string + currentState.dispense();
        return string;
    }

    public String dispense() {
        if (count != 0) {
            count -= 1;
        }
        return "发出一件商品...";
    }

    public void setState(State state) {
        this.currentState = state;
    }
}
