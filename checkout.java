package IT306Project;

public class checkout 
{
	item[] cart = new item[item.MAX_NUM_ITEMS];
	item[] items = new item[item.MAX_NUM_ITEMS];
	String path = "./src/IT306Project/inventory.txt";
	items = readFromFile(path, items)
	String menu ="1- Add to cart\n2-Remove from cart\n3-Search\n4-Check holds\n5-Checkout.";
	int option = 0;
	do{
		option = Integer.parseInt(JOptionPane.showInputDialog(menu));
		switch(option){
		case 1:
			//Add item to cart
			addToCart(item, cart)
		case 2:
			//Remove item from cart
			removeFromCart(item, cart)
		case 3:
			//Search for an item
			search(name)
		case 4:
			//Check item for holds
			checkHold(item)
		case 5:
			//Checkout
			checkout(cart, path)
		}
	}while(true);
}

public static item[] readFromFile(String path, item[] items)
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
			items[counter++]=s;
			System.out.println(line);
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
public static void addToCart(Object Item, Cart Cart){
	
}

/* The remove from cart method will allow the user to input the name of an item they would like to be removed from their cart. The 
    function will first display their current cart and a number for each item. The user will input the number they want removed.
    If the number exists the cart will remove the item and renumber the cart.
*/
public static void removeFromCart(Object Item, Cart Cart){
	
}

/* This function will allow the user to enter the name of an item they would like to find and the function will search the database
    for the item and return whether or not it is available for purchase or not. 
*/
public static void search(){

}

//Checking out adjusts the database.
/*This function will return a formatted string receipt of items purchased in a list sorted by names in ascending order. If successful
   it will adjust the database accordingly.
*/
public string checkout(Cart Cart, String path){
	return "Fill";
}
