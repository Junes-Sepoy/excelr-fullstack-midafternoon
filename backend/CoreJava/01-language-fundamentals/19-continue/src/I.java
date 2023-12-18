class I
{
	public static void main(String[] args) 
	{
		int i;

		for  (i = 1; i <= 5; i++)
		{
	     System.out.println(i);
		 if(i >= 2)
		{
		 continue;
		}
		if(i >= 3)
		{
		 continue;
		}
		 System.out.println(i);
		}
		 System.out.println(i);
	}
}