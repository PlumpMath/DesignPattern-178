package DP2_6.Composite_safe;

/**
 * 	抽象构件角色
 * 	抽象构件角色并不定义管理子对象的方法.
 */
public interface Component
{
	
	Composite getComposite();
	
	void sampleOperation();
}
