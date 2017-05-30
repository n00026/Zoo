package com.zoo.animals;

public class Cat extends Animal implements IMove {
	
	private int restTime;
	public Cat() {}
	
	public Cat(int animalWeight) {
		super(animalWeight);
	}

	
	@Override
	public boolean eat(int foodWeight) {
		System.out.println("Miau-miau, eat "+ foodWeight + " kg of food, pur-r-r");
		int weight = getWeight();
		setWeight(weight+foodWeight);
		return true;
	}

	@Override
	public boolean move(String direction, int steps) {
		if ( steps % 2 == 0) {
			System.out.println("Move to the "+ direction + ", for " + steps + " ... ");
			System.out.println("ur-r-r-r");
			return true;
		}
		System.out.println("miau-u-u-u");
		return false;
	}

	public int getRestTime() {
		return restTime;
	}

	public void setRestTime(int restTime) {
		this.restTime = restTime;
	}
}
