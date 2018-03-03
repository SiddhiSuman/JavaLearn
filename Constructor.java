package SidLearning;

public class Constructor {
	
	int a;
	int b;
	int c;
	
	public Constructor()
	{
		System.out.println("I am default");
	}
	public Constructor(int a)
	{
		this.a = a;
		System.out.println("I am parametrized");
	}
	public Constructor(int a, int b)
	{
		this.a = a;
		this.b = b;
		System.out.println("I am parametrized");
	}
public void display()
{
	c = a+b;
	System.out.println("Sum of two numbers ="+c);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor(5);
		Constructor obj2 = new Constructor(5,8);
		obj.display();
		obj1.display();
		obj2.display();
	}

}
