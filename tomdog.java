package dog.com.it;

public class TestDog {
	public static void main(String[]args) {
		//create object here
		Dog Dog1 = new Dog();
		Dog Dog2 = new Dog();
		Dog Dog3 = new Dog();
		
		//Data input for Dog object1
		Dog1.breed = "Bulldog";
		Dog1.size = "larg";
		Dog1.color = "light gray";
		Dog1.age = 5;
		
		//Data input for Dog object2
		Dog2.breed = "beagle";
		Dog2.size = "larg";
		Dog2.color = "orange";
		Dog2.age = 6;
		
		//Data input for Dog object3
		Dog3.breed = "German";
		Dog3.size = "larg";
		Dog3.color = "white and orange";
		Dog3.age = 6;
		
		//print all data from object1
		System.out.println("Dog Object 1:\n Breed: " + Dog1.breed +"\n Size: " + Dog1.size + "\n Color: " + Dog1.color + "\n Age: " + Dog1.age);
		//System.out.println("Dog Object 1:\n Size: " + Dog1.size);
		//System.out.println("Dog Object 1:\n Color: " + Dog1.color);
		//System.out.println("Dog Object 1:\n Age: " + Dog1.age);
		
		//print all data from object2
		System.out.println("Dog Object 2:\n Breed: " + Dog2.breed +"\n Size: " + Dog2.size + "\n Color: " + Dog2.color + "\n Age: " + Dog2.age);
		//System.out.println("Dog Object 2:\n Size: " + Dog2.size);
		//System.out.println("Dog Object 2:\n Color: " + Dog2.color);
		//System.out.println("Dog Object 2:\n Age: " + Dog2.age);
		
		//print all data from object3
		System.out.println("Dog Object 3:\n Breed: " + Dog3.breed +"\n Size: " + Dog3.size + "\n Color: " + Dog3.color + "\n Age: " + Dog3.age);
		//System.out.println("Dog Object 3:\n Size: " + Dog3.size);
		//System.out.println("Dog Object 3:\n Color: " + Dog3.color);
		//System.out.println("Dog Object 3:\n Age: " + Dog3.age);
		
	}
}
===============
package dog.com.it;

public class Dog {
	//instance variable
	String breed;
	String size;
	String color;
	int age;
}