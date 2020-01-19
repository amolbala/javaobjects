# Example of Object Oriented Programming in Java

This is an example of all the principles of Object Oriented Programming, namely Abstraction, Encapsulation, Inheritance and Polymorphism (both types).

The example uses three different objects / classes. They are `human`, `programmer` and `mathematician`.

## What to do
- Make sure you have all the files in the same folder.
- Open all four `.java` files. They should work in any IDE and any version of Java.
- All files have documentation to explain the principles.
- Run the `objects.java` file to see the output.

## Principles of Object Oriented Programming
The following are the principles of Object Oriented Programming, their description and any advantage or disadvantage.
- **Abstraction**: Abstraction allows programmers to create useful, reusable `classes` or `objects`. You can create different instances of each object like you create different variables. Each class can have different variables and functions that each instance has. An advantage of abstraction is that you can create multiple instances of an object without reimplementing all of its functions each time. A disadvantage is that each instance will have the exact same functions and variables.
- **Encapsulation**: Encapsulation is a mechanism of wrapping data and code as a single unit (an object). The object can hide its variables from other classes and only allow it to be accessed through some methods of the class. Some variables (public variables) can be accessed by other classes while other variables (private variables) are accessible only inside the class in which it is declared and are not accessible by other classes. An advantage of encapsulation is that it prevents some classes from accessing secret / important information. A disadvantage is that programming mistakes can prevent some necessary variables from being accessed by a program.
- **Inheritance**: Inheritance allows a programmer to *extend* an object. The object thus created will have all of the code and variables of the original object but it can also be given more functions and variables that will remain unique to the inherited class. If a class `B` extends a class `A`, that class `B` will inherit everything that that class `A` has. A `B` **is an** `A`. An advantage of inheritance is that it allows you to create multiple similar objects that *extend* a super class. This allows you to write less code by declaring what is same only once.
- **Polymorphism**: Polymorphism is the process of representing one form in multiple forms. Just like a person can be a student in school, a passenger in a bus and a son at home; a function can behave in a different way based on which object it is running from and what input it is given. There are two types of Polymorphism:
  - **Static / Compile time Polymorphism**: It is when one function can behave differently based on the input provided to it. It is implemented by *method overloading*, declaring a function multiple times for multiple types of input.
  - **Dynamic / Runtime Polymorphism**: It is when you extend an object and override a function in the subclass with a different function. The function is called with reference to the parent class. The function declared in the subclass overrides the function declared in the parent class. This is determined by the JVM compiler, hence the name.
  - An advantage to polymorphism is that you can make the same function behave in different ways based on the object and the input given. A disadvantage is that there are some limitations to Static Polymorphism because of some limitations.
