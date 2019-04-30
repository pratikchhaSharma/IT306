
package IT306Project;
import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class checkout 
{
public static final double tax = 0.1;



public static void main(String[] args){
	int empty = 0;
	//item[] cart = new item[item.MAX_NUM_ITEMS];
	//item[] items = new item[item.MAX_NUM_ITEMS];
	LinkedList<item> cart = new LinkedList<item>();
	LinkedList<item> items = new LinkedList<item>();
	
	String path = "./src/IT306Project/inventory.txt";
	
	items = readFromFile(path, items);
	//System.out.print(items.size());
	//System.out.print(items.get(1).getName());
	String menu ="1- Add to cart\n2-Remove from cart\n3-Search\n4-Checkout.\n5-Quit program";
	int option = 0;
	
	do{
		try{
		option = Integer.parseInt(JOptionPane.showInputDialog(menu));
		switch(option){
		case 1:
			//Add item to cart
			addToCart(items, cart, items);
			break;
		case 2:
			//Remove item from cart
			removeFromCart(items, cart);
			break;
		case 3:
			//Search for an item
			search(items);
			break;
		case 4:
			//Checkout
			checkout(cart, path);
			break;
		
		}
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, "Invalid input");
		}
	}while(option!=4 && option!=5);
	
	
	
	
	
}

public static LinkedList<item> readFromFile(String path, LinkedList<item> items){
	try{
		
		
		
		String line =null; 
		Scanner scan =new Scanner(new FileInputStream(new File(path)));  
		Scanner scan2 =null; 
		int counter=0; 
		while(scan.hasNextLine()){
			item s;
			
			line = scan.nextLine();
			scan2 = new Scanner(line);
			scan2.useDelimiter(","); 
			//tokenizing the line variable
			//how can we define what kind of item it is?
			String name = scan2.next();
			String author = scan2.next();
			String genre = scan2.next();
			String publisher = scan2.next();
			String publicationDate = scan2.next();
			double price = Double.parseDouble(scan2.next().trim());	
			String type = scan2.next();
			 //s= new item(name, author,genre, publisher, publicationDate, price);
			//have not fully created items
			if (type.equals("Journal")){
				s = new journal(name, author, genre, publisher, publicationDate, price);
				if(s.getNumItems()>item.MAX_NUM_ITEMS)
				{
					JOptionPane.showMessageDialog(null, "Database has exceeded max items");
					break;
				}
				items.add(s);
			}
			if (type.equals("Book")) {
				s = new book(name, author, genre, publisher, publicationDate, price);
				if(s.getNumItems()>item.MAX_NUM_ITEMS)
				{
					JOptionPane.showMessageDialog(null, "Database has exceeded max items");
					break;
				}
				items.add(s);
			}
			if (type.equals("CD")) {
				s = new cd(name, author, genre, publisher, publicationDate, price);
				if(s.getNumItems()>item.MAX_NUM_ITEMS)
				{
					JOptionPane.showMessageDialog(null, "Database has exceeded max items");
					break;
				}
				items.add(s);
			}
			
		
			//System.out.println(line);
		}
	}
	catch(FileNotFoundException e){
		JOptionPane.showMessageDialog(null, "Database doesn't exist");
		e.printStackTrace(); 
	}
	catch (NoSuchElementException e)
	{
		JOptionPane.showMessageDialog(null, "element not found");
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
public static void addToCart(Object Item, LinkedList<item> Cart, LinkedList<item> items){
	if (Cart.size() > item.MAX_NUM_ITEMS){
		JOptionPane.showMessageDialog(null, "Cart is full");	
	}
	else{
		//create a dialog box with a scroll allowing for user to select what item they wish to add to cart
		//items are numbered and number corresponds to item
		String itemString = "";
		for (int i = 0; i < items.size(); i++){
			itemString += i+1 + ". " + items.get(i).getName() + " by " + items.get(i).getAuthor() + "\n";   	
		}
		/*JTextArea textArea = new JTextArea(itemString);
		JScrollPane scroll = new JScrollPane(textArea);  
		textArea.setLineWrap(true);  
		textArea.setWrapStyleWord(true); 
		scroll.setPreferredSize( new Dimension( 250, 400 ) );*/
		
		try {
			
		int selection = Integer.parseInt(JOptionPane.showInputDialog("Pick an item" + itemString));
		if (selection-1 <= items.size() && selection-1 >= 0){
			item x = items.get(selection-1);
			Cart.add(x); //left off here
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
public static void removeFromCart(Object Item, LinkedList <item> Cart){
	if (Cart.size() == 0 || Cart.isEmpty()){
		JOptionPane.showMessageDialog(null, "Cart is empty");
		
	}
	else {
		/*Create a dialog box that shows users cart that is numbered, user inputs number they want removed.
		*/
		String cartString = "";
		///need to reproduce cart instead
		for (int i = 0; i < Cart.size(); i++){
			cartString += i+1 + ". " + Cart.get(i).getName() + " by " + Cart.get(i).getAuthor() + "\n";   	
		}
		/*JTextArea textArea = new JTextArea("Insert your Text here");
		JScrollPane scroll = new JScrollPane(textArea);  
		textArea.setLineWrap(true);  
		textArea.setWrapStyleWord(true); 
		scroll.setPreferredSize( new Dimension( 250, 400 ) );*/
		
		try {
			
		int selection = Integer.parseInt(JOptionPane.showInputDialog(null, cartString));
		if (selection-1 <= Cart.size() && selection-1 >= 0){
			Cart.remove(selection-1);
		}
		
		}
		catch(IllegalArgumentException e){
			JOptionPane.showMessageDialog(null, "Not a valid selection, exiting.");	

	   }
   }
}
/* This function will allow the user to enter the name of an item they would like to find and the function will search the database
    for the item and return whether or not it is available for purchase or not. 
*/
public static void search(LinkedList <item> Items){
	//if text file is void throw an error?
	String input = JOptionPane.showInputDialog("what item or author are you loooking for?");
	
	for(int i=0; i<Items.size(); i++)
	{
		if(Items.get(i).getName().trim().equalsIgnoreCase(input.trim()) || Items.get(i).getAuthor().equalsIgnoreCase(input) ){
			JOptionPane.showMessageDialog(null, "Item exists");
			return;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Item does not exist");
			return;
		}

	}
	
	
   }


//this function implements comparable/comparator to sort the objects in the LinkedList by name 
public static LinkedList<item> selectionSort(LinkedList<item> Cart){
	
		
	Collections.sort(Cart);
	return Cart;
}


//Checking out adjusts the database.
/*This function will return a formatted string receipt of items purchased in a list sorted by names in ascending order. If successful
   it will adjust the database accordingly.
*/
public static void checkout(LinkedList <item> Cart, String path){
//Loop through cart and toString everything, calculate subtotal, tax, and final total
//If everything works, rewrite the database (LOGIC: REMOVE CART ITEMS FROM ITEMS ARRAY AND WRITE IT OVER THE OLDER TEXT FILE.)
	String cartString = "";
	Double subTotal=0.0;
	Double total=0.0;
	String totals = "";
	//fill with logic to append cart to string,  do math for totals, display the string, and rewrite database
			///need to reproduce cart instead
	if (Cart.size() == 0 || Cart.isEmpty()){
		JOptionPane.showMessageDialog(null, "Cart is empty.");
		
		
	}
	else{
		selectionSort(Cart);
		
		for (int i = 0; i < Cart.size(); i++){
			subTotal+=Cart.get(i).calculateSubTotal();
			total+=Cart.get(i).calculateTotal();
			cartString +=i+1+"." + Cart.get(i).getName() + ": " + Cart.get(i).getPrice() + "$\n ";   	
		}
		totals += "\nSubtotal: " + subTotal + "$ \nTotal: " + total;
		JOptionPane.showMessageDialog(null, cartString + "\n" + totals+"$");
	}
	
}

}
