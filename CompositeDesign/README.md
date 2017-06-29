# Composite Design Patterns
- Allows you to treat individual objects and compositions of objects uniformly
- They allow you to represent part-whole hierarchies
  - Components can be further divided into smaller components
- You can structure data, or represent the inner working of every part of a whole object individually.


## Example 1 - Song
  - SongComponent (interface)
  - SongGroup (composite)
  - Song (leaf with no children)
    
## Example 2 - Employee
  - Class Employee which acts as composite pattern actor class
  - CompositePatternTest, our test class, will use Employee class to add department level hierarchy and print all employees.
      
  ![example2_uml](https://user-images.githubusercontent.com/16873263/27670731-b3455f24-5c43-11e7-9d4f-42a3a932eab9.jpg)
