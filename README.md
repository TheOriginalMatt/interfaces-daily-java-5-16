# Interfaces
## Daily Java Project for: 5/13/2020

### Description:

A super simple Interface class 

### Daily Java Projects
I'm creating a small Java project each day to help me learn Java. These aren't rigorously tested, but instead exist just so I can get a better understanding of some portion of Java.

### Points of Interest
 + Java's class hierarcy is a lot more complex than I expected, this made designing the interface to be implemented for both `String` and `int` objects more difficult than expected
 + I wish there was a simpler way to override methods in interfaces. Currently if I want a method to accept an `int` in one implementation and a `String` in another, they have to both accept an `Object` and I have to manually throw an error if the user does anything illegal.
 + After looking at some of the interfaces created by Oracle, I think I've over estimated the power of the interface. While it can help direct any developers, each method added limits any implementation, so you can only specify the most bare bones requirements to keep from writing the class yourself

### Compiling

There is a build file using ant, which can be run by `$ant` and running `Parent.class` in `/build`, or you can go into `./src` and compile it by hand

### Using `SimpleObj`
Example - Using implementations for `String` objects and for `int` objects, and comaparing them

```
public class Parent {
	public static void main(String args[]) {
		MySimpleIntObject intObj1 = new MySimpleIntObject();
		MySimpleIntObject intObj2 = new MySimpleIntObject();

		MySimpleStrObject strObj1 = new MySimpleStrObject();
		MySimpleStrObject strObj2 = new MySimpleStrObject();

		intObj1.setObj(15);
		strObj1.setObj("15");

		intObj2.setObj(15);
		strObj2.setObj("15");

		System.out.println(intObj1);
		System.out.println(strObj1);		

		System.out.println(intObj1.equals(intObj2));
		System.out.println(strObj1.equals(strObj2));

		System.out.println(intObj1.equals(strObj1));
		System.out.println(strObj1.equals(intObj2));

		intObj2.setObj("25");

		System.out.println(intObj1.equals(intObj2));
	}
}

```

### Documentation

No more handwritten documentation for me!

[SimpleObj](https://theoriginalmatt.github.io/interfaces-daily-java-5-16/SimpleObj.html)