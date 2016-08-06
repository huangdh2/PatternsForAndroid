package com.example.treahuang.petterns_demo.observer_pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Trea Huang on 2016/8/6.
 */

public class Observer1 implements Observer {

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    String temp = "";

    public void registerSubject(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object data) {
        if (observable instanceof SubjectFor3d) {
            SubjectFor3d subjectFor3d = (SubjectFor3d) observable;
            temp = ("subjectFor3d's msg -- >" + subjectFor3d.getMsg());
        }

        if (observable instanceof SubjectForSSQ) {
            SubjectForSSQ subjectForSSQ = (SubjectForSSQ) observable;
            temp = ("subjectForSSQ's msg -- >" + subjectForSSQ.getMsg());
        }
    }
}
