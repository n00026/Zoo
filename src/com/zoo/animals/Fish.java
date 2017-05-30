package com.zoo.animals;

public class Fish extends Animal implements IMove{
	
	private String bubbles = "q-q";
	
	public Fish() {}
	
	public Fish(int animalWeight) {
		super(animalWeight);
	}

	public Fish(int fishWeight, String bubblesText) {
		super(fishWeight);
		this.bubbles = bubblesText;
	}

	public Fish(String bubblesText) {
		
		this.bubbles = bubblesText;
	}

	
	@Override
	public boolean eat(int foodWeight) {
		System.out.println("... .... "+ foodWeight + " kg");
		int weight = getWeight();
		setWeight(weight+foodWeight);
		return true;
	}

	@Override
	public boolean move(String direction, int steps) {
		for (int i = 0; i < steps; i++) {
			System.out.println(bubbles);
		}
		System.out.println("Move to the "+ direction + ", for " + steps + " movements ");
		
		return true;
	}

	public String getBubbles() {
		return bubbles;
	}

	public void setBubbles(String bubbles) {
		this.bubbles = bubbles;
	}
}
