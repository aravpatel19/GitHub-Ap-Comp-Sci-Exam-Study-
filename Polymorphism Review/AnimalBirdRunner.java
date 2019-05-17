public class AnimalBirdRunner{
	public static void main(String[]args){

		Bird bird1 = new Bird(true, "Hawk");

		/*
		Bird bird = new Animal("Hawk");
		^will result in error.
		Bird is a subclass of the super class Animal
		*/

		Animal bird2 = new Bird(true, "Hawk");

		Animal animal = new Animal("Dog");

		System.out.println(bird1.getCanFly());
		System.out.println();

		/*
		System.out.println(bird2.getCanFly());
		because bird2 is of type Animal, it is
		unable to call methods in the Bird class
		unless the method is overwritten in
		the Bird Class.
		*/

		System.out.println(bird1.getName());
		System.out.println(bird2.getName());
		System.out.println(animal.getName());
		System.out.println();

		System.out.println(bird1);
		System.out.println();

		System.out.println(bird2);
		System.out.println();

		System.out.println(animal);
		System.out.println();
	}
}