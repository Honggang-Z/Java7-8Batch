# Assignment 3

### 1. Explain polymorphism.
* polymorphism occurs when we have many classes that are related to each other by inheritance. 
Polymorphism uses those methods inherited from the superclasses to perform different tasks. 
This allows us to perform a single action in different ways by overriding and overloading.
### 2. What is overloading?
* overloading allows multiple methods can have the same name with different parameters.
### 3. What is overriding?
* If a subclass provides the specific implementation of the method that has been declared by one of its 
parent class, it is known as method overriding.
### 4. What does the final mean in this method:  public void doSomething(final Car aCar){}
aCar cannot be re-assigned or
### 5. Suppose in question 4, the Car class has a method setColor(Color color){…}, inside doSomething method, Can we call aCar.setColor(red);?
* Yes.
### 6. Can we declare a static variable inside a method?
* No, we cannot declare static variable inside the method or constructor. Because static variables are class-level variables.
### 7. What is the difference between interface and abstract class?
| Abstract class                                                                                | Interface                                                                                            |
|-----------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------|
| Abstract class can have abstract and non-abstract methods.                                    | Interface can have only abstract methods. Since Java 8, it can have default and static methods also. |
| Abstract class doesn't support multiple inheritance.	Interface supports multiple inheritance. | Interface supports multiple inheritance.                                                             |
| Abstract class can have final, non-final, static and non-static variables.                    | Interface has only static and final variables.                                                       |
| Abstract class can provide the implementation of interface.                                   | Interface can't provide the implementation of abstract class.                                        |
| The abstract keyword is used to declare abstract class.                                       | The interface keyword is used to declare interface.                                                  |
| An abstract class can extend another Java class and implement multiple Java interfaces.       | An interface can extend another Java interface only.                                                 |
| An abstract class can be extended using keyword "extends".                                    | An interface can be implemented using keyword "implements".                                          |
| A Java abstract class can have class members like private, protected, etc.                    | Members of a Java interface are public by default.                                                   |
```java
// Abstract calss Example: 
public abstract class Shape{ 
    public abstract void draw(); 
}
// Interface Example:
public interface Drawable{
    void draw();
}
```                    


### 8. Can an abstract class be defined without any abstract methods?
Yes, an abstract class has both abstract methods and non-abstract methods.
### 9. Since there is no way to create an object of abstract class, what’s the point of constructors of abstract class?
* The main purpose of the constructor is to initialize the newly created object. In abstract class, we have an instance variable, abstract methods, and non-abstract methods. We need to initialize the non-abstract methods and instance variables, therefore abstract classes have a constructor.
### 10. What is a native method?
* Native methods are Java methods that start in a language other than Java(e.g. C/C++). Native methods can access system-specific functions and APIs that are not available directly in Java.
* Simply put, this is a non-access modifier that is used to access methods implemented in a language other than Java like C/C++.
### 11. What is marker interface?
* It is an empty interface (no field or methods). Examples of marker interface are Serializable, Cloneable and Remote interface. All these interfaces are empty interfaces.
* A marker interface is an interface that has no methods or constants inside it. It provides run-time type information about objects, so the compiler and JVM have additional information about the object.
```java
public interface Serializable
{
// nothing here
}
```
### 12. Why to override equals and hashCode methods?
* You must override hashCode() in every class that overrides equals(). Failure to do so will result in a violation of the general contract for Object.hashCode(), which will prevent your class from functioning properly in conjunction with all hash-based collections, including HashMap, HashSet, and Hashtable. (-Joshua Bloch)
* HashMap and HashSet use the hashcode value of an object to find out how the object would be stored in the collection, and subsequently hashcode is used to help locate the object in the collection. Hashing retrieval involves:
  * First, find out the right bucket using hashCode().
  * Secondly, search the bucket for the right element using equals()

### 13. What’s the difference beween int and Integer?
* int is a primitive data type while Integer is a Wrapper class.
* int takes 4 bytes to store an integer value in it. Integer takes 16 bytes to store an integer value in it.
### 14. What is serialization?
Serialization is the conversion of the state of an object into a byte stream; deserialization does the opposite. Stated differently, serialization is the conversion of a Java object into a static stream (sequence) of bytes, which we can then save to a database or transfer over a network.
### 15. Create List and Map. List A contains 1,2,3,4,10(integer) . Map B contains ("a","1") ("b","2") ("c","10")   (key = string, value = string)
####Question: get a list which contains all the elements in list A, but not in map B.

### 16. Implement a group of classes that have common behavior/state as Shape. Create Circle, Rectangle and Square for now as later on we may need more shapes. They should have the ability to calculate the area. They should be able to compare using area. Please write a program to demonstrate the classes and comparison.  You can use either abstract or interface. Comparator or Comparable interface.


