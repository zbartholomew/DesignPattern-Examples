# MVC Design Patterns
- Completely seperates the Calculations and Interface from each other
- Model: Data and Methods used to work with it
- View: The Interface
- Controller: Coordinates interactions between the View and Model

## Example 1 - MVCCalculator
  - Simple calculator project utilizing Swing GUI to demonstrate the MVC pattern
    
## Example 2 - MVCPatternTest
  - Student object acting as a model.
  - StudentView will be a view class which can print student details on console
  - StudentController is the controller class responsible to store data in Student object and update view StudentView accordingly.
  - MVCPatternTest, our test class, will use StudentController to demonstrate use of MVC pattern.
      
  ![example2_uml](https://user-images.githubusercontent.com/16873263/27895028-89f20786-61c4-11e7-9306-c3a6c2eb24c4.jpg)
