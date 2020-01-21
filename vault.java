// Vault class. Has some variables and some functions to get and set values.
public class vault
{
    // ENCAPSULATION - These variable is private and can not be accessed directly.
    private String data;

    // Setter - to set the value.
    // ENCAPSULATION - This is the only way the class allows you to set the value of the variable.
    public void setData (String data)
    {
	this.data = data;
    }

    // Getter - to get the value.
    // ENCAPSULATION - This is the only way the class allows you to get the value of the variable.
    public String getData ()
    {
	return this.data;
    }
}
