package DP3_8.Visitor;

/**
 *	具体结点 
 */
public class NodeA extends Node
{
	@Override
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}
	
	public String operationA()
	{
		return "NodeA is visited";
	}
}
