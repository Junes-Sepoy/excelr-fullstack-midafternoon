class A
{
	public static void main(String[] args) 
	{
		int i = 0;//the value remains the same for immediate usage, from the next usage, modified value will be visible
		//i = i+1
		System.out.println(i++);//0
		System.out.println(i);//1
		System.out.println(i);//1
	}
}

/*unary uperators
1. increment ++ var[post-increment] eg:i++ | [pre-increment] var eg: ++i
2. decrement -- var[post-decrement] eg:i--|
[pre-decrement] var eg: --1

var[post-increment]
var[post-decrement]
*/