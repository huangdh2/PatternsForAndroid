package com.example.treahuang.petterns_demo.observer_pattern;

import java.util.Observable;

/**
 * Created by Trea Huang on 2016/8/6.
 * 双色球
 */

public class SubjectForSSQ extends Observable {

    private String msg;


    public String getMsg() {
        return msg;
    }


    /**
     * 主题更新消息
     *
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers();
    }
}
