// Programmer class. Extends human class but adds extra functions.
// INHERITANCE - By extending the human class, a programmer is a human and can do what a human can do.
public class programmer extends human
{
    // INHERITANCE - The programmer class has an extra function 'program'.
    // This is available only to programmers.
    public void program ()
    {
	System.out.println ("I can program!");
    }


    // DYNAMIC / RUNTIME POLYMORPHISM - The sleep function is overwrited for programmers.
    public void sleep ()
    {
	System.out.println ("I barely sleep because I have to program so much.");
    }
}
