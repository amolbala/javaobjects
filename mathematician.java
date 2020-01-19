// Mathematician class. Extends human class but adds extra functions.
// INHERITANCE - By extending the human class, a mathematician is a human and can do what a human can do.
public class mathematician extends human
{
    // INHERITANCE - The mathematician class has an extra function 'math'.
    // This is available only to mathematicians.
    public void math ()
    {
	System.out.println ("Doing some complex math...");
    }


    // STATIC / COMPILE-TIME POLYMORPHISM
    // There are four different add functions.
    // The correct instance of the function will be called based on the input given.
    public void add (int num1, int num2)
    {
	System.out.println ("You called the first add function.");
	int ans = num1 + num2;
	System.out.println ("The answer is: " + ans);
    }


    public void add (double num1, int num2)
    {
	System.out.println ("You called the second add function.");
	int ans = (int) num1 + num2;
	System.out.println ("The answer is: " + ans);
    }


    public void add (int num1, double num2)
    {
	System.out.println ("You called the third add function.");
	int ans = num1 + (int) num2;
	System.out.println ("The answer is: " + ans);
    }


    public void add (double num1, double num2)
    {
	System.out.println ("You called the fourth add function.");
	int ans = (int) num1 + (int) num2;
	System.out.println ("The answer is: " + ans);
    }
}
