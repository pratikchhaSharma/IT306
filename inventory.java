package IT306Project;

public class inventory 
{

	private item [] items;
	
	/* This function will give the user the ability to add items to the database (a formatted word document).
	It will ask the user what item they would like to input, and then ask the questions specific to that item which the user will then
	put in to format the item object (with error checking) and then, if it passes, will be written to the word document.
	*/
	public void add(item[] items)
	{
		
	}
	
	/* This function will prompt the user to type in the title of the item they want to remove and then check for the item in the 
	database, if the item is found the user will get a text reponse of how many of that item there is and will also be asked how many
	they want removed (error checking for item existing and if amount requested to be remove is over total in database).
	*/
	public void remove(item [] items)
	{
		
	}
	
	/* This function will list out all items in the database by reading the given database (word doc) and parsing the information
	from it into a format to be displayed by the program to the user. 
	*/
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
