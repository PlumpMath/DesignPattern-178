package DP3_10.Interpreter;

/**
 *	非终结符表达式 
 *	Not操作
 */
public class Not extends Expression
{
	private Expression exp;
	
	public Not(Expression exp)
	{
		this.exp = exp;
	}
	
	@Override
	public boolean interpret(Context ctx)
	{
		return !exp.interpret(ctx);//非
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o != null && o instanceof Not)
		{
			return this.exp.equals(((Not)o).exp);
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
		return " (Not " + exp.toString() +")";
	}
}
