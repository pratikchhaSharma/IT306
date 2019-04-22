package IT306Project;

public class cd extends item
{
	private String recordLable;
	
	public void setRecordLable(String Lable)
	{
		this.recordLable=Lable;
	}
	public String getRecordLable()
	{
		return this.recordLable;
	}
	public double calculateTotal()
	{
		return this.price * checkout.TAX; 
	}
	

}
