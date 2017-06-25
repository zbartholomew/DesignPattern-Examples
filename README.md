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
    
## Singleton Pattern
  - Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual
    machine.
  - The singleton class must provide a global access point to get the instance of the class.
  - Singleton pattern is used for logging, drivers objects, caching and thread pool.
  - To implement Singleton pattern, we have different approaches but all of them have following common concepts.
    - Private constructor to restrict instantiation of the class from other classes.
    - Private static variable of the same class that is the only instance of the class.
    - Public static method that returns the instance of the class, this is the global access point for outer world to get the instance
      of the singleton class.
    - Allow multiple instances in the future without affecting a singleton class's clients.
  - The abstract factory, builder, and prototype patterns can use Singletons in their implementation.
  - Facade objects are often singletons because only one Facade object is required.
  - State objects are often singletons.
  - Singletons are often preferred to global variables because:
      - They do not pollute the global namespace (or, in languages with namespaces, their containing namespace) with unnecessary
        variables.
      - They permit lazy allocation and initialization, whereas global variables in many languages will always consume resources.
      
    ![singleton_pattern_uml_diagram](https://user-images.githubusercontent.com/16873263/27315072-59611322-552c-11e7-897d-d9d5f5a96fe2.jpg)
    
## Builder Design Pattern
  - The intent of the Builder design pattern is to separate the construction of a complex object from its representation. By doing so
    the same construction process can create different representations.
  - The builder pattern is an object creation software design pattern.
  - Unlike the abstract factory pattern and the factory method pattern whose intention is to enable polymorphism, the intention of the
    builder pattern is to find a solution to the telescoping constructor anti-pattern
  - Builder often builds a Composite. 
  - Often, designs start out using Factory Method (less complicated, more customizable, subclasses
    proliferate) and evolve toward Abstract Factory, Prototype, or Builder (more flexible, more complex) as the designer discovers where
    more flexibility is needed.
  - Advantages:
    - Allows you to vary a product’s internal representation.
    - Encapsulates code for construction and representation.
    - Provides control over steps of construction process.
  - Disadvantages:
    - Requires creating a separate ConcreteBuilder for each different type of Product.
    - Requires the builder classes to be mutable.
  - The builder pattern has another benefit. It can be used for objects that contain flat data (html code, SQL query, X.509
    certificate...), that is to say, data that can't be easily edited. This type of data can't be edited step by step and must be edited
    at once.
  - Builder: Abstract interface for creating objects (product).
  - ConcreteBuilder: Provides implementation for Builder. It is an object able to construct other objects. Constructs and assembles
    parts to build the objects.
    
    ![builder_uml](https://user-images.githubusercontent.com/16873263/27315779-77c28716-5530-11e7-9f53-6b853bf53f53.png)
    
## Prototype Design Pattern
  - Used when the type of objects to create is determined by a prototypical instance, which is cloned to produce new objects. This
    pattern is used to:
    - avoid subclasses of an object creator in the client application, like the abstract factory pattern does.
    - avoid the inherent cost of creating a new object in the standard way (e.g., using the 'new' keyword) when it is prohibitively
      expensive for a given application.
  - To implement the pattern, declare an abstract base class that specifies a pure virtual clone() method. Any class that needs a
    "polymorphic constructor" capability derives itself from the abstract base class, and implements the clone() operation.
  - Sometimes creational patterns overlap — there are cases when either prototype or abstract factory would be appropriate. At other
    times they complement each other: abstract factory might store a set of prototypes from which to clone and return product objects
    (GoF, p126). Abstract factory, builder, and prototype can use singleton in their implementations. (GoF, p81, 134). Abstract factory
    classes are often implemented with factory methods (creation through inheritance), but they can be implemented using prototype
    (creation through delegation). (GoF, p95)
  - Often, designs start out using Factory Method (less complicated, more customizable, subclasses proliferate) and evolve toward
    abstract factory, prototype, or builder (more flexible, more complex) as the designer discovers where more flexibility is needed.
    (GoF, p136)
  - Prototype does not require subclassing, but it does require an "initialize" operation. Factory method requires subclassing, but does
    not require initialization. (GoF, p116)
    
    ![prototype_uml](https://user-images.githubusercontent.com/16873263/27359166-203926c2-55cf-11e7-8853-9f06d6b7bcd5.png)
    
## Decorator Design Pattern
  - The decorator pattern (also known as Wrapper, an alternative naming shared with the Adapter pattern) is a design pattern that allows
    behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from
    the same class.
  - The decorator pattern can be used to extend (decorate) the functionality of a certain object statically, or in some cases at run
    time, independently of other instances of the same class, provided some groundwork is done at design time.
  - This is achieved by designing a new Decorator class that wraps the original class. This wrapping could be achieved by the following
    sequence of steps:
     - Subclass the original Component class into a Decorator class (see UML diagram);
     - In the Decorator class, add a Component pointer as a field;
     - In the Decorator class, pass a Component to the Decorator constructor to initialize the Component pointer;
     - In the Decorator class, forward all Component methods to the Component pointer; and
     - In the ConcreteDecorator class, override any Component method(s) whose behavior needs to be modified.
   - A decorator makes it possible to add or alter behavior of an interface at run-time.
   - Alternatively, the adapter can be used when the wrapper must respect a particular interface and must support polymorphic behavior,
    and the Facade when an easier or simpler interface to an underlying object is desired. 

Pattern	   | Intent
---------- | -------
Adapter	   | Converts one interface to another so that it matches what the client is expecting
Decorator  | Dynamically adds responsibility to the interface by wrapping the original code
Facade     | Provides a simplified interface    

  ![decorator_uml](https://user-images.githubusercontent.com/16873263/27416572-1aef59a8-56c3-11e7-900a-198a3c115035.png)
  
## Command Design Pattern
  - A behavioral design pattern in which an object is used to encapsulate all information needed to perform an action or trigger an
    event at a later time.
  - This information includes the method name, the object that owns the method and values for the method parameters.
  - Four terms always associated with the command pattern are command, receiver, invoker and client.
    - A command object knows about receiver and invokes a method of the receiver.
      - Values for parameters of the receiver method are stored in the command, the receiver object to execute these methods is also
        stored in the command object by aggregation.
    - The receiver then does the work when the execute() method in command is called.
    - An invoker object knows how to execute a command, and optionally does bookkeeping about the command execution.
    - The invoker does not know anything about a concrete command, it knows only about command interface.
      - Invoker object(s), command objects and receiver objects are held by a client object, the client decides which receiver objects
        it assigns to the command objects, and which commands it assigns to the invoker.
    - The client decides which commands to execute at which points. To execute a command, it passes the command object to the invoker
      object.
  - Using command objects makes it easier to construct general components that need to delegate, sequence or execute method calls at a
    time of their choosing without the need to know the class of the method or the method parameters.
  - Using an invoker object allows bookkeeping about command executions to be conveniently performed, as well as implementing different
    modes for commands, which are managed by the invoker object, without the need for the client to be aware of the existence of
    bookkeeping or modes.    
  
  ![command_uml](https://user-images.githubusercontent.com/16873263/27465150-762b6a14-5786-11e7-915c-f4c9191d335a.png)
  
## Adapter Design Pattern
  - An adapter allows two incompatible interfaces to work together. This is the real world definition for an adapter. Interfaces may be
    incompatible, but the inner functionality should suit the need. The Adapter design pattern allows otherwise incompatible classes to
    work together by converting the interface of one class into an interface expected by the clients.
  - Also known as Wrapper, an alternative naming shared with the Decorator pattern
    - Allows the interface of an existing class to be used as another interface
  - An example is an adapter that converts the interface of a Document Object Model of an XML document into a tree structure that can be
    displayed.
  - An adapter can be used when the wrapper must respect a particular interface and must support polymorphic behavior. Alternatively, a
    decorator makes it possible to add or alter behavior of an interface at run-time, and a Facade is used when an easier or simpler
    interface to an underlying object is desired.
    
  - Object Adapter pattern
    - In this adapter pattern, the adapter contains an instance of the class it wraps. In this situation, the adapter makes calls to the
    instance of the wrapped object.
    
    ![objectadapter_uml](https://user-images.githubusercontent.com/16873263/27505725-7a7f4c40-585b-11e7-80ff-a851fc6184d4.png)
    
  - Class Adapter Pattern
    - This adapter pattern uses multiple polymorphic interfaces implementing or inheriting both the interface that is expected and the
      interface that is pre-existing. It is typical for the expected interface to be created as a pure interface class, especially in
      languages such as Java (before jdk 1.8) that do not support multiple inheritance of classes.
      
      ![classadapter_uml](https://user-images.githubusercontent.com/16873263/27505727-7de9e78c-585b-11e7-89f1-e950ad610bd2.png)
     
## Facade Design Pattern
  - A facade is an object that provides a simplified interface to a larger body of code, such as a class library. A facade can:
    - make a software library easier to use, understand and test, since the facade has convenient methods for common tasks,
    - make the library more readable, for the same reason,
    - reduce dependencies of outside code on the inner workings of a library, since most code uses the facade, thus allowing more
      flexibility in developing the system,
    - wrap a poorly designed collection of APIs with a single well-designed API.
  - The Facade design pattern is often used when a system is very complex or difficult to understand because the system has a large
    number of interdependent classes or its source code is unavailable.
  - This pattern hides the complexities of the larger system and provides a simpler interface to the client.
  - It typically involves a single wrapper class that contains a set of members required by client.
    - These members access the system on behalf of the facade client and hide the implementation details.
  - A Facade is used when an easier or simpler interface to an underlying object is desired. Alternatively, an adapter can be used
    when the wrapper must respect a particular interface and must support polymorphic behavior. A decorator makes it possible to add or
    alter behavior of an interface at run-time.
  - The facade pattern is typically used when:
    - a simple interface is required to access a complex system,
    - a system is very complex or difficult to understand,
    - an entry point is needed to each level of layered software, or
    - the abstractions and implementations of a subsystem are tightly coupled.
    
  ![facade_design_uml](https://user-images.githubusercontent.com/16873263/27513599-cfad668c-5920-11e7-80f7-2dcf0ffc09de.png)
  
  - Facade - The facade class abstracts Packages 1, 2, and 3 from the rest of the application.
  - Clients - The objects are using the Facade Pattern to access resources from the Packages.
    
    
  
  
