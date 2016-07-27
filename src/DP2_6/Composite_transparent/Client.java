package DP2_6.Composite_transparent;

public class Client
{
	public static void main(String[] args)
	{
		Component leaf1 = new Leaf();
		Component leaf2 = new Leaf();
		Component leaf3 = new Leaf();
		Component composite = new Composite();
		Component composite1 = new Composite();
		
		composite1.add(leaf3);
		
		composite.getComponent().add(leaf1);
		composite.getComponent().add(leaf2);
		composite.getComponent().add(composite1);
		
		composite.getComponent().sampleOperation();
	}
}
