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
    
## Bridge Design Pattern
  - Meant to "decouple an abstraction from its implementation so that the two can vary independently", introduced by the Gang of Four
    (GoF).
  - The bridge uses encapsulation, aggregation, and can use inheritance to separate responsibilities into different classes.
  - The bridge pattern is often confused with the adapter pattern. In fact, the bridge pattern is often implemented using the object
    adapter pattern
    
    ![bridge_uml](https://user-images.githubusercontent.com/16873263/27524830-97f67eae-59ed-11e7-9644-8dbdaf15d20a.png)
    
  - Abstraction (abstract class)
    - defines the abstract interface
    - maintains the Implementor reference.
  - RefinedAbstraction (normal class)
    - extends the interface defined by Abstraction
  - Implementor (interface)
    - defines the interface for implementation classes
  - ConcreteImplementor (normal class)
     - implements the Implementor interface
     
## Template Design Pattern
  - A behavioral design pattern that defines the program skeleton of an algorithm in an operation, deferring some steps to subclasses.
  - It lets one redefine certain steps of an algorithm without changing the algorithm's structure.
  - The template method is used in frameworks, where each implements the invariant parts of a domain's architecture, leaving
    "placeholders" for customization options.
  - This is an example of inversion of control. The template method is used for the following reasons:
    - Let subclasses implement varying behavior (through method overriding).
    - Avoid duplication in the code: the general workflow structure is implemented once in the abstract class's algorithm, and necessary
      variations are implemented in the subclasses.
    - Control at what point(s) subclassing is allowed. As opposed to a simple polymorphic override, where the base method would be
      entirely rewritten allowing radical change to the workflow, only the specific details of the workflow are allowed to change.
      
    ![template_method_uml](https://user-images.githubusercontent.com/16873263/27570929-aa38152c-5ab6-11e7-8e12-ab0187bcf558.png)
  
## Iteratory Design Pattern
  - An iterator is created and used to traverse a container and access the container's elements.
  - The iterator pattern decouples algorithms from containers; in some cases, algorithms are necessarily container-specific and thus
    cannot be decoupled.
  - The essence of the Iterator Pattern is to "Provide a way to access the elements of an aggregate object sequentially without exposing
    its underlying representation."
  - Java has the Iterator interface.
  - As of Java 5, objects implementing the Iterable interface, which returns an Iterator from its only method, can be traversed using
    Java's foreach loop syntax. 
  - The Collection interface from the Java collections framework extends Iterable.
  
   ![iterator_uml](https://user-images.githubusercontent.com/16873263/27613619-5882f396-5b51-11e7-8d85-ccdf1b4e7e45.png)
   
## Composite Design Pattern
  - Describes a group of objects that is treated the same way as a single instance of the same type of object.
  - The intent of a composite is to "compose" objects into tree structures to represent part-whole hierarchies.
  - Implementing the composite pattern lets clients treat individual objects and compositions uniformly.
  - Composite should be used when clients ignore the difference between compositions of objects and individual objects.
  - If programmers find that they are using multiple objects in the same way, and often have nearly identical code to handle each of         them, then composite is a good choice; it is less complex in this situation to treat primitives and composites as homogeneous.
  
    ![composite_uml](https://user-images.githubusercontent.com/16873263/27670730-b2776920-5c43-11e7-84fa-0086011d8a93.png)
    
    - Component
      - is the abstraction for all components, including composite ones
      - declares the interface for objects in the composition
      - (optional) defines an interface for accessing a component's parent in the recursive structure, and implements it if that's
        appropriate
        
    - Leaf
      - represents leaf objects in the composition
      - implements all Component methods
      
    - Composite
      - represents a composite Component (component having children)
      - implements methods to manipulate children
      - implements all Component methods, generally by delegating them to its children
      
## Flyweight Design Pattern
  - A flyweight is an object that minimizes memory usage by sharing as much data as possible with other similar objects
  - It is a way to use objects in large numbers when a simple repeated representation would use an unacceptable amount of memory.
  - Often some parts of the object state can be shared, and it is common practice to hold them in external data structures and pass
    them to the flyweight objects temporarily when they are used.
  - A classic example usage of the flyweight pattern is the data structures for graphical representation of characters in a word
    processor. 
    - It might be desirable to have, for each character in a document, a glyph object containing its font outline, font metrics, and
      other formatting data, but this would amount to hundreds or thousands of bytes for each character. 
    - Instead, for every character there might be a reference to a flyweight glyph object shared by every instance of the same character
      in the document; only the position of each character (in the document and/or the page) would need to be stored internally.
  - Special consideration must be made in scenarios where Flyweight objects are created on multiple threads.
  
  ![flyweight_design](https://user-images.githubusercontent.com/16873263/27721216-d01612d0-5d13-11e7-8303-5f4f222e7000.png)
  
## State Design Pattern
  - In State pattern a class behavior changes based on its state.
    - This type of design pattern comes under behavior pattern.
  - In State pattern, we create objects which represent various states and a context object whose behavior varies as its state object changes.
  - The state pattern can be interpreted as a strategy pattern which is able to switch the current strategy through invocations of methods defined in the pattern's interface.
  
  ![state_uml](https://user-images.githubusercontent.com/16873263/27759160-fe84920c-5ddd-11e7-98a8-f8d65a969d67.png)
  
## Proxy Design Pattern
  - A proxy, in its most general form, is a class functioning as an interface to something else.
  - The proxy could interface to anything: a network connection, a large object in memory, a file, or some other resource that is expensive or impossible to duplicate.
  -  In short, a proxy is a wrapper or agent object that is being called by the client to access the real serving object behind the scenes. 
  - Usage:
    - Remote Proxy
      - In distributed object communication, a local object represents a remote object (one that belongs to a different address space). The local object is a proxy for the remote object, and method invocation on the local object results in remote method invocation on the remote object. An example would be an ATM implementation, where the ATM might hold proxy objects for bank information that exists in the remote server.
    - Virtual Proxy
      - In place of a complex or heavy object, a skeleton representation may be advantageous in some cases. When an underlying image is huge in size, it may be represented using a virtual proxy object, loading the real object on demand.
    - Protection Proxy
      - A protection proxy might be used to control access to a resource based on access rights.
  
  ![proxy_uml](https://user-images.githubusercontent.com/16873263/27774337-480cd71e-5f45-11e7-9b8b-bb8b88e8b1dc.png)
  
## Chain of Responsibility Design Pattern
  - A design pattern consisting of a source of command objects and a series of processing objects
  - Each processing object contains logic that defines the types of command objects that it can handle; the rest are passed to the next processing object in the chain. 
  - A mechanism also exists for adding new processing objects to the end of this chain.
  - This pattern promotes the idea of loose coupling.
  
  ![chain_uml](https://user-images.githubusercontent.com/16873263/27777206-9f4269b6-5f65-11e7-9bf3-4b2f9053e0e3.gif)
  
## Mediator Design Pattern
  - The mediator pattern defines an object that encapsulates how a set of objects interact.
  - With the mediator pattern, communication between objects is encapsulated within a mediator object. 
    - Objects no longer communicate directly with each other, but instead communicate through the mediator. 
    - This reduces the dependencies between communicating objects, thereby reducing coupling.
  - Mediator - defines the interface for communication between Colleague objects
  - ConcreteMediator - implements the Mediator interface and coordinates communication between Colleague objects. It is aware of all of the Colleagues and their purposes with regards to inter-communication.
  - Colleague - defines the interface for communication with other Colleagues
  - ConcreteColleague - implements the Colleague interface and communicates with other Colleagues through its Mediator
  
  ![mediator_design_pattern](https://user-images.githubusercontent.com/16873263/27815488-7cee987e-6039-11e7-8e7c-bb56f35b4d13.png)

## Memento Design Pattern
  - Provides the ability to restore an object to its previous state (undo via rollback).
  - The memento pattern is implemented with three objects: the originator, a caretaker and a memento.
    - The originator is some object that has an internal state. 
    - The caretaker is going to do something to the originator, but wants to be able to undo the change. 
      - The caretaker first asks the originator for a memento object. 
      - Then it does whatever operation (or sequence of operations) it was going to do. 
      - To roll back to the state before the operations, it returns the memento object to the originator. 
    - The memento object itself is an opaque object (one which the caretaker cannot, or should not, change). 
  - When using this pattern, care should be taken if the originator may change other objects or resources - the memento pattern operates on a single object.
  - Classic examples of the memento pattern include the seed of a pseudorandom number generator (it will always produce the same sequence thereafter when initialized with the seed state) and the state in a finite state machine.
  
  
  ![memento_uml](https://user-images.githubusercontent.com/16873263/27847385-21fe7bdc-60f2-11e7-84f0-ca9f7b75e1ea.png) 
  
## Visitor Design Pattern
  - Is a way of separating an algorithm from an object structure on which it operates. 
  - A practical result of this separation is the ability to add new operations to extant object structures without modifying the structures. 
  - It is one way to follow the open/closed principle.
  - In essence, the visitor allows adding new virtual functions to a family of classes, without modifying the classes. 
  - Instead, a visitor class is created that implements all of the appropriate specializations of the virtual function. 
  - The visitor takes the instance reference as input, and implements the goal through double dispatch.
  - The Gang of Four defines the Visitor as:
    - Represent an operation to be performed on elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.
  - The nature of the Visitor makes it an ideal pattern to plug into public APIs thus allowing its clients to perform operations on a class using a "visiting" class without having to modify the source.
  - Uses: Moving operations into visitor classes is beneficial when
    - many unrelated operations on an object structure are required,
    - the classes that make up the object structure are known and not expected to change,
    - new operations need to be added frequently,
    - an algorithm involves several classes of the object structure, but it is desired to manage it in one single location,
    - an algorithm needs to work across several independent class hierarchies.
  - A drawback to this pattern, however, is that it makes extensions to the class hierarchy more difficult, as new classes typically require a new visit method to be added to each visitor.
  
  ![visitor_uml](https://user-images.githubusercontent.com/16873263/27847390-25342298-60f2-11e7-8fab-16c2251eabd3.png)
  
## Model View Controller (MVC) Design Pattern
  - Model–view–controller (MVC) is a software architectural pattern for implementing user interfaces on computers
  - It divides a given application into three interconnected parts in order to separate internal representations of information from the ways that information is presented to and accepted from the user.
  - The MVC design pattern decouples these major components allowing for efficient code reuse and parallel development.
  - Components:
    - The model is the central component of the pattern. It expresses the application's behavior in terms of the problem domain, independent of the user interface. It directly manages the data, logic and rules of the application.
    - A view can be any output representation of information, such as a chart or a diagram. Multiple views of the same information are possible, such as a bar chart for management and a tabular view for accountants.
    - The third part, the controller, accepts input and converts it to commands for the model or view.
  - Interactions: In addition to dividing the application into three kinds of components, the model–view–controller design defines the interactions between them.
    - A model stores data that is retrieved according to commands from the controller and displayed in the view.
    - A view generates new output to the user based on changes in the model.
    - A controller can send commands to the model to update the model's state (e.g., editing a document). It can also send commands to its associated view to change the view's presentation of the model (e.g., scrolling through a document).
    
    ![mvc](https://user-images.githubusercontent.com/16873263/27895029-8a059ef4-61c4-11e7-87c2-1bd59291ce07.png)
