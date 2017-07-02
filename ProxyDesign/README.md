# Proxy Design Patterns
- Provide a class which will limit access to another class
- You may do this for security reasons, because an Object is intensive to create, or is accessed from a remote location.

## Example 1 - ATMProxy
  - Expands on example1 illustrated in the State design pattern
  - This time we hide certain methods behind a proxy.
  - This example illustrates a "remote proxy" pattern.
  
## Example 2 - ImageProxy
  - This example illustrates the "virtual proxy" pattern. The ProxyImage class is used to access a remote method.
  - Image interface and concrete classes implementing the Image interface.
  - ProxyImage is a a proxy class to reduce memory footprint of RealImage object loading.
  - ProxyPatternTest, our test class, will use ProxyImage to get an Image object to load and display as it needs.
    
    ![example2_uml](https://user-images.githubusercontent.com/16873263/27774338-4820e4a2-5f45-11e7-9498-0a1038ec3f43.jpg)
