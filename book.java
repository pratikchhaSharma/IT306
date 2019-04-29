package IT306Project;

public class book extends item
{
	private String isbn;
	
	//Creates a constructor that calls the parents variables from parent class Item 
	//instanticates the isbn variable 
	public book(String name, String author, String genre, String publisher, String publicationDate, double price)
	{
	super(name, author, genre, publisher, publicationDate, price);
	this.isbn=isbn;
	}
	
	//mutator for setting the isbn
	public void setIsbn (String isbn)
	{
		this.isbn=isbn;
	}
	//accessor for returning the isbn 
	public String getIsbn()
	{
		return this.isbn;
	}
	
	//method to calculate the price of a book. Derived from an abstract method from the parent class 
	public double calculateTotal()
	{
		return super.getPrice() + (super.getPrice() * checkout.tax);
	}
	
	//method to calculate the sub total which doesn't include tax 
	public double calculateSubTotal()
	{
		return super.getPrice();
	}
	
}
