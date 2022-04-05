# Day 6 homework

##Lock
* synchronized
* Lock

| Parameters                    | Lock Framework                                                                                                                                                                               | Synchronized                                                  |
|-------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------|
| Across Methods                | Yes, Locks can be implemented across the methods, you can invoke lock() in method1 and invoke unlock() in method2.                                                                           | Not possible                                                  |
| try to acquire lock           | yes, trylock(timeout) method is supported by Lock framework, which will get the lock on the resource if it is available, else it returns false and Thread wont get blocked.                  | Not possible with synchronized                                |
| air lock management           | Yes, Fair lock management is available in case of lock framework. It hands over the lock to long waiting thread. Even in fairness mode set to true, if trylock is coded, it is served first. | Not possible with synchronized                                |
| List of waiting threads       | Yes, List of waiting threads can be seen using Lock framework                                                                                                                                | Not possible with synchronized                                |
| Release of lock in exceptions | `Lock.lock(); myMethod();Lock.unlock();` <br/>unlock() cant be executed in this code if any exception being thrown from myMethod().                                                          | Synchronized works clearly in this case. It releases the lock |

### What's the difference between Synchronized and Lock?
1. Lock is an interface, and Synchronized is the key word. 
2. Synchronized releases the lock automatically, and Lock must release the lock manually. 
3. Lock can interrupt the response of the thread waiting for the lock, but Synchronized will not, and the thread will wait all the time. 
4. Lock lets you know if a thread has a lock, but Synchronized can't. 
5. Lock can improve the efficiency of multiple threads. 
6. Synchronized locks classes, methods, and code blocks, while Lock is block-wide

## Lock interface

| Name                              | Definition                                                                                                                |
|-----------------------------------|---------------------------------------------------------------------------------------------------------------------------|
| `public void lock()`              | Acquires the lock. The current thread will become disabled for thread scheduling purposes when the lock is not available. |
| `public void unlock()`            | Releases the lock                                                                                                         |
| `Condition newCondition()`        | Returns a new condition that is bound to the current lock instance                                                        |
| `public boolean tryLock()`        | Acquires the lock only if it is free at the specified time                                                                |
| `public void lockInterruptibly()` | Acquires the lock until the current thread is interrupted. It acquires and returns a lock immediately if it is available. |

### ReentrantLock class
* The ReentrantLock class implements the Lock interface which is used to enhance the multithreading. It provides the capability to avoid the use of synchronization to maintain the database consistency so that the waiting time of the threads can be reduced. A Thread owns the ReentrantLock which is intended to perform the write operation on some particular data.

## ReadWriteLock interface
A java.util.concurrent.locks.ReadWriteLock interface allows multiple threads to read at a time but only one thread can write at a time.

* method 
  * `Lock readLock()`: If no thread has locked the **ReadWriteLock** for **writing** then multiple thread can access the read lock. Returns the lock used for reading.
  * `Lock writeLock()`: If no thread is reading or writing, then one thread can access the write lock. Returns the lock used for writing.
* ReentrantReadWriteLock
  * ReentrantReadWriteLock class of Java is an implementation of ReadWriteLock, that also supports ReentrantLock functionality.
  * `ReentrantReadWriteLock()`: Creates a new ReentrantReadWriteLock with default (nonfair) ordering properties.
  * `ReentrantReadWriteLock(boolean fair)`: Creates a new ReentrantReadWriteLock with the given fairness policy.

## Future vs CompletableFuture
CompletableFuture is an extension to Java’s Future API which was introduced in Java 5.

A Future is used as a reference to the result of an asynchronous computation. It provides an isDone() method to check whether the computation is done or not, and a get() method to retrieve the result of the computation when it is done.

### Limitations of Future
1. It cannot be manually completed:
   * Let’s say that you’ve written a function to fetch the latest price of an e-commerce product from a remote API. Since this API call is time-consuming, you’re running it in a separate thread and returning a Future from your function. 
   * Now, let’s say that If the remote API service is down, then you want to complete the Future manually by the last cached price of the product. 
   * You cannot do this with Future!
2. You cannot perform further action on a Future’s result without blocking:
   * Future does not notify you of its completion. It provides a get() method which blocks until the result is available. 
   * You don’t have the ability to attach a callback function to the Future and have it get called automatically when the Future’s result is available.
3. Multiple Futures cannot be chained together:
   * Sometimes you need to execute a long-running computation and when the computation is done, you need to send its result to another long-running computation, and so on. 
   * You can not create such asynchronous workflow with Futures.
4. You can not combine multiple Futures together:
   * Let’s say that you have 10 different Futures that you want to run in parallel and then run some function after all of them completes. You can’t do this as well with Future.
5. No Exception Handling:
   * Future API does not have any exception handling construct.