package com.zoo.animals;

public class Runner {

	public static void main (String[] args) {
		Animal animal1 = new Animal();
		animal1.eat(1);
		Dog tuzik = new Dog(15);
		Fish goldFish = new Fish();//Fish goldFish = new Fish(12, "0-0-0-0-0");
		goldFish.setWeight(12);
		goldFish.setBubbles("0-0-0-0-0");
		
		System.out.println("weight of dog:" + tuzik.getWeight());
		boolean flag = tuzik.eat(2);
		System.out.println("weight of dog:" + tuzik.getWeight());
		tuzik.eat(5);
		System.out.println("weight of dog:" + tuzik.getWeight());
	}
}
