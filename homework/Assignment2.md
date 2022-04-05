### Assignment 2
### 1. Why we need packages in java?
* A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code.

### 2. What is the default imported package?
* Java compiler imports java. lang package internally by default. It provides the fundamental classes that are necessary to design a basic Java program.

### 3. What is Class? What is Object?
* Java Classes and Objects are one of the core building blocks of Java applications, frameworks and APIs (Application Programming Interfaces). A class is a non-primitive or user-defined data type in Java, while an object is an instance of a class

### 4. Why we need constructor?
* A Java constructor is special method that is called when an object is instantiated. In other words, when you use the new keyword. The purpose of a Java constructor is to initializes the newly created object before it is used

### 5. What is the default value of local variable? What is the default value of instance variable?
| Instance variable type | Default values |
|------------------------|----------------|
| float                  | 0.0            |
| long                   | 0l             |
| Object                 | null           |
| char                   | \u0000         |

### 6. What is garbage collection?
* Java garbage collection is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program.

### 7. The protected data can be accessed by subclasses or same package. True or false?
* True
* Within the same class.
* Subclasses of same packages.
* Different classes of same packages.
* Subclasses of different packages.

### 8. What is immutable class?
* Immutable class in java means that once an object is created, we cannot change its content. In Java, all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable.

### 9. What’s the difference between “==” and equals method?
* == checks if both objects point to the same memory location whereas . equals() evaluates to the comparison of values in the objects. If a class does not override the equals method, then by default, it uses the equals(Object o) method of the closest parent class that has overridden this method.

### 10. What is wrapper class?
* The wrapper classes in Java are used to convert primitive types ( int , char , float , etc) into corresponding objects. Each of the 8 primitive types has corresponding wrapper classes.

### 11. What is autoboxing?
Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes. For example, converting an int to an Integer, a double to a Double, and so on. If the conversion goes the other way, this is called unboxing.

### 12. StringBuilder is threadsafe but slower than StringBuffer, true or false?
* False
* 
### 13. Constructor can be inherited, true or false?
* False

### 14. How to call a super class’s constructor?
* Use of super() to access superclass constructor

### 15.Which class is the super class of all classes?
* Object class is the root or superclass of the class hierarchy, which is present in java. lang package. All predefined classes and user-defined classes are the subclasses from Object class.

### 16. Create a program to count how many files/folders are there inside one folder.
* the count method should take a parameter called Criteria like this: count(Criteria criteria){}
* For Criteria class, multiple conditions should be included such as: folder path, includeSubFolder or not, the extension of the file be counted and so on.
* Optional: Take the input from keyboard.
* Take care of the invalid inputs. Exception handling.
* Get proper result displayed.
"There are XXX file(s) and XXX folder(s) inside folder XXX with extension XXX." or something user friendly.

