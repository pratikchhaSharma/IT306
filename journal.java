package IT306Project;

public class journal extends item
{

	public journal(String name, String author, String genre, String publisher, String publicationDate, double price)
	{
		super(name, author, genre, publisher, publicationDate, price);
		this.volume=volume;
	}
	private int volume; 
	
	public void setVolume(int volume)
	{
		this.volume=volume;
	}
	public int getVolume()
	{
		return this.volume;
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
