package IT306Project;

public class cd extends item
{
	private String recordLable;
	
	
	//constructor that calls the super variables from parent class item
	//instantiates the variable recordLable 
	public cd(String name, String author, String genre, String publisher, String publicationDate, double price)
	{
		super(name, author, genre, publisher, publicationDate, price);
		this.recordLable=recordLable;
	}
	//mutator to set the record lable 
	public void setRecordLable(String Lable)
	{
		this.recordLable=Lable;
	}
	//accessor to return the record lable
	public String getRecordLable()
	{
		return this.recordLable;
	}
	//method to calculate the total price of a CD
	//derived from a abstract method in the parent class 
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
