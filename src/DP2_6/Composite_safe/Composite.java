package DP2_6.Composite_safe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *	树枝构件角色 
 */
public class Composite implements Component
{
	//树枝构件包含的下级子对象的集合(包含树枝构件和树叶构件)
	private List<Component> list = new ArrayList();
	
	@Override
	public Composite getComposite()
	{
		return this;
	}
	
	@Override
	public void sampleOperation()
	{
		System.out.println("Composite operation");
		
		for(Component component : list)
		{
			component.sampleOperation();
		}
	}
	
	//增加子构件对象
	public void add(Component component)
	{
		list.add(component);
	}
	
	//删除子构件对象
	public void remove(Component component)
	{
		list.remove(component);
	}
}
