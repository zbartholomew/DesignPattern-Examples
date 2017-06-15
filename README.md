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
