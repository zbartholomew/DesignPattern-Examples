# Chain of Responsibility Design Patterns
- This pattern sends data to an object and if that object can't use it, it sends it to any number of other objects that may be able to use it

## Example 1 - Chain
  - 4 objects that can either add, subtract, multiply, or divide
  - Sends 2 numbers and a command and allow these 4 objects to decide whihc can handle the request calculation.
  
## Example 2 - AbstractLogger
  - Abstract class AbstractLogger with a level of logging. 
  - Three types of loggers extending the AbstractLogger. 
  - Each logger checks the level of message to its level and print accordingly otherwise does not print and pass the message to its next logger.
  
  ![example2_uml](https://user-images.githubusercontent.com/16873263/27777207-9f68ad74-5f65-11e7-8b21-c32217739ee0.jpg)
