package oop;

public class Bus extends Car {

	@Override
	public int people() {
		return super.people()+1;
	}
	
	public int people() {
		return adult +child;
	}
}
