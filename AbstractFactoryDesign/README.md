# Abstract Factory Design Patterns
- It is like a facory, but everything is encapsulated
  - The method that orders the object
  - The factories that build the object
  - The final objects
  - The final objects contain objects that use the strategy pattern
    - Composition: Object class fields are objects
- Allows you to create families of related objects without specifying a concrete class
- Use when you have many objects that can be added, or changed dynamically during runtime
- You can model anything you can imagine and have those objects interact through common interfaces
- The bad: things can get complicated


## Example 1 - EnemyShip
  - Run EnemyShipTesting for results
  
  ![example1_diagram](https://user-images.githubusercontent.com/16873263/27269010-3c4ea674-5468-11e7-9a5c-803bbe257ddc.png)
  
## Example 2 - Shape
  - Run AbstractFactoryTester for results
   -  our demo class uses FactoryProducer to get a AbstractFactory object. 
      It will pass information (CIRCLE / RECTANGLE / SQUARE for Shape) to AbstractFactory to get the type of object it needs. 
      It also passes information (RED / GREEN / BLUE for Color) to AbstractFactory to get the type of object it needs.
  - Create a Shape and Color interfaces and concrete classes implementing these interfaces.
  - Create an abstract factory class AbstractFactory as next step.
  - Factory classes ShapeFactory and ColorFactory are defined where each factory extends AbstractFactory.
  - A factory creator/generator class FactoryProducer is created.
  
  ![example2_uml](https://user-images.githubusercontent.com/16873263/27269015-463528b6-5468-11e7-8fea-f45a653bb2fa.jpg)
    
## Example 3 - BinaryOperations
  - Run Main for results
  - The method createButton on the GUIFactory interface returns objects of type Button. 
    What implementation of Button is returned depends on which implementation of GUIFactory is handling the method call.
  
  ![example3_uml svg](https://user-images.githubusercontent.com/16873263/27269025-4d34565a-5468-11e7-91ec-2d6c7c464377.png)
