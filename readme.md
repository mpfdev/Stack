# Stack

## A linear Data Structure that follows LIFO

- The last element added to the stack is the first one to be removed.
- Often used to store data temporarily or to reverse the order of elements

### Java

- The `STACK` class from the `JAVA.UTIL` package provides a stack data structure implemented.
- The `STACK` class is not thread-safe and **should not be used** in multi-thread environment

#### Key methods provided by this class

- .push(elem): pushes the element onto the stack
- .pop(): removes and returns the top element of the stack
- .peek(): returns the top element of the stack
- .empty(): returns `true` if the stack is empty.
- .search(elem): returns the position of given elem in the stack
- .size(): returns the number of elements in the stack