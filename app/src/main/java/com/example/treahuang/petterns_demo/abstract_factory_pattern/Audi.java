package com.example.treahuang.petterns_demo.abstract_factory_pattern;

public class Audi extends Car{

	public Audi(){
		System.out.println("Create a Audi");
	}
	
	public String drive(){
		return "Audi start engine\n";
	}
}
