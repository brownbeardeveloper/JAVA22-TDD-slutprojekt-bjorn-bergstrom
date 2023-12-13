## JUnit Framework
JUnit is a framework for conducting unit tests in Java programs. Unit tests are a type of software testing that focuses on testing individual units of the program, such as functions or methods, in isolation from the rest of the code. JUnit is particularly geared towards supporting Test-Driven Development (TDD) and automated test execution.

## The project
In this project, we are testing according to TDD principles. The program under test is a "producer-consumer" system. In this program, a producer generates "Item" objects, and the consumer consumes these "Item" objects. "Item" objects are stored in a "Buffer" object, from which the consumer can retrieve "Item" objects. Producer and consumer objects are not implemented, and only their interfaces are accessible. Both classes should be simulated and correctly implement the specified interfaces. All code should be thoroughly tested, including Boundary testing, Null values, Exceptions, Input/Output, Data Types, etc.

## Learning
It was interesting to understand how we can manipulate objects with mock classes, making it easier to test the code. Initially, it was a bit confusing to figure out how to test Producer and Consumer when they were only interface classes. However, after reading up on it, we understood exactly how to recreate mock classes to simulate how a real program would function. The MockHelper class was also helpful in understanding how it can assist in a test without modifying the original code.
