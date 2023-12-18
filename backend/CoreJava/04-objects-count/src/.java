class A 
{

	static int x;

	A()
	{
		x += 10;
	}
    
	{
		x += 20;
	}
	void test()
	{
		x += 30;
	}

	static void test2()
	{
		x += 40;
	}

	public static void main(String[] args) 
	{
		System.out.println("A: " + X);
		A a1 = new A();
	    System.out.println("B: " + X);
		a1.test();
		System.out.println("C: " + X);
		a1.test2();
		System.out.println("D: " + X);
	}
}
