package DP2_6.Composite_safe;

/**
 *	树叶构件 
 */
public class Leaf implements Component
{
	@Override
	public Composite getComposite()
	{
		return null;
	}
	
	@Override
	public void sampleOperation()
	{
		System.out.println("Leaf operation");
	}
}
