package oopsconcepts;


//Question 1

public class Personclass {
	
	private int age;
	private String name;
	//Setting the age
	public void setage (int a)
	{
		age=a;
		System.out.println("The age is set : ");
	}
	//Getting the age
	public int getage()
	{
		System.out.println("The age is read : ");
		return age;
	}
	
	//Setting the name
	public void setname(String s)
	{
		name =s;
		System.out.println("The Name is set : ");
	}
	//Getting the name
	public String getname()
	{
		System.out.println("The Name is read : ");
		return name;
	}

	public static void main(String[] args) {
		
		Personclass objPerson=new Personclass();
		//Setting the age
		objPerson.setage(24);
		//Getting the age
		System.out.println(objPerson.getage());
		
		//Setting the name
		objPerson.setname("Jeevan");
		//Getting the name
		System.out.println(objPerson.getname());
		
	}

}

/*
 * OUTPUT:
 * The age is set : 
The age is read : 
24
The Name is set : 
The name is read : 
Jeevan
*/
