# Strategy Design Patterns
- When you want to define a class that will have one behavior that is similar to other behaviors in a list
  - Example: I want the class object to be able to choose from
    - Not Flying
    - Fly with Wings
    - Fly Super Fast
- When you need to use one of several behaviors dynamically
- Benefits:
  - Often reduces long lists of conditionals
  - Avoids duplicate code
  - Keeps class changes from forcing other class changes
  - Can hid complicated / secret code from the user
- Negative: Increases number of objects / classes

## Example 1 - Animal
  - Utilizing different Animal subclasses and a Fly interface to demonstrate the strategy pattern
  
## Example 2 - BillingStrategy
  - Simple billing example using strategy pattern
    
## Example 3 - BinaryOperations
  - Demonstrates strategy pattern utilizing lambdas
