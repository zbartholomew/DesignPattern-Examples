# Mediator Design Patterns
- It is used to handle communication between related objects (Colleagues)
- All communication is handled by the Mediator and the Colleagues don't need to know anything about each other
- GOF: Allows loose coupling by encapsulating the way disparate sets of objects interact and communicate with each other.  Allows for the action of each object set to vary independently of one another.

## Example 1 - StockMediator
  - Mediator interface
  - Colleague abstract class
  - Demonstrating how StockOffers would execute buy and sale offers
  
## Example 2 - ChatRoom
  - Demonstrating mediator pattern by example of a chat room where multiple users can send message to chat room and it is the responsibility of chat room to show the messages to all users.
  - Two classes ChatRoom and User.
    - User objects will use ChatRoom method to share their messages.
  - MediatorPatternTest, our test class, will use User objects to show communication between them.
  
  ![example2_uml](https://user-images.githubusercontent.com/16873263/27815487-7ce8153a-6039-11e7-86b8-0fac157697e2.jpg)
