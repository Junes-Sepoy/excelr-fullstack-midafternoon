class  A
{
	public static void main(String[] args) 
	{
		int num = 2;
		for (int i = 1; i < 10; ++i)
		{
			System.out.println("loop begin");
			if(i > 5)
			{
				break;
			}
			System.out.println("loop end");
		}
		System.out.println("main end");

		}
	}
