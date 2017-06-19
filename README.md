# Design Pattern Examples

## Strategy Design Pattern
  - defines a family of algorithms
  - encapsulates each algorithm
  - makes the algorithms interchangeable within that family
    - For instance, a class that performs validation on incoming data may use a strategy pattern to select 
        a validation algorithm based on the type of data, the source of the data, user choice, or other discriminating factors. 
        These factors are not known for each case until run-time, and may require radically different validation to be performed. 
        The validation strategies, encapsulated separately from the validating object, may be used by other validating objects in 
        different areas of the system (or even different systems) without code duplication.
    ![strategy_pattern_in_uml](https://user-images.githubusercontent.com/16873263/27205111-b52b8f8a-51e3-11e7-99cc-036926819b7d.png)

## Observer Design Pattern
  - The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called     observers, and notifies them automatically of any state changes, usually by calling one of their methods.
  - Used when there is one-to-many relationship between objexts such as if one object is modified, its dependent objects are to be
    notified automatically.
  - Three actor classes -> Subjext, Observer, Client
    - Subject is an object having methods to attach and detach observers to a client object. We have created an abstract class Observer       and a concrete class Subject that is extending class Observer
  
    ![500px-observer svg](https://user-images.githubusercontent.com/16873263/27246405-3513b0c0-52a6-11e7-8bbc-15450aca9287.png)
  
## Factory Design Pattern
  - "Define an interface for creating an object, but let subclasses decide which class to instantiate. The Factory method lets a class
       defer instantiation it uses to subclasses." (Gang Of Four)
  - Creating an object often requires complex processes not appropriate to include within a composing object. 
    The object's creation may lead to a significant duplication of code, may require information not accessible to the composing object,
    may not provide a sufficient level of abstraction, or may otherwise not be part of the composing object's concerns. 
    The factory method design pattern handles these problems by defining a separate method for creating the objects, 
    which subclasses can then override to specify the derived type of product that will be created.
  - The factory method pattern relies on inheritance, as object creation is delegated to subclasses that implement the factory method to       create objects.
  
    ![factory_design_uml](https://user-images.githubusercontent.com/16873263/27257626-1e3029b4-5392-11e7-97ea-b4e1065e17a1.gif)
    
## Abstract Factory Pattern
  - Provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes.
  - In normal usage, the client software creates a concrete implementation of the abstract factory and then uses the generic interface
    of the factory to create the concrete objects that are part of the theme.
      - The client doesn't know (or care) which concrete objects it gets from each of these internal factories, since it uses only the
        generic interfaces of their products.
  - A factory is the location of a concrete class in the code at which objects are constructed.
  - The pattern is best utilised when your system has to create multiple families of products or you want to provide a library of
    products without exposing the implementation details. As you'll have noticed, a key characteristic is that the pattern will decouple
    the concrete classes from the client. 
      - An example of an Abstract Factory in use could be UI toolkits. Across Windows, Mac and Linux, UI composites such as windows,
        buttons and textfields are all provided in a widget API like SWT. However, the implementation of these widgets vary across
        platforms. You could write a platform independent client thanks to the Abstract Factory implementation.
        
    ![abstractfactory_uml svg](https://user-images.githubusercontent.com/16873263/27268321-c3e34892-5463-11e7-9d50-860d86478247.png)
    
