import java.util.Scanner;
class F
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your first name?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Enter your adress?" );
		sc.nextLine();
		String adress = sc.nextLine();	
		System.out.println("Your name: " + name + " your adress: " + adress );

		sc.close();
	}
}
