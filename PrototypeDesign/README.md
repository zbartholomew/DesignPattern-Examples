# Prototype Design Patterns
- Creating new objects (instances) by cloning (copying) other objects
- Allows for adding of any subclass instance of a known super class at run time
- When there are numerous potential classes that you want to only use if needed at runtime
- Reduces the need for creating subclasses

## Example 1 - Animal
  - Animal interface that extends clonable
  - Sheep object that implements Animal
  - CloneFactory that gets/makes a clone of an animal
  
## Example 2 - Shape
  - Create an abstract class Shape and concrete classes extending the Shape class. 
  - A class ShapeCache is defined as a next step which stores shape objects in a Hashtable and returns their clone when requested.
  - PrototypPatternTest, the test class will use ShapeCache class to get a Shape object.
    
  ![example2_uml](https://user-images.githubusercontent.com/16873263/27359187-429b92f4-55cf-11e7-983c-4f85bb1a8c61.jpg)
    
## Example 3 - Prototype
  - This pattern creates the kind of object using its prototype. 
  - In other words, while creating the object of Prototype object, the class actually creates a clone of it and returns it as prototype. 
  - You can see here, we have used Clone method to clone the prototype when required.
  
