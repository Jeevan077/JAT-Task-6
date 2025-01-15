package oopsconcepts;

//Question 3

public class Circle {
	
	private double radius;
	
	//Constructor without argument
	
	public Circle()
	{
		this.radius=1.0;  //default radius
	}
	//Constructor with argument
	public Circle(double radius)
	{
		this.radius=radius;
	}
	
	//Method to calculate Circumference
	public double Circumference()
	{
		return 2 * Math.PI * radius;
	}
	
	//Getter for radius
	public double getRadius()
	{
		return radius;
	}
	//Setter for radius
	public void setRadius(double Radius)
	{
		this.radius=radius;
	}
	
	public String toString()
	{
		return "Circle[radius=" + radius + "]";
	}

	public static void main(String[] args) {
		//Test no argument Constructor
		Circle mycircle1=new Circle();
		System.out.println(mycircle1);
		System.out.println("Circumference of the circle without argument is : " + mycircle1.Circumference());

		//Test with argument Constructor
		Circle mycircle2=new Circle(5.0);
		System.out.println(mycircle2); //Circle[radius=5.0]
		System.out.println("Circumference of the circle with argument is : " + mycircle2.Circumference());
	}

}

/*
 OUTPUT:
 Circle[radius=1.0]
Circumference of the circle without argument is : 6.283185307179586
Circle[radius=5.0]
Circumference of the circle with argument is : 31.41592653589793
*/
