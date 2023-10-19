# Triangle-java-code
A java exercise creating a triangle program.
The Triangle Class


Problem Description:
Design a class named Triangle that extends GeometricObject. The class contains: 
•	Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
•	A no-arg constructor that creates a default triangle.
•	A constructor that creates a triangle with the specified side1, side2, and side3.
•	The accessor methods for all three data fields. 
•	A method named getArea() that returns the area of this triangle.
•	A method named getPerimeter() that returns the perimeter of this triangle.
•	A method named toString() that returns a string description for the triangle. 


Draw the UML diagram that involves the classes Triangle and GeometricObject. Implement the class. Write a test program that creates a Triangle object with sides 1, 1.5, 1, color yellow and filled true, and displays the area, perimeter, color, and whether filled or not. 

Design:
Draw the UML class diagram here:

Triangle GeometricObject
- side1 : double 
- side2 : double 
- side3 : double - color: String

- filled: Boolean
+ Triangle() 
+ Triangle(s1:double, s2:double, s3:double) 
+ setSide1(s1:double) : void
+ setSide2(s2:double) : void
+ setSide3(s3:double) : void
+ getSide1() : double
+ getSide2() : double
+ getSide3() : double
+ getArea() : double
+ getParameter() : double
+ toString() : String 

 

GeometricObject:
_color String
_filled Boolean 

GeometricObject()
+ getColor(): String

+ getFilled(): Boolean

+ setColor(color:String): void

+ setFilled(filled:Boolean): void

+ toString(): String|
