package IT306Project;

public abstract class item implements Comparable <item>
{
	
	private String name;
	private String author;
	private String genre;
	private String publisher;
	private String publicationDate;
	private boolean onHold;
	private int numItems;
	private double price;
	public static final int MAX_NUM_ITEMS = 50;
	
	public item (String name,  String author, String genre, String publisher, String publicationDate, double price)
	{
		this.name=name;
		this.author=author;
		this.genre=genre;
		this.publisher=publisher;
		this.publicationDate=publicationDate;
		this.price=price;
		numItems++;
	}
	public abstract double calculateTotal();
	public abstract double calculateSubTotal();
	
	public String getName()
	{
		return this.name;
	}
	public String getGenre()
	{
		return this.genre;
	}
	public String getAuthor()
	{
		return this.author;
	}
	public String getPublisher()
	{
		return this.publisher;
	}
	public String getPublicationDate()
	{
		return this.publicationDate;
	}
	public double getPrice()
	{
		return this.price;
	}
	public boolean getOnHold()
	{
		return this.onHold;
	}
	public int getNumItems()
	{
		return this.numItems;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public void setGenre(String genre)
	{
		this.genre=genre;
	}
	public void setPublisher(String publisher)
	{
		this.publisher=publisher;
	}
	public void setPublicationDate(String Date)
	{
		this.publicationDate=Date;
	}
	public void SetHold(boolean onHold)
	{
		this.onHold=onHold;
	}
	public void setNumItems()
	{
		
	}
	//method that implements the comparable to sort the names by alphabetical order 
	public int compareTo(item x)
	{
		int last= this.name.compareTo(x.getName());
		return last==0 ? this.name.compareTo(x.getName()) : last;
	}
	public String toString()
	{
		return this.name + "\n" + this.author + "\n"
				+ this.genre + "\n" + this.publisher
				+ "\n" + this.publicationDate + "\n" + this.numItems 
				+"\n" + this.price;
	}
	

}
