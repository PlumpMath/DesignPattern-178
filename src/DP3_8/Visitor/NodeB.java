package DP3_8.Visitor;

/**
 *	具体结点 
 */
public class NodeB extends Node
{
	@Override
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}
	
	public String operationB()
	{
		return "NodeB is visited";
	}
}
