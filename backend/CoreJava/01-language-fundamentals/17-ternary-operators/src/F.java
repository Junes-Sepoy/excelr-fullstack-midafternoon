class F 
{
	public static void main(String[] args) 
	{
		int firstNum = 600;
		int secondNum = 80;
		int thirdNum = 7;
 		
		int min = (firstNum < secondNum) ? ((firstNum < thirdNum) ? firstNum : thirdNum) : ((secondNum < thirdNum) ? secondNum : thirdNum);

		System.out.println("Minimum b/w" + firstNum + "and" + secondNum + "and" + thirdNum + "is" + min);
	}
}

