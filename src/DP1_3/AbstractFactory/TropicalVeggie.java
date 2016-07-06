package DP1_3.AbstractFactory;

/**
 *	具体产品类 
 */
public class TropicalVeggie implements Veggie
{
	private String name;
	
	public TropicalVeggie(String name)
	{
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}
