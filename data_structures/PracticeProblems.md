# Practice Problems

### Data Structure Problems

Algorithm Design Manual - *Skienna* section 3.10


### Stacks, Queues, and Lists


#### Statement:
1. A common problem for compilers and text editors is determining whether the parentheses in a string are balanced and properly nested. For example, the string ((())())() contains properly nested pairs of parentheses, which the strings )()( and ()) do not. Give an algorithm that returns true if a string contains properly nested and balanced parentheses, and false if otherwise. For full credit, identify the position of the first offending parenthesis if the string is not properly nested and balanced.


#### Solution(s):

	For each character in string
		If open paren found
			push onto stack
		If close paren found
			pop from stack
			if pop result is null
				return false