package IT306Project;
import java.util.*;
public class checkout 
{
	int empty = 0;
	//item[] cart = new item[item.MAX_NUM_ITEMS];
	//item[] items = new item[item.MAX_NUM_ITEMS];
	LinkedList<item> cart = new LinkedList<item>();
	LinkedList<item> items = new LinkedList<item>();
	String path = "./src/IT306Project/inventory.txt";
	items = readFromFile(path, items)
	String menu ="1- Add to cart\n2-Remove from cart\n3-Search\n4-Check holds\n5-Checkout.";
	int option = 0;
	do{
		option = Integer.parseInt(JOptionPane.showInputDialog(menu));
		switch(option){
		case 1:
			//Add item to cart
			addToCart(item, cart, items)
		case 2:
			//Remove item from cart
			removeFromCart(item, cart)
		case 3:
			//Search for an item
			search(name)
		case 4:
			//Check item for holds
			checkHold(item, path)
		case 5:
			//Checkout
			checkout(cart, path)
		}
	}while(true);
}

public static item[] readFromFile(String path, item<?> items)
{
	try{
		String line =null; 
		Scanner scan =new Scanner(new FileInputStream(new File(path)));  
		Scanner scan2 =null; 
		int counter=0; 
		while(scan.hasNextLine()){
			line = scan.nextLine();
			scan2 = new Scanner(line);
			scan2.useDelimiter(","); 
			//tokenizing the line variable
			//how can we define what kind of item it is?
			String name = scan2.next();
			String genre = scan2.next();
			String publisher = scan2.next();
			String publicationDate = scan2.next();
			double price = Double.parseDouble(scan2.next().trim());			
			Item s = new Item(name, genre, publisher, publicationDate, price);
			//have not fully created items
			items.add(s);
			s++;
			//System.out.println(line);
		}
	}
	catch(FileNotFoundException e){
		e.printStackTrace(); 
	}
	catch( IOException e){
		e.printStackTrace(); 
	}
	return items;
}

/*The addToCart method will allow a user to add an item to their cart. The cart will be sorted by name (A to Z) or price (Low to High) 
   with each item added. It will first ask the user what the name of the item they would like added, if the item exists in the database
   then it will add to the cart.
*/
public static void addToCart(Object Item, cart<?> Cart, item<?> items){
	if (cart.length > item.MAX_NUM_ITEMS){
		throw new ArrayIndexOutOfBoundsException("Cart is full");	
	}
	else{
		//create a dialog box with a scroll allowing for user to select what item they wish to add to cart
		//items are numbered and number corresponds to item
		String itemString = "";
		for (int i = 0; i < items.size(); i++){
			itemString += i+1 + ". " items.get(i).getName() + " by " + items.get(i).getAuthor();   	
		}
		JTextArea textArea = new JTextArea("Insert your Text here");
		JScrollPane scroll = new JScrollPane(textArea);  
		textArea.setLineWrap(true);  
		textArea.setWrapStyleWord(true); 
		scrollPane.setPreferredSize( new Dimension( 250, 400 ) );
		
		try {
			
		int selection = Integer.parseInt(JOptionPane.showInputDialog(null, scroll, itemString));
		if (selection-1 <= items.size() && selection-1 >= 0){
			item x = list.remove(i);
			cart.add(x); //left off here
		}
		
		}
		catch(IllegalArgumentException e){
			JOptionPane.showMessageDialog(null, "Not a valid selection, exiting.");	
		}
	}
}

/* The remove from cart method will allow the user to input the name of an item they would like to be removed from their cart. The 
    function will first display their current cart and a number for each item. The user will input the number they want removed.
    If the number exists the cart will remove the item and renumber the cart.
*/
public static void removeFromCart(Object Item, cart<?> Cart){
	if (cart.length == empty){
		throw new ArrayIndexOufOfBoundsException("Cart is empty");	
	}
	else {
		/*Create a dialog box that shows users cart that is numbered, user inputs number they want removed.
		*/
		String itemString = "";
		///need to reproduce cart instead
		for (int i = 0; i < items.size(); i++){
			cartString += i+1 + ". " cart.get(i).getName() + " by " + cart.get(i).getAuthor();   	
		}
		JTextArea textArea = new JTextArea("Insert your Text here");
		JScrollPane scroll = new JScrollPane(textArea);  
		textArea.setLineWrap(true);  
		textArea.setWrapStyleWord(true); 
		scrollPane.setPreferredSize( new Dimension( 250, 400 ) );
		
		try {
			
		int selection = Integer.parseInt(JOptionPane.showInputDialog(null, scroll, cartString));
		if (selection-1 <= cart.size() && selection-1 >= 0){
			item x = cart.remove(i);
			cart.remove(x); //left off here
		}
		
		}
		catch(IllegalArgumentException e){
			JOptionPane.showMessageDialog(null, "Not a valid selection, exiting.");	

	}
}

/* This function will allow the user to enter the name of an item they would like to find and the function will search the database
    for the item and return whether or not it is available for purchase or not. 
*/
public static void search(item<?> Items, String path){
	//if text file is void throw an error?
	File file = new File(path);
	if (file.length() == 0){
		throw new IllegalArgumentException("File is empty or does not exist");	
	}
	else {
		//fill, allow user to search by name, or just give a list of entire database like in the addToCart func.
	}
	
}

//Checking out adjusts the database.
/*This function will return a formatted string receipt of items purchased in a list sorted by names in ascending order. If successful
   it will adjust the database accordingly.
*/
public string checkout(cart<?> Cart, String path){
//Loop through cart and toString everything, calculate subtotal, tax, and final total
//If everything works, rewrite the database (LOGIC: REMOVE CART ITEMS FROM ITEMS ARRAY AND WRITE IT OVER THE OLDER TEXT FILE.)
	if (cart.size() == empty){
		throw new IllegalArgumentException("Cart is empty.");
	}
	else{
		//fill with logic to append cart to string,  do math for totals, display the string, and rewrite database
	}
	return "Fill";
}
