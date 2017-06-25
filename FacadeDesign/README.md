# Facade Design Patterns
- When you create a simplified interface that performs many other actions behind the scenes

## Example 1 - BankAccountFacade
  - Can I withdraw $50 from the bank?
    - Check if the checking account is valid
    - Check if the security code is valid
    - Check if funds are available
    - Make changes accordingly
  
## Example 2 - ShapeMaker
  - Shape interface and concrete classes implementing the Shape interface.
  - A facade class ShapeMaker is defined as a next step.
  - ShapeMaker class uses the concrete classes to delegate user calls to these classes.
  FacadePatternTest, our test class, will use ShapeMaker class to show the results.
  ![example2_uml](https://user-images.githubusercontent.com/16873263/27513598-cecd7f68-5920-11e7-9585-a269c18f6468.jpg)
    
