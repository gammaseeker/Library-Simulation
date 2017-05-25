package Simulator;

import Objects.Person;

public class Simulator implements Runnable{
	
	public Simulator()
	{
		
	}

	@Override
	public void run() {
		System.out.println(createPerson());
		System.out.println();
		System.out.println(createPerson());
		System.out.println();
		System.out.println(createPerson());
		
	}
	
	private Person createPerson()
	{
		String[] first = {"John", "Steve", "Bob", "James"};
		String[] last = {"Doe", "Smith", "Jenson", "Gates"};
		return new Person(first[getRandomIndex(0, first.length)], last[getRandomIndex(0, last.length)], 1);
	}
	
	private int getRandomIndex(int lower, int upper)
	{
		return (int)(Math.random() * (upper - lower)) + lower;
	}
}
