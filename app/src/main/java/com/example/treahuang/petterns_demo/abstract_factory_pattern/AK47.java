package com.example.treahuang.petterns_demo.abstract_factory_pattern;

public class AK47 extends Gun{

	public AK47(){
		System.out.println("Create an AK47");
	}
	
	public String fire(){
		return "AK47 start fire\n";
	}
}
