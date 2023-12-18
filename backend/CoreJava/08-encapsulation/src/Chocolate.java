class Chocolate
{
	private int chocolatePrice;
	private int chocolateSize;
	private String chocolateName;
	private double chocolateWeight;

	Chocolate(int chocolatePrice, int chocolateSize, String chocolateName, double chocolateWeight);
	{

	this.chocolatePrice = chocolatePrice;
	this.chocolateSize = chocolateSize;
	this.chocolateName = chocolateName;
	this.chocolateWeight = chocolateWeight;
    }
public int getChocolatePrice()
{
	return chocolatePrice;
}
public void setChocolatePrice(int ChocolatePrice)
{
	this.chocolatePrice = chocolatePrice;
}

public int getChocolateSize()
{
	return chocolateSize;
}
public void setChocolateSize(int chocolateSize)
{
	this.chocolateSize = chocolateSize;
}

public int getChocolateName()
{
	return chocolateName;
}
public void setChocolateName(String chocolateName)
{
	this.chocolateName = chocolateName;
}

public int getChocolateWeight()
{
	return chocolateWeight;
}
public void setChocolateWeight(String chocolateWeight)
{
	this.chocolateWeight = chocolateWeight;
}
class Driver
{
	public static void main(String[] args) 
	{
		Chocolate cho1 = new Chocolate(10, 15, "candyman", 45.7);
		System.out.println(emp1.getChocolatePrice());
		System.out.println(emp1.getChocolateSize());
		System.out.println(emp1.getChocolateName());
		System.out.println(emp1.getChocolateWeight());
		System.out.println("--------------------------");
		setChocolatePrice(15);
		setgetChocolateSize(10);
		setChocolateName("candyman");
		setChocolateWeight(45.7);
		System.out.println("--------------------------");
		System.out.println(emp1.getChocolatePrice());
		System.out.println(emp1.getgetChocolateSize());
		System.out.println(emp1.getChocolateName());
		System.out.println(emp1.ChocolateWeight());

	}
}

public int gethocolateWeight()
{
	return chocolateWeight;
}
public void setChocolateWeight(double chocolateWeight)
{
	this.chocolateWeight = chocolateWeight;
}





	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
