# Factory Design Patterns
- "Define an interface for creating an object, but let subclasses decide which class to instantiate. 
   The Factory method lets a class defer instantiation it uses to subclasses." (Gang Of Four)
- Creating an object often requires complex processes not appropriate to include within a composing object. 
  The object's creation may lead to a significant duplication of code, may require information not accessible to the composing object, 
  may not provide a sufficient level of abstraction, or may otherwise not be part of the composing object's concerns. 
  The factory method design pattern handles these problems by defining a separate method for creating the objects, 
  which subclasses can then override to specify the derived type of product that will be created.
- The factory method pattern relies on inheritance, as object creation is delegated to subclasses that implement the factory method to create objects.

## Example 1 - EnemyShipFactory
  - When a method returns one of several possible classes that share a common super class
    - Create a new enemy in a game
    - Random number generator picks a number assigned to a specific enemy
    - The factory returns the enemy associated with that number
  - The class is chosen at run time
  
## Example 2 - ShapeFacotry
  - Create a shape object dependent on run time parameter
  ![example2_uml](https://user-images.githubusercontent.com/16873263/27257596-25c24ece-5391-11e7-9733-a322597716af.jpg)
    
## Example 3 - DecodedImage
  - Creates a ImageReader object depended on runtime variables
