# Decorator Design Patterns
- The Decorator allows you to modify an object dynamically
- You would use it when you want the capabilities of inheritance with subclasses, but you need to add functionality at run time
- It is more flexible than inheritance
- Simplifies code because you add functionality using many simple classes
- Rather than rewrite old code you can extend with new code
- Decorator pattern allows a user to add new functionality to an existing object without altering its structure.

## Example 1 - ToppingDecorator
  - Pizza shop example
  - Prices may change per topping which would be a hassle to change all parts of the code if you used strictly inheritance
  - Allows us to assemble an order at runtime
  
## Example 2 - ShapeDecorator
  - Shape interface and concrete classes implementing the Shape interface.
  - Abstract decorator class ShapeDecorator implementing the Shape interface and having Shape object as its instance variable.
  - RedShapeDecorator is concrete class implementing ShapeDecorator.
  - DecoratorPatternTest is the test class will use RedShapeDecorator to decorate Shape objects.
  ![example2_uml](https://user-images.githubusercontent.com/16873263/27416741-39883d34-56c4-11e7-958c-d01cc86e2f8a.jpg)
    
