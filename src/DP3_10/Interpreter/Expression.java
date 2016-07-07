package DP3_10.Interpreter;

/**
 *	抽象表达式角色
 *	Expression ::= Constant | Variable | Or | And | Not
 *	And 	   ::= Expression 'AND' Expression
 *	Or		   ::= Expression 'OR' Expression
 *	Not 	   ::= 'NOT' Expression
 *	Variable   ::= 任何标识符
 *	Constant   ::= 'true' | 'false'
 */
public abstract class Expression
{
	//以环境类为准,本方法解释给定的任何一个表达式
	public abstract boolean interpret(Context ctx);
	
	//检查两个表达式在结构上是否相同
	public abstract boolean equals(Object o);
	
	//返回表达式的	hash code
	public abstract int hashCode();
	
	//将表达式转换成字符串
	public abstract String toString();
}
