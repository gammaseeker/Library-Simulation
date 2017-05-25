package Simulator;
import java.util.*;

import Objects.Book;
import Objects.Person;

public class CheckOut implements Runnable{

	public Queue<Person> line = new ArrayDeque<Person>();
	public CheckOut(Queue<Person> line)
	{
		this.line = line;
	}

	
	@Override
	public void run() {
		while(!line.isEmpty())
		{
			System.out.println(line.remove() + "\n");
		}
		
		
	}
}
