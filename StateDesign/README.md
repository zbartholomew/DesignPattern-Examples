# State Design Pattern
  - Allows an object to alter its behavior when its internal state changes.
    - The object will appear to change its class
  - Context: Maintains an instance of a ConcreteState subclass that defines the current state
  - State: Defines an interface for encapsulating the behavior associated with a particular state of the Contect.
  - Concrete State: Each subclass implements a behavior associated with a state of Context
  
## ATMState
  - Think about all the possible states for an ATM:
    - HasCard
    - NoCard
    - HasPin
    - NoCash
  - This example shows a basic implementation of an ATM
  
## State
  - State interface defining an action and concrete state classes implementing the State interface.
  - Context is a class which carries a State.
  - StatePatternTest, our test class, will use Context and state objects to demonstrate change in Context behavior based on type of state it is in.
  
  ![example2_uml](https://user-images.githubusercontent.com/16873263/27759161-ffb2ec46-5ddd-11e7-97e9-555ba5ed4252.jpg)
