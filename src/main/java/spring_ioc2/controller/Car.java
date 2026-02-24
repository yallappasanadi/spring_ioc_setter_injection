package spring_ioc2.controller;

public class Car {
	
	Engine engine;
	
	public Car() {
		System.out.println("Engine object is created");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void callMethod() {
		engine.insert();
	}
	
	
}
