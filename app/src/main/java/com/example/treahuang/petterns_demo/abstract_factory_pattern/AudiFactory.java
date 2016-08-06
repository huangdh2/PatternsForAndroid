package com.example.treahuang.petterns_demo.abstract_factory_pattern;

public class AudiFactory extends AbstractFactory{

	public Car getCar() {		
		return new Audi();		
	}

	public Gun getGun() {
		return new AK47();
	}
}
