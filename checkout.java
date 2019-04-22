package IT306Project;

public class checkout 
{
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
			checkout(cart)
		}
	}while(true);
}

public static void addToCart(Object Item, Cart Cart){
	
}

public static void removeFromCart(Object Item, Cart Cart){
	
}

public static void search(){

}

public static void checkHold(Inventory[] Items){
	
}

public string checkout(Cart Cart){
	return "Fill";
}
