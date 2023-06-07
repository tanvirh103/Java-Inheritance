public class Book{
	private String isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;
	
	Book(){}
	Book(String isbn,String bookTitle,String authorName,double price,int availableQuantity){
		this.isbn=isbn;
		this.bookTitle=bookTitle;
		this.authorName=authorName;
		this.price=price;
		this.availableQuantity=availableQuantity;
		
	}
	public void setIsbn(String isbn){
		this.isbn=isbn;
	}
	public String getIsbn(){
		return isbn;
	}
	public void setBookTitle(String bookTitle){
		this.bookTitle=bookTitle;
	}
	public String getBookTitle(){
		return bookTitle;
	}
	public void setAuthorName(String authorName){
		this.authorName=authorName;
	}
	public String getAuthorName(){
		return authorName;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public double getPrice(){
		return price;
	}
	public void setAvailableQuantity(int availableQuantity){
		this.availableQuantity=availableQuantity;
	}
	public int getAvailableQuantity(){
		return availableQuantity;
	}
	public void addQuantity(int ammount){
		availableQuantity=availableQuantity+ammount;
	}
	public void sellQuantity(int ammount){
		availableQuantity=availableQuantity-ammount;
	}
	
	void showDetails(){
		System.out.println("ISBN: "+this.getIsbn());
		System.out.println("Book Title: "+this.getBookTitle());
		System.out.println("Author Name: "+this.getAuthorName());
		System.out.println("Price: "+this.getPrice());
		System.out.println("Available Quantity: "+this.getAvailableQuantity());
		
	}
	
}