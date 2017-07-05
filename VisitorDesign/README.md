# Visitor Design Patterns
- Allows you to add methods to classes of different types without much altering to those classes
- You can make completely different methods depending on the classes used
- Allows you to define external classes that can extend other classes without majorly editing them

## Example 1 - Visitor
  - Tax example - where taxes are different for certain items
  - Visitor interface
  - TaxVisitor
  - Visitable interface - accepts visitor
  - Necessity - implements visitable
  
## Example 2 - ComputerPartVisitor
  - ComputerPart interface defining accept opearation.
  - Keyboard, Mouse, Monitor and Computer are concrete classes implementing ComputerPart interface. 
  - Interface ComputerPartVisitor which will define a visitor class operations. 
  - Computer uses concrete visitor to do corresponding action.
  - VisitorPatternTest, our test class, will use Computer and ComputerPartVisitor classes to demonstrate use of visitor pattern.
  
  ![example2_uml](https://user-images.githubusercontent.com/16873263/27847389-25335f02-60f2-11e7-9232-1f244fcc2c27.jpg)
