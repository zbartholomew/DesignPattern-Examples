package com.zbartholomew.example2;

// Use the NameRepository to get iterator and print names.

public class IteratorPatternTest {

    public static void main(String[] args) {

        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
