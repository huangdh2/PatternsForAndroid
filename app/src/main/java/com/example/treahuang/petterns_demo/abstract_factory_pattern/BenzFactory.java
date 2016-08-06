package com.example.treahuang.petterns_demo.abstract_factory_pattern;

public class BenzFactory extends AbstractFactory{

	public Car getCar() {		
		return new Benz();		
	}

	public Gun getGun() {
		return new M4A1();
	}
}
