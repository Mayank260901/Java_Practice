package LibraryManagementSystem;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		        // Exercise 7 Solution
		   ArrayList<Book> bk = new ArrayList<>();
		        Book b1 = new Book("Algorithms", "Author1");
		        bk.add(b1);

		        Book b2 = new Book("Algorithms2", "Author2");
		        bk.add(b2);

		        Book b3 = new Book("Algorithms3", "Author3");
		        bk.add(b3);

		        Book b4 = new Book("Algorithms4", "Author4");
		        bk.add(b4);
		        
		        MyLibrary l = new MyLibrary(bk);
		        l.addBook(new Book("algo4", "myAuthor"));
		        
		        System.out.println(l.books);
		        
		        l.issueBook(b3, "Harry");
		        System.out.println(l.books);

		    }

	}
