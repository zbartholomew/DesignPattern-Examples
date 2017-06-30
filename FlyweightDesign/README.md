# Flyweight Design Patterns
- Used when you need to create a large number of similar objects
- To reduce memory usage you share Objects that are similar in some way rather than creating new ones
- Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found.

## Example 1 - FlyWeightTest
  - Intrinsic State: Color
  - Extrinsic State: Size
  -  Creates many rectangles when you press a button and outputs the how long it took
  
## Example 2 - Shape
  - We will demonstrate this pattern by drawing 20 circles of different locations but we will create only 5 objects. 
  - Only 5 colors are available so color property is used to check already existing Circle objects.
  - Shape interface and concrete class Circle implementing the Shape interface.
  - A factory class ShapeFactory is defined as a next step.
  - ShapeFactory has a HashMap of Circle having key as color of the Circle object. 
  - Whenever a request comes to create a circle of particular color to ShapeFactory, it checks the circle object in its HashMap, if object of Circle found, that object is returned otherwise a new object is created, stored in hashmap for future use, and returned to client.
  - FlyWeightPatternTest, our test class, will use ShapeFactory to get a Shape object. 
    - It will pass information (red / green / blue/ black / white) to ShapeFactory to get the circle of desired color it needs.
  
  ![example2_uml](https://user-images.githubusercontent.com/16873263/27721227-e2e7a1ee-5d13-11e7-9d90-c8462eb4fca2.jpg)
    
