package IT306Project;

public class book extends item
{
	private String isbn;
	
	public book(String name, String author, String genre, String publisher, String publicationDate, double price)
	{
	super(name, author, genre, publisher, publicationDate, price);
	this.isbn=isbn;
	}
	public void setIsbn (String isbn)
	{
		this.isbn=isbn;
	}
	public String getIsbn()
	{
		return this.isbn;
	}
	

	public double calculateTotal()
	{
		return super.getPrice() + (super.getPrice() * checkout.tax);
	}
	
	public double calculateSubTotal()
	{
		return super.getPrice();
	}
	
}
