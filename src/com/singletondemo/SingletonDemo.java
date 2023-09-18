package com.singletondemo;

public class SingletonDemo {

	
	static SingletonDemo sd = new SingletonDemo();
	
	private SingletonDemo() {
		System.out.println("singleton constructor");
	}
	
	static SingletonDemo getInstance() {
		return sd;
	}
	
	public static void main(String[] args) {

		SingletonDemo sd1 = SingletonDemo.getInstance();
		SingletonDemo sd2 = SingletonDemo.getInstance();
	}

}
