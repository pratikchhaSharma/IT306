package IT306Project;

public class customer extends person
{
	private item [] cart;
	
	
	
	public item[] getCart()
	{
		return this.cart;
	}
	
	public void addToCart(item[] cart)
	{
		
	}
	public void removeFromCart(item[] cart)
	{
		
	}
	public String checkout(item[] cart)
	{
		String out="";
		for(int i=0; i<cart.length; i++)
		{
			out+=cart[i]+"\n";
		}
		return out;
	}

}
