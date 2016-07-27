package DP2_5.FlyWeight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//享元工厂角色
public class FlyWeightFactory
{
	private HashMap flies = new HashMap();
	
	private FlyWeight inkFlyWeight = null;
	
	//工厂方法,内部状态作为参数传入.
	public FlyWeight factory(Character state)
	{
		if(flies.containsKey(state))
		{
			return (FlyWeight)flies.get(state);
		}
		else
		{
			FlyWeight fly = new ConcreteFlyWeight(state);
			flies.put(state, fly);
			
			return fly;
		}
	}
	
	//辅助方法
	public void checkFlyWeight()
	{
		FlyWeight fly = null;
		
		int i = 0;
		
		System.out.println("-------checkFlyWeight-----");
		
		Iterator<FlyWeight> iter = flies.entrySet().iterator();
		
		while(iter.hasNext())
		{
			Map.Entry entry = (Map.Entry)iter.next();
			
			System.out.println("Item " + (++i) +":" + entry.getKey());
		}
		
		System.out.println("-------checkFlyWeight-----");
	}
}
