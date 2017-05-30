package com.zoo.animals;

public class Dog extends Animal implements IMove{
	
	private int runSpeed;
	
	public Dog() {}
	
	public Dog(int animalWeight) {
		super(animalWeight);
	}

	
	@Override
	public boolean eat(int foodWeight) {
		System.out.println("niam-niam "+ foodWeight + " kg");
		int weight = getWeight();
		setWeight(weight+foodWeight);
		return true;
	}

	@Override
	public boolean move(String direction, int steps) {
		System.out.println("Move to the "+ direction + ", for " + steps + " steps. Gav-Gav.");
		return true;
	}

	public int getRunSpeed() {
		return runSpeed;
	}

	public void setRunSpeed(int runSpeed) {
		this.runSpeed = runSpeed;
	}
}
