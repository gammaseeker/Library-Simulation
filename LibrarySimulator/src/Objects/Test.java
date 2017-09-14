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
		
		
		System.out.println(b2);// toSTring();
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
}
