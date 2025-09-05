# Animal-Hierarchy-and-Polymorphism
This is a Java project that demonstrates object-oriented programming concepts, specifically inheritance, polymorphism, and interfaces. The project consists of an abstract animal class and several concrete classes that inherit from it.

Features
Abstract Base Class: The animal class serves as a blueprint for all animals, with common properties like name and a say() method that must be implemented by its subclasses.

Inheritance: dog, cat, and fish are subclasses of animal, each providing its own specific implementation of the say() method.

Polymorphism: The singAlong class demonstrates polymorphism by using an array of type animal to hold different animal subclasses.

Sorting with Comparable: The dog class implements the Comparable interface, which allows an array of dog objects to be sorted based on their name and then their type.
