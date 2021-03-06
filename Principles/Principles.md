## Principles

What is a good programmer? A good programmer is able to __solve problems__ _correctly, quickly, efficiently, and using code that is not difficult to maintain_. 

Solving the problem __correctly__ implies that the solution is robust and accounts for as many edge cases as possible. TDD is a good way to accomplish this task. Benefits of TDD include ...

Soving a problem __quickly__ requires a broad familiariation with problem domains. The more familiar a programmer is with different categories of problems and their various solutions, the more quickly a potential solution can be found and implemented. Often a solution can be found via strongly defining the problem and any _sub-problems_, relating the problem to a well-known or previously solved problem, and decomposing a large problem into smaller problems. 

Solving a problem **efficiently** means reducing waste in as many areas as is practical. Efficiency can be machine facing and developer facing. Machine facing efficiency is algorithmically efficient. It is either memory or time effiecient or both. Developer facing efficiency is code which is simple to work with. This means simple to write, test, understand, and maintain. It is often that there are tradeoffs between machine and developer efficiencies. There are also trade-offs between developer efficient solutions. For example, code may be easy to write but difficult to test. It may be easy to maintain, using polymorphism for instance, but difficult to understand because of extensive and unclear abstraction. Unless resources are extremely limited, developer efficiency should be favored. 

Code that is not difficult to maintain is free of code smells. It follows well known coding patterns. It is well tested with unit tests. It's classes and functions are well named. When the purpose of the class or method is not immediately clear it is accompanied with high level documentation explaining what it's __(single)__ purpose is. 

## OO Principles

### Command Query Separation
// Problem it solves:

// description
### Dependency Injection
// Problem it solves:

// description
### Separation of Concerns
// Problem it solves:

// description

### Honest Code

**Problem:** A class or method does not declare the dependencies in it's API that it needs to do it's job. This makes it difficult to test classes and methods as their dependencies cannot be easily intercepted or mocked. 

Method dependencies:

~~~java
public void doSomeWork()
{
	Foo foo = Foo.getInstance();
	// do some work with foo
	...
}
~~~	

Class dependencies: 

~~~java
public class Baconator
{
	private BaconSupply supply;
	
	public Baconator()
	{
		supply = new BaconFactory().createSupply();
	}
	
}
~~~

**Solution:** Declare the dependencies in the API and keep your code honest!

Example: 

~~~java
public void doSomething(Foo foo)
{
	// do stuff with foo
	...
}
~~~

And:

~~~java
public class Baconator
{
	private BaconSupply supply;
	
	public Baconator(BaconSupply passedInSupply)
	{
		supply = passedInSupply;
	}
	
}
~~~

