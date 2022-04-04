# Assignment 4
### 1. What’s the difference between final, finally? What is finalize()?
* The basic difference between final, finally and finalize is that the final is an access modifier, finally is the block in Exception Handling and finalize is the method of object class.

### 2. What’s the difference between throw and throws?
* The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code.

### 3. What are the two types of exceptions?
* checked exception and unchecked exception

### 4. What is error in java?
* In Java, an error is a subclass of Throwable that tells that something serious problem is existing and a reasonable Java application should not try to catch that error. Generally, it has been noticed that most of the occurring errors are abnormal conditions and cannot be resolved by normal conditions.

### 5. Exception is object, true or false?
* True

### 6. Can a finally block exist with a try block but without a catch?
* Yes, It is possible to have a try block without a catch block by using a final block. As we know, a final block will always execute even there is an exception occurred in a try block, except System.

###7. From java 1.7, give an example of the try-resource feature.

### 8. What will happen to the Exception object after exception handling?
* The Exception object will be garbage collected in the next garbage collection.

### 9. Can we use String as a condition in switch(str){} clause?
* It is recommended to use String values in a switch statement if the data you are dealing with is also Strings. The expression in the switch cases must not be null else, a NullPointerException is thrown (Run-time). Comparison of Strings in switch statement is case sensitive
### 10. What’s the difference between ArrayList, LinkedList and vector?
* ArrayList in java, uses dynamic arrays to store its elements and maintains insertion order. ArrayList can store duplicate elements. It is a non synchronized collection type. ArrayList class extends AbstractList and implements the List, RandomAccess, Cloneable, Serializable interfaces. 
* LinkedList in java, uses linked list data structure as it’s internal implementation to store elements. It can store duplicate elements. LinkedList class extends AbstractSequentialList and implements the List, Deque, Cloneable, Serializable interfaces. Like ArrayList, LinkedList is also not synchronized.
* Vector class in java, implements a growable or dynamic array of objects. Similar to an array, Vector contains components which can be accessed using an integer index. After the Vector creation, the size of a Vector can grow or shrink as needed to accommodate adding and removing elements. Vector extends AbstractList and implements List, RandomAccess, Cloneable, Serializable interfaces. 
* ArrayList should be preferred over LinkedList if get and set are much more as compared to adding or removing the elements but if adding or removing operations are higher than get and set operation then LinkedList should be preferred.
* As ArrayList is non-synchronized and fast, so in single threaded applications ArrayList should be preferred but in multi-threaded applications Vector should be used over ArrayList because of it’s synchronized nature.

### 11. What’s the difference between hashTable and hashMap?
* HashMap is non-synchronized. It is not thread-safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
* HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
* HashMap is generally preferred over HashTable if thread synchronization is not needed.

### 12. What is static import?
* static import allows to access the static members of a class without class qualifications.
* static import is a feature introduced in the Java programming language that allows members (fields and methods) which have been scoped within their container class as public static, to be used in Java code without specifying the class in which the field has been defined. This feature was introduced into the language in version 5.0.
* The feature provides a typesafe mechanism to include constants into code without having to reference the class that originally defined the field. It also helps to deprecate the practice of creating a constant interface (an interface that only defines constants then writing a class implementing that interface, which is considered an inappropriate use of interfaces.
### 13. What is static block?
* In a Java class, a static block is a set of instructions that is run only once when a class is loaded into memory. A static block is also called a static initialization block. This is because it is an option for initializing or setting up the class at run-time.

### 14. Explain the keywords:				
* default(java 1.8), break, continue, synchronized, strictfp, transient, volatile, instanceOf
* The default keyword the default block of code in a switch statement. The default keyword specifies some code to run if there is no case match in the switch. Note: if the default keyword is used as the last statement in a switch block, it does not need a break .
* The break statement in Java terminates the loop immediately, and the control of the program moves to the next statement following the loop. It is almost always used with decision-making statements (Java if...else Statement).
* The continue keyword is used to end the current iteration in a for loop (or a while loop), and continues to the next iteration.
* Synchronization in java is the capability to control the access of multiple threads to any shared resource. In the Multithreading concept, multiple threads try to access the shared resources at a time to produce inconsistent results. The synchronization is necessary for reliable communication between threads
* strictfp is a modifier that stands for strict floating-point which was not introduced in the base version of java as it was introduced in Java version 1.2. It is used in java for restricting floating-point calculations and ensuring the same result on every platform while performing operations in the floating-point variable.
* Floating-point calculations are platform-dependent i.e. different output(floating-point values) is achieved when a class file is run on different platforms(16/32/64 bit processors). To solve this type of issue, strictfp keyword was introduced in JDK 1.2 version by following IEEE 754 standards for floating-point calculations. 
* transient is a Java keyword which marks a member variable not to be serialized when it is persisted to streams of bytes. When an object is transferred through the network, the object needs to be 'serialized'. Serialization converts the object state to serial bytes. 
* For Java, “volatile” tells the compiler that the value of a variable must never be cached as its value may change outside of the scope of the program itself. 
* The java “instanceof” operator is used to test whether the object is an instance of the specified type (class or subclass or interface). It is also known as type comparison operator because it compares the instance with type. It returns either true or false.

### 15.Create a program including two threads – thread read and thread write.
* Input file ->Thread read -> Calculate -> buffered area Buffered area -> Thread write -> output file
* Detailed description is in assignment4.txt file. Sample input.txt file					
* Attached files are input.txt and a more detailed description file.
