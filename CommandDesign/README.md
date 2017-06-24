# Command Design Patterns
- Allows you to store lists of code that is executed at a later time or many times
- Client says I want a specific Command to run when execute() is called on 1 of these encapsulated (hidden) Objects
- An Object called the Invoker transfers this Command to another Object called a Receiver to execute the right code
- Negative: You create many small classes that store lists of commands

## Example 1 - ElectronicDevice
  - Electronic device example where we need many commands like turn on, turn off, volume, and such
  - Shows how the Command design pattern functions
  
## Example 2 - Order
  - Interface Order which is acting as a command
  - Stock class which acts as a request
  - Concrete command classes BuyStock and SellStock implementing Order interface which will do actual command processing
  - Broker Class is created which acts as an invoker object. It can take and place orders.
  - Broker object uses command pattern to identify which object will execute which command based on the type of command.
  - CommandPatternTest, is the demo class, will use Broker class to demonstrate command pattern.
  ![example2_uml](https://user-images.githubusercontent.com/16873263/27465123-4d0d94a4-5786-11e7-8cfa-961b6b3b14da.jpg)
  
## Example 3 - Command
  - Java 8 functional programming example
  - Consider a "simple" switch. In this example we configure the Switch with two commands: to turn the light on and to turn the light off.
  - A benefit of this particular implementation of the command pattern is that the switch can be used with any device, not just a light. 
