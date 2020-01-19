// Objects class. Uses the human, programmer and mathematician classes to demonstarte the concepts of Object Oriented Proramming.
public class objects
{
    public static void main (String[] args)
    {
	// Human.
	System.out.println ("=== HUMAN ===");
	
	// ABSTRACTION - Creating a human.
	human person1 = new human ();

	// ENCAPSULATION - This is the only way you can access the variables defined in the class.
	person1.whoami ();
	
	// Human can do all of the basic functions that are defined in the human class.
	person1.eat ();
	person1.sleep ();
	person1.walk ();

	// Print out a blank line.
	System.out.println ("\n");
	

	// Programmer.
	
	System.out.println ("=== PROGRAMMER ===");
	
	// ABSTRACTION - Creating a programmer
	// INHERITANCE - Programmer inherits all functions and variables from human.
	programmer person2 = new programmer ();

	// ENCAPSULATION - This is the only way you can access the variables defined in the class.
	person2.whoami ();
	
	// INHERITANCE - Programmer can do all the functions that are defined in the human class.
	// Programmer can also do the functions that are defined in the programmer class.
	person2.eat ();
	person2.program ();
	// DYNAMIC / RUNTIME POLYMORPHISM - The sleep function is overwrited by the programmer class.
	person2.sleep ();
	person2.walk ();
	
	// Print out a blank line.
	System.out.println ("\n");
	

	// Mathematician.
	System.out.println ("=== MATHEMATICIAN ===");
	
	// ABSTRACTION - Creating a mathematician
	// INHERITANCE - Mathematician inherits all functions and variables from human.
	mathematician person3 = new mathematician ();

	// ENCAPSULATION - This is the only way you can access the variables defined in the class.
	person3.whoami ();
	
	// INHERITANCE - Mathematician can do all the functions that are defined in the human class.
	// Programmer can also do the functions that are defined in the mathematician class.
	person3.eat ();
	person3.math ();
	person3.sleep ();
	person3.walk ();
	
	// STATIC / COMPILE-TIME POLYMORPHISM
	// A different instance of the add function is called based on the type of input.
	person3.add(12, 36);
	person3.add(4.77, 25);
	person3.add(23, 34.34);
	person3.add(25.34, 64.35);
    }
}
