package com.zbartholomew.example2;

// Use the ComputerPartDisplayVisitor to display parts of Computer.

public class VisitorPatternTest {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
