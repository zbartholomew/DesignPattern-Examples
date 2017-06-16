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
  - The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called       observers, and notifies them automatically of any state changes, usually by calling one of their methods.
  - Used when there is one-to-many relationship between objexts such as if one object is modified, its dependent objects are to be
    notified automatically.
  - Three actor classes -> Subjext, Observer, Client
    - Subject is an object having methods to attach and detach observers to a client object. We have created an abstract class Observer         and a concrete class Subject that is extending class Observer
  
  ![500px-observer svg](https://user-images.githubusercontent.com/16873263/27246405-3513b0c0-52a6-11e7-8bbc-15450aca9287.png)
