// Human class. Contains some basic functions.
// ABSTRACTION - A human class has all these functions and variables.
// The programmer can use this class / object and make many 'humans'.
// All of them have the same functions and variables.
public class human
{
    // ENCAPSULATION - The variables in the class are private and can not be accessed directly.
    private String name;
    private int age;

    // ENCAPSULATION - The variables can only be written to using this function.
    // Get input and store it as a variable.
    public void getinfo (String name, int age)
    {
	this.name = name;
	this.age = age;
    }
    
    // ENCAPSULATION - This is the only way the class allows you to access the variables.
    public void whoami ()
    {
	System.out.println ("I am " + name + ". I am " + age + " years old.");
    }


    // Some basic functions: eat, sleep and walk.
    public void eat ()
    {
	System.out.println ("Eating...");
    }


    public void sleep ()
    {
	System.out.println ("Sleeping...");
    }


    public void walk ()
    {
	System.out.println ("Walking...");
    }
}

// Runner class
// DYNAMIC / RUNTIME POLYMORPHISM - The runner class overwrites the walk class of the human.
class runner extends human
{
    public void walk ()
    {
	System.out.println("Running fast...");
    }
}
