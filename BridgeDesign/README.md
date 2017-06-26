# Bridge Design Patterns
- Basically, we are progressively adding functionality while separating out major differences using abstract classes.
- When to use?
  - When you want to be able to change both abstractions (abstract classes) and concrete classes independently
  - The concrete class adds additional rules
  - An abstract class has a reference to the device and it defines abstract methods that will be defined
  - The conrete remote defines the abstract methods required

## Example 1 - TestTheRemote
  - Build devides and remotes that behave differently on different devices
  
## Example 2 - BridgePatternTest
  - We have a DrawAPI interface which is acting as a bridge implementer and concrete classes RedCircle, 
    GreenCircle implementing the DrawAPI interface. 
  - Shape is an abstract class and will use object of DrawAPI.
  - BridgePatternTest, our test class, will use Shape class to draw different colored circle.
  
 ![example2_uml](https://user-images.githubusercontent.com/16873263/27524831-9a5fe95a-59ed-11e7-892e-331dcce4b01a.jpg)
