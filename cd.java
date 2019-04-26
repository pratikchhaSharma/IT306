package IT306Project;

public class cd extends item
{
	private String recordLable;
	
	public cd(String name, String author, String genre, String publisher, String publicationDate, double price)
	{
		super(name, author, genre, publisher, publicationDate, price);
		this.recordLable=recordLable;
	}
	public void setRecordLable(String Lable)
	{
		this.recordLable=Lable;
	}
	public String getRecordLable()
	{
		return this.recordLable;
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
