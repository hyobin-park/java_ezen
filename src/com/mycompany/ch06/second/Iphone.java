package com.mycompany.ch06.second;

public class Iphone {

	// field
	String cpu;
	int memory;
	String color;
	
	Iphone() {
		
	}
	
	Iphone (String cpu) {
		this.cpu = cpu;
	}
	
	Iphone (String cpu, int memory) {
		this.cpu = cpu;
		this.memory = memory;
	}
	
	Iphone (String cpu, int memory, String color) {
		this.cpu = cpu;
		this.memory = memory;
		this.color = color;
	}
	
	
	
}
