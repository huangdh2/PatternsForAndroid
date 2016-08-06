package com.example.treahuang.petterns_demo.abstract_factory_pattern;

public class Benz extends Car{

	public Benz(){
		System.out.println("Create a Benz");
	}
	
	public String drive(){
		return "Benz start engine";
	}
}
