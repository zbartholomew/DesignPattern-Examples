# Template Design Patterns
  - Used to create a group of subclasses that have to execute a similar group of methods
  - Create an abstract class that contains a method called the Template Method
  - The Template Method contains a series of method calls that every subclass object will call
  - The subclass object can override some of the method calls

## Example 1 - Hoagie
  - Building different kinds of sandwhiches using the template pattern
  
## Example 2 - TemplatePatternTest
  - Create a Game abstract class defining operations with a template method set to be final so that it cannot be overridden.
  - Soccer and Football are concrete classes that extend Game and override its methods.
  - TemplatePatternTest, our test class, will use Game to demonstrate use of template pattern.
    
