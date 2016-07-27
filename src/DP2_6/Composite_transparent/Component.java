package DP2_6.Composite_transparent;

import java.util.Iterator;

/**
 *	抽象构件角色 
 *	抽象构件角色定义了管理子对象的方法.
 */
public interface Component
{
	
	public void sampleOperation();
	
	public void add(Component component);
	
	public void remove(Component component);

	public Component getComponent();
}
