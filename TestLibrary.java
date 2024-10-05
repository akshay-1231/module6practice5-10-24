package module6;

public class TestLibrary {

	public static void main(String[] args) {
		Libraray library = new Libraray();
		  book book1 = new book("1984", "George Orwell");
		  book book2 = new book("1986", "Geo max");	  
		

	        library.addBook(book1);
	        library.addBook(book2);
            library.display();
            
	}

}
