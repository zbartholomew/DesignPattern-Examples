# Memento Design Patterns
- A way to store a pervious state of an Object easily
- Memento: The basic object that is stored in different states
- Originator: Sets and Gets values from currently targeted Memento.  Creates new Mementos and assigns current values to them.
- Caretasker: Holds an ArrayList that contains all previous versions of the Memento.  It can store and retrieve stored Mementos.

## Example 1 - Memento
  - Save and undo text saved states example
  
## Example 2 - Memento
  - Memento contains state of an object to be restored. 
  - Originator creates and stores states in Memento objects and Caretaker object is responsible to restore object state from Memento. 
  - Classes Memento, Originator and CareTaker.
  - MementoPatternTest, our test class, will use CareTaker and Originator objects to show restoration of object states.
  
  ![example2_uml](https://user-images.githubusercontent.com/16873263/27847384-21fbead4-60f2-11e7-842d-f8453533becc.jpg)
