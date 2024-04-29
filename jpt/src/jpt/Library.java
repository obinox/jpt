package jpt;



public class Library{
	public Book[] Books;
	Library(){  
		Books = new Book[10];
		for (int i=0;i<Books.length;i++) {
			Books[i]=new Book();
		}
	}
	void borrowing(int n) {
		if(this.Books[n].borrowing()) {
			System.out.println("Successfully borrowed");
		} else {
			System.out.println("This book has already been borrowed!!!!!!");
		}
	}
	void returning(int n) {
		if(this.Books[n].returning()) {
			System.out.println("Successfully returned");
		} else {
			System.out.println("This book has already been returned!!!!!!");
		}
	}
	public static void main(String[] args) {
		Library lib = new Library();
		lib.returning(1);
		lib.borrowing(1);
		lib.borrowing(1);
		lib.returning(1);
	}
}
class Book{
	public boolean Borrowed;
	Book(){
		Borrowed = false;
	}
	public boolean borrowing(){
		if (!this.Borrowed) {
			this.Borrowed = true;
			return true;
		} else {
			return false;
		}	
	}
	public boolean returning(){
		if (this.Borrowed) {
			this.Borrowed = false;
			return true;
		} else {
			return false;
		}	
	}
}