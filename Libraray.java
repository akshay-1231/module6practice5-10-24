//creat class to represent librarary and book the libraray class should contain an  array of book objects implements method to add,remove,display books in libraray


package module6;



public class Libraray {
	  private static int size;
	    final static int MAX_SIZE = 6;
	    private book[] books;
	 Libraray() {
		size=0;
		this.books= new book[MAX_SIZE];
	}
	 public void addBook(book book) {
	      if (size < MAX_SIZE) {
	            books[size] = book;
	            size++;
	            System.out.println("Added: " + book);
	        } else {
	            System.out.println("Library is full. Cannot add more books.");
	        }
	    }
      public void display() {
    	  if(size==0) {
    		  System.out.println("libraray is empty");
    		  
    	  }else
    		  System.out.println("there are book in libray");
    	  
      }

	
	 
}
