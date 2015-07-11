package oops;
/**
 *Constructors:
 * Constructors help us initialize the object.
 * Constructors can be classified into two types, default constructors and parameterized constructors.
 
 If you don't define a constructor, then the compiler creates a default constructor. 
 Default constructors do not contain any parameters. 
 Default constructors are created only if there are no constructors defined by us. 
 
 Parameterized constructors are required to pass parameters on creation of objects. 
 We can overload constructors with different datatypes as its parameters. - 
 
 Use 'this()' to communicate from one constructor to another constructor in the same class.
 Use 'super()' to communicate with super class constructor.

Parameterized constructors are required to pass parameters on creation of objects.
If we define only parameterized constructors, then we cannot create an object with default constructor. 
This is because compiler will not create default constructor. 
You need to create default constructor explicitly.

Like method overloading we can overload constructors also. 
Along with default constructor, we can have constructors with parameters. 
The no of parameters can be same, and it can have different datatypes. 

 */
public class Constructors {

	public static void main(String[] args) {

		new Car("Toyota",700000);
		Car a = new Car("BMW",1000000);
		Car b = new Car("Maruti",500000);
		Car c = new Car("Honda",800000);
		
		System.out.println(c.model);
		System.out.println(c.price);
		
		//a.model="BMW";
		//a.price=1000000;
		// here we need to initialize each property for every object.
		//now suppose there are 100 of properties and we create 1000 objects .
		//so we will need to initialize all 100 property every time [1000 times for 1000 objects]
		
	}

}
