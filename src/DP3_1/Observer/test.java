package DP3_1.Observer;

public class test
{

	public static void main(String[] args)
	{
		Observer o1 = new ConcreteObserver();//观察者
		Observer o2 = new ConcreteObserver();//观察者
		Observer o3 = new ConcreteObserver();//观察者
		
		Subject s1 = new ConcreteSubject();//目标
		
		s1.attach(o1);
		s1.attach(o2);
		s1.attach(o3);
		
		s1.notifyObservers();
		
		System.out.println("--------------------------");
		
		s1.detach(o3);
		s1.notifyObservers();
		
		System.out.println("--------------------------");
	}
}
