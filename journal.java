package IT306Project;

public class journal extends item
{
	private int volume; 
	// Constructor that calls the super variables from parent class Item 
	//instantiates the variable volume
	public journal(String name, String author, String genre, String publisher, String publicationDate, double price)
	{
		super(name, author, genre, publisher, publicationDate, price);
		this.volume=volume;
	}
	
	// mutator used to set the volume 
	public void setVolume(int volume)
	{
		this.volume=volume;
	}
	// accessor to return the journal volume 
	public int getVolume()
	{
		return this.volume;
	}
	//method to calculate the total price of a journal
	//Derived from an abstract method in the parent class item
	public double calculateTotal()
	{
		return super.getPrice() + (super.getPrice() * checkout.tax);
	}
	//method to calculate the price without tax 
	public double calculateSubTotal()
	{
		return super.getPrice();
	}
	
}
