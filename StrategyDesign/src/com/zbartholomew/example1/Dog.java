package com.zbartholomew.example1;

/**
 * Created by Zach on 6/15/2017.
 */
public class Dog extends Animal{

    public void digHole(){

        System.out.println("Dug a hole");

    }

    public Dog(){

        super();

        setSound("Bark");

        // We set the Fly interface polymorphically
        // This sets the behavior as a non-flying Animal

        flyingType = new CantFly();

    }

	/* BAD
	* You could override the fly method, but we are breaking
	* the rule that we need to abstract what is different to
	* the subclasses
	*
	public void fly(){

		System.out.println("I can't fly");

	}
	*/
}
