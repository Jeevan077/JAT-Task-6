package oopsconcepts;

//Question 2

public class Employee {
	
	//Attributes
	
	private int id;
	private String firstname;
	private String lastname;
	private int salary;
	
	//Constructor
	
	public Employee (int id, String firstname, String lastname, int salary)
	{
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.salary=salary;
		
	}
	
	//Getter for ID
	public int getID()
	{
		return id;
	}
	//Getter for FirstName
	public String getFirstName()
	{
		return firstname;
	}
	//Getter for LastName
	public String getLastName()
	{
		return lastname;
	}
	//Getter for Name
	public String getName()
	{
		return  firstname + " " + lastname;
	}
	//Getter for salary
	public int getsalary()
	{
		return salary;
	}
	
	//Setter for salary
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
	//Calculate anuual salary
	public int getAnnualSalary()
	{
		return salary*12;
	}
	//Raise Salary by Percentage
	public int raisesalary(int percent)
	{
		salary+=salary*percent/100;
		return salary;
	}
	//toString method
	public String toString()
	{
		return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
	}
	
	

	public static void main(String[] args) {
		
		Employee objemp=new Employee (5, "Jeevan" , "Sanjay" , 8000);
		{
			//Test getters
			System.out.println(objemp.getID());
			System.out.println(objemp.getFirstName());
			System.out.println(objemp.getLastName());
			System.out.println(objemp.getName());
			System.out.println(objemp.getsalary());
			
			//Test Annual salary
			System.out.println(objemp.getAnnualSalary());
			
			//Test Raise salary
			objemp.raisesalary(12);
			System.out.println(objemp.getsalary());
			
			//Test toString
			System.out.println(objemp);
		}
		

	}

}

//Output:
/*
 5
Jeevan
Sanjay
Jeevan Sanjay
8000
96000
8960
Employee[id=5, name=Jeevan Sanjay, salary=8960]
*/
