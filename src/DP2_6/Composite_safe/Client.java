package DP2_6.Composite_safe;

public class Client
{
	public static void main(String[] args)
	{
		Component leaf1 = new Leaf();
		Component leaf2 = new Leaf();
		
		Component composite = new Composite();
		composite.getComposite().add(leaf1);
		composite.getComposite().add(leaf2);
		composite.getComposite().sampleOperation();
	}
}
