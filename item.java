package IT306Project;

public abstract class item 
{
	
	//parent variables that will be used in all the child classes
	
	private String name;
	private String author;
	private String genre;
	private String publisher;
	private String publicationDate;
	private boolean onHold;
	private int numItems;
	private double price;
	public static final int MAX_NUM_ITEMS = 50;
	
	
	//creates a abstract method that will be used to calculate the total price of each item 
	
	public abstract calculateTotal()
	{
		//return this.numItems * this.price;
		//specified as an abstract method in requirements
	}
	
	//accessor to return the name of an item 
	public String getName()
	{
		return this.name;
	}
	//accessor to return the genre 
	public String getGenre()
	{
		return this.genre;
	}
	//accessor to return the publisher 
	public String getPublisher()
	{
		return this.publisher;
	}
	//accessor to return the publication date
	public String getPublicationDate()
	{
		return this.publicationDate;
	}
	//accessor to return the price 
	public double getPrice()
	{
		return this.price;
	}
	//accessor to return the status of whether an item is on hold 
	public boolean getOnHold()
	{
		return this.onHold;
	}
	//accessor to return the number of total items 
	public int getNumItems()
	{
		return this.numItems;
	}
	//mutator to set the item name 
	public void setName(String name)
	{
		this.name=name;
	}
	//mutator to return the author 
	public void setAuthor(String author)
	{
		this.author=author;
	}
	//mutator to set the genre of the item 
	public void setGenre(String genre)
	{
		this.genre=genre;
	}
	//mutator to set the publisher 
	public void setPublisher(String publisher)
	{
		this.publisher=publisher;
	}
	//mutator to set the publication date 
	public void setPublicationDate(String Date)
	{
		this.publicationDate=Date;
	}
	//mutator to set whether an item is on hold or not
	public void SetHold(boolean onHold)
	{
		this.onHold=onHold;
	}
	//increments the number of items by one 
	public void setNumItems()
	{
		numItems++;
	}
	//method to format all the variables into a well formatted report 
	public String toString()
	{
		return this.name + "\n" + this.author + "\n"
				+ this.genre + "\n" + this.publisher
				+ "\n" + this.publicationDate + "\n" + this.numItems 
				+"\n" + this.price;
	}
	

}
