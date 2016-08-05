原型模式	[对象创建型模式]

通过给出一个原型对象来指明所要创建的对象的类型，然后复制这个原型对象的方法创建出更多同类型的对象.<br>


##浅复制
	被复制对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用对仍然指向原来的对象;<br>
	换言之，浅复制仅仅复制所考虑的对象，而不复制它所引用的对象.<br>

```java
class C
{
	public int num;
	
	public C(int num)
	{
		this.num = num;
	}
	
	public void change()
	{
		num += 12;
	}
	
	
	@Override
	public String toString()
	{
		return ("C对象的值是 " + this.num);
	}
}

class D implements Cloneable
{
	public int num = 12;
	
	C obj = new C(11);
	
	@Override
	protected D clone() 
	{
		D objd = null;
		
		try
		{
			objd = (D)super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
		return objd;
	}
}


public class CloneTest2
{
	public static void main(String[] args)
	{
		D objd = new D();
		
		objd.num = 15;
		
		System.out.println(objd.num);//15
		System.out.println(objd.obj);//11
		
		
		D obj2 = objd.clone();
		obj2.num = 22;
		obj2.obj.change();
		
		System.out.println(objd.num);//15
		
		//浅拷贝
		System.out.println(objd.obj);//23 如果是深拷贝这个地方应该是11 改变的是obj2对象的成员变量obj;objd中的成员变量obj不应该改变
		
		System.out.println(obj2.num);//22
		System.out.println(obj2.obj);//23
	}
}

```

##深复制
	被复制对象的所有变量都含有与原来的对象相同的值，除去那些引用其他对象的变量。那些引用其他对象的变量<br>
	将指向复制过的新对象，而不再是原有的那些被引用的对象;<br>
	换言之，深复制把要复制对象所引用的对象都复制了一遍，而这种对被引用到的对象的复制是间接复制.<br>
	深复制要深入到多少层，是一个不易确定的问题。在决定以深复制的方式复制一个对象的时候，必须决定对间接复制的对象<br>
	是采取浅复制还是继续采用深复制;<br>
	在深复制的过程中，可能会出现循环引用的问题，须小心处理.<br>
```java
package hypo.clone;

class E implements Cloneable
{
	public int num;
	
	public E(int num)
	{
		this.num = num;
	}
	
	public void change()
	{
		num += 12;
	}
	
	@Override
	public E clone() throws CloneNotSupportedException
	{
		E obj = null;
		
		try
		{
			obj = (E)super.clone();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return obj;
	}
	
	@Override
	public String toString()
	{
		return ("E对象的值是 " + this.num);
	}
}

class F implements Cloneable
{
	public int num = 12;
	
	E obj = new E(11);
	
	@Override
	public F clone() 
	{
		F objf = null;
		
		try
		{
			objf = (F)super.clone();
			objf.obj = obj.clone();//继续拷贝成员变量E
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
		return objf;
	}
}


public class CloneTest3
{
	public static void main(String[] args)
	{
		F objf = new F();
		
		objf.num = 15;
		
		System.out.println(objf.num);//15
		System.out.println(objf.obj);//11
		
		
		F obj2 = objf.clone();
		obj2.num = 22;
		obj2.obj.change();
		
		System.out.println(objf.num);//15
		System.out.println(objf.obj);//11 深拷贝
		
		System.out.println(obj2.num);//22
		System.out.println(obj2.obj);//23
	}
}

```




