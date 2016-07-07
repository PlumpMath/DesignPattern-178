package DP3_10.Interpreter;

/**
 *	非终结符表达式 
 *	变量
 */
public class Variable extends Expression
{
	private String name;
	
	public Variable(String name)
	{
		this.name = name;
	}
	
	@Override
	public boolean interpret(Context ctx)
	{
		return ctx.lookup(this);
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o != null && o instanceof Variable)
		{
			return this.name.equals(((Variable)o).name);
		}
		return false;
	}
	
	@Override
	public int hashCode()
	{
		return (this.toString()).hashCode();
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}
