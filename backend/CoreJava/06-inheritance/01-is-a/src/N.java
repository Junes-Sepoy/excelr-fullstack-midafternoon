class M 
{
	M()
	{
		super();
		System.out.println("M()");
	}
}
class N extends M
{
	N()
	{
		super();
		System.out.println("N()");
	}

	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("done");
	}
}

 