# Observer Design Patterns
- Loose coupling is a benefit
  - The subject does not need to know anything about the observers
- Negatives: The subject may send updates that dont matter to the observer

## Example 1 - StockGraber
  - Stock market with thousands of stocks needs to send updates to objects representing individual stocks
  - The Subject (publisher) sends many stocks to the observer
  - The Observer (subscribers) takes the ones they want and uses them
  
## Example 2 - EventSource
  - Takes keyboard input and treats each input line as an event.
    the example is built upon the library classes java.util.Observer and java.util.Observable. 
    When a string is supplied from System.in, the method notifyObservers is then called, 
    in order to notify all observers of the event's occurrence, in the form of an invocation of their 'update' methods.
    
## Example 3 - ObserverPatternDemo
  - Demonstrates state changes that notifies observers and has them print out the correct hex, octal, and binary strings.
  
  ![observer_pattern_uml_diagram](https://user-images.githubusercontent.com/16873263/27246975-05425f5a-52aa-11e7-998b-ee1bfbbf0d47.jpg)
  
  
