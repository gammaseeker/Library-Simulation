package Objects;

public class Person {
	private String firstName;
	private String lastName;
	private Book[] items;
	private int libraryId;
	private double fees;
	
	public Person(String firstName, String lastName, int libraryId)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.libraryId = libraryId;
	}
	
	public Person(String firstName, String lastName, int libraryId, Book[] items, double fees)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.libraryId = libraryId;
		this.items = items;
		this.fees = fees;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public Book[] getBooks()
	{
		return this.items;
	}
	
	public int getLibraryId()
	{
		return this.libraryId;
	}
	
	public double getFees()
	{
		return this.fees;
	}
	
	public void setBooks(Book[] items)
	{
		this.items = items;
	}
	
	public void setLibraryId(int id)
	{
		this.libraryId = id;
	}
	
	public void setFees(double fees)
	{
		this.fees = fees;
	}
	
	private String printBooks()
	{
		String str = "";
		for(int i = 0; i < items.length; i++)
		{
			str += items[i] + " ";
		}
		return str;
	}
	
	public String toString()
	{
		return this.firstName + " " + this.lastName + 
				"Books: " + printBooks() + 
				"Library ID: " + this.libraryId +
				"Fees: $" + fees;  
	}
}
