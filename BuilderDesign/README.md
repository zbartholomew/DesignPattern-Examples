# Builder Design Patterns
- Pattern used to create objects made from a bunch of other objects
  - When you want to build an object made up from other objects
  - When you want the creation of these parts to be independent of the main object
  - Hide the creation of the parts from the client so both aren't dependent
  - The builder knows the specifics and nobody else does

## Example 1 - TestRobotBuilder
  - Specify how to build a robot via a RobotPlan which defines all the methods a robot must have
  - RobotEngineer makes the robot with fields set by the builder
  - RobotBuilder interfacedefines what every robot has
  - OldRobotBuilder sets the fields for Robots build using this specific specification
  
## Example 2 - MealBuilder
  - Considered a business case of fast-food restaurant where a typical meal could be a burger and a cold drink.
  - Burger could be either a Veg Burger or Chicken Burger and will be packed by a wrapper.
  - Cold drink could be either a coke or pepsi and will be packed in a bottle.
  - Created an Item interface representing food items such as burgers and cold drinks and concrete classes implementing 
    the Item interface and a Packing interface representing packaging of food items and concrete classes implementing the 
    Packing interface as burger would be packed in wrapper and cold drink would be packed as bottle.
    
  ![example2_uml](https://user-images.githubusercontent.com/16873263/27315785-8ae5907c-5530-11e7-8b72-2d26ea2e9fd8.jpg)
    
## Example 3 - CarBuilder
  - We have a Car class. The problem is that a car has many options. 
  - The combination of each option would lead to a huge list of constructors for this class. 
  - We will create a builder class, CarBuilder. 
  - We will send to the CarBuilder each car option step by step and then construct the final car with the right options.
