package pack1;

class B
{
	private int i;
	private static int j;

	private void test()
	{
		System.out.println("from test()");

	}
	private static void test()
	{
		System.out.println("from test()");

	}
}

class C extends B
{

	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		b1.test1();
		System.out.println(b1.i);
		b1.test2();
	}
}