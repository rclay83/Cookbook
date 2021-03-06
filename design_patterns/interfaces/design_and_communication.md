# Interfaces, Communication, and Design

### Improved Communication

When an interface is defined as a dependency it communicates what the dependent behavior exactly is. Method and constructor signatures communicate more information

### Design

Interfaces force you to think about design. Concrete classes grow more easily with optionally used public methods. Working with lots of concrete classes produces a lot of Swiss army knife classes and duplicated logic. Adding to the api of an interface requires you to ask if the behavior belongs or not. This scrutiny can help keep implementations lean, organized, and focused on a single responsibility.

Interfaces encourage you to consider what **behavior** your system needs instead of the objects represented by your system. They can help focus class designs around behavior and avoid too many lazy objects that act only as data stores. **Depend on behavior not classes**. This is just another way to say **Program to an interface not an implementation.** This makes client code more robust against change and more clearly communicates *what* is actually needed from it's dependencies. 

<br>
### Interfaces and Dependency Injection

Dependencies on abstractions combined with dependency injection allow for resilient code.  

<br>
### Clear Contracts

An interface makes it clear what behavior you need to implement to replace an object or add new behavior.
