class Employee 
{
	String employeeName, companyName;
	int rollNum;
	int age;

	Employee(String employeeName, int rollNum, int age)
	{
		this.employeeName = employeeName;
		this.rollnum = rollNum;
		this.age = age;
	}

	{ 
		this.companyName = "xyz";
	}
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("john, 101, 32");
		System.out.println("-------------------------");
		Employee emp2 = new Employee("sharma, 102, 30");
		System.out.println("-------------------------");
		Employee emp3 = new Employee("adam, 103, 45");
		System.out.println("-------------------------");
		Employee emp4 = new Employee("kree, 104, 60");
	    System.out.println("-------------------------");
	}
}
