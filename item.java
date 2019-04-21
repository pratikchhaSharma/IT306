package IT306Project;

public abstract class item 
{
	
	private String name;
	private String author;
	private String genre;
	private String publisher;
	private String publicationDate;
	private boolean onHold;
	private int numItems;
	private double price;
	
	public double calculateTotal()
	{
		return this.numItems * this.price;
	}
	public String getName()
	{
		return this.name;
	}
	public String getGenre()
	{
		return this.genre;
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
	public String toString()
	{
		return this.name + "\n" + this.author + "\n"
				+ this.genre + "\n" + this.publisher
				+ "\n" + this.publicationDate + "\n" + this.numItems 
				+"\n" + this.price;
	}
	

}
