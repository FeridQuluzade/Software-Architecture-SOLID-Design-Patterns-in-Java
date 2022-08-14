# solid-principle
These are the code samples used in the "Solid Design Principles in Java" course published for Udemy

Udemy course link: https://www.udemy.com/course/basics-of-software-architecture-design-in-java/


S — Single Responsibility Principle

A class should have only a single responsibility. Only one potential change in the software’s specification should be able to affect the specification of the class.

![1520241404689](https://user-images.githubusercontent.com/83503063/181769049-b32cab65-8f0a-4830-aef1-5dfe3244d890.jpeg)

O — Open/Closed Principle

Software entities should be open for EXTENSION, but closed for MODIFICATION. Allow behavior to be extended without modifying the source-code.

![image](https://user-images.githubusercontent.com/83503063/181781724-39472fb0-2eac-4843-8979-c55922a339ae.png)

L — Liskov Substitution Principle

Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program.

![image](https://user-images.githubusercontent.com/83503063/181821742-fca1fd0d-61b4-448c-a5d9-fa2756371833.png)

I — Interface Segregation Principle

Many client-specific interfaces are better than one general-purpose interface. No client should be forced to depend on methods it does not use.

![image](https://user-images.githubusercontent.com/83503063/184551835-7e2a9843-4f17-4700-ba4d-c87ff7a213a7.png)

D — Dependency Inversion Principle

One should depend upon abstractions, not concretions.
- High-level modules should not depend on low-level modules. Both should depend on abstractions.
- Abstractions should not depend on details. Details should depend on abstractions.

![image](https://user-images.githubusercontent.com/83503063/184551908-ebc73a00-39e5-432a-9729-692e1fd9d275.png)

The plug doesn’t care which type of wire it uses, it just needs wires that conduct electricity.
