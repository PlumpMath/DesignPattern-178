package DP3_8.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 *	结构对象角色 
 */
public class ObjectStructure
{
	private List<Node> nodes;
	private Node node;
	
	public ObjectStructure()
	{
		nodes = new ArrayList<Node>();
	}
	
	//执行访问操作
	public void action(Visitor visitor)
	{
		for(Node node : nodes)
		{
			node.accept(visitor);
		}
	}

	//增加新的元素
	public void add(Node node)	
	{
		nodes.add(node);
	}
}
