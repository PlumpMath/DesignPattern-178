package DP2_1.Adapter2;

/**
 *	目标角色 
 */
public interface Target
{
	//源类也有的方法sampleOperation1
	void sampleOperation1();

	//源类没有的方法sampleOperation2
	void sampleOperation2();
}
