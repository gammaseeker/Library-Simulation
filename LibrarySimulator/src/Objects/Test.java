package Objects;
import java.util.*;

public class Test {

	public static void main(String[] args)
	{
		testBook();
		
	}
	
	private static void testBook(){
		Book b1 = new Book("Brave New World", "Aldous Huxely");
		Book b2 = new Book("Julius Caesar", "Shakespeare", 1);
		
		
		System.out.println(b2);// toString();
		System.out.println("Title: " + b2.getTitle());
		System.out.println("Author: " + b2.getAuthor());
		System.out.println("ID: " + b2.getId());
		System.out.println("Borrowed: " + b2.isBorrowed());
		b2.borrow();
		System.out.println("Borrowed: " + b2.isBorrowed());
		
		System.out.println(b1);// toString();
		System.out.println("Title: " + b1.getTitle());
		System.out.println("Author: " + b1.getAuthor());
		b1.setId(49);
		System.out.println("ID: " + b1.getId());
		System.out.println("Borrowed: " + b1.isBorrowed());
		b1.borrow();
		System.out.println("Borrowed: " + b1.isBorrowed());
	}
	
	private static void testPerson(){
		Person p1 = new Person("John", "Doe", 1);
		
		Stack<Book> st = new Stack<Book>();
		st.push(new Book("Brave New World", "Aldous Huxely"));
		st.push(new Book("Julius Caesar", "Shakespeare", 1));
		
		double fees = 10.0;
		
		Person p2 = new Person("Foo", "Bar", 2, st, fees);
		
		System.out.println(p1);// toString();
		System.out.println("First Name: " + p1.getFirstName());
		System.out.println("Last Name: " + p1.getLastName());
		System.out.println("Books: " + p1.getBooks());
		System.out.println("ID: " + p1.getLibraryId());
		System.out.println("Fees:" + p1.getFees());
		System.out.println(p2);// toString();
	}
}
