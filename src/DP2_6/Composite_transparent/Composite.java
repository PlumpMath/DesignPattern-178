package DP2_6.Composite_transparent;

import java.util.ArrayList;
import java.util.List;

/**
 *	树枝构件角色 
 *
 */
public class Composite implements Component
{
	private List<Component> list = new ArrayList();
	
	@Override
	public Component getComponent()
	{
		return this;
	}
	
	@Override
	public void sampleOperation()
	{
		System.out.println("Composite operation");
		
		for(Component component : list)
		{
			component.getComponent().sampleOperation();
		}
	}
	
	@Override
	public void add(Component component)
	{
		list.add(component);
	}
	
	@Override
	public void remove(Component component)
	{
		list.remove(component);
	}
}
