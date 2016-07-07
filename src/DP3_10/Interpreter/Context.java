package DP3_10.Interpreter;

import java.util.HashMap;

/**
 *	环境角色
 */
public class Context
{
	//HashMap存储 变量-值 对
	private HashMap<Variable,Boolean> map = new HashMap();
	
	//给变量赋值
	public void assign(Variable var , boolean value)
	{
		map.put(var, new Boolean(value));
	}
	
	//取变量的值
	public boolean lookup(Variable var) throws IllegalArgumentException
	{
		Boolean value = map.get(var);
		
		if(value == null)
		{
			throw new IllegalArgumentException();
		}
		
		return value.booleanValue();
	}
}
