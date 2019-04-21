package IT306Project;

public class inventory 
{

	private item [] items;
	
	public void add(item[] items)
	{
		
	}
	public void remove(item [] items)
	{
		
	}
	
	public String list()
	{
		String out="";
		for(int i=0; i<items.length; i++)
		{
			out+=items[i] + "\n";
		}
		return out;
	}
	
}
