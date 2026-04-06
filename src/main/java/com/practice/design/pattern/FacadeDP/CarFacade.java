package com.practice.design.pattern.FacadeDP;

public class CarFacade {

	private Engine engine = new Engine();
	private Fuel fuel = new Fuel();
	private Battery battery = new Battery();

	public void startCar() {
		engine.startEngine();
		fuel.pumpFuel();
		battery.on();
	}
}
