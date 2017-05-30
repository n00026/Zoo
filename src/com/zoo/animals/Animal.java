package com.zoo.animals;

public class Animal implements IAnimal{

	private int weight;
	
	public Animal() {}

	public Animal(int animalWeight) {
		weight = animalWeight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public boolean eat(int foodWeight) {
		return false;
	}
}
