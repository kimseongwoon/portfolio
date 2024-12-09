package ch07.sec10.exam02;

public class AbstractMethodExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();	// 멍멍
		Cat cat = new Cat();
		cat.sound();	// 야옹

		animalSound(new Dog());	// 멍멍
		animalSound(new Cat()); // 야옹	
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
