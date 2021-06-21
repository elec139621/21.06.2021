package proj4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat mitzzi = new Cat("mitzzi", 24.2f, 1, false);
		Dog rex = new Dog("rex", 33.6f, 2, true);
		
		System.out.println(mitzzi);
		System.out.println(rex);
		
		//printCatName(mitzzi);
		//printDogName(rex);
		//new Animal
		//Animal wolfy = new Dog("rex", 24.88f, 4, true);
		printAnimalName(mitzzi);
		printAnimalName(rex);
		
		Animal[] pets = new Animal[3];
		pets[0] = new Cat("mitzzi", 24.2f, 1, false);
		pets[1] = new Cat("miau", 24.2f, 1, false);
		pets[2] = new Dog("rex", 33.6f, 2, true);
		
		
		// create another animal class Horse
		// will have another fields called m_racing_horse boolean
		// horse extends animal
		// create a horse instance
		// call printAnimalName with the horse
		//   -- check if cat if so cast to cat and print is siami
		//   -- check if horse if so print if racing horse
		//   -- add the horse to the array above
		
		// add abstract method in Animal
		// jump
		// implement with override these method in all animals
		// create in Main animalJump(Animal a)
		//    a.jump();
		
		// create interface  
		Piano p = new Piano();
		sounder(p);
	}
	
	public static void sounder(ISoudner a_sounder) {
		a_sounder.make_sound();
	}
	
	public static void jump(IJump jumper) {
		jumper.jump();
	}
	
	public static void printAnimalName(Animal a) {
		System.out.println("".format("Animal name is %s", a.getM_name()));
		if (a instanceof Dog ) {
			System.out.println("this is a dog .....");
			//a.isM_is_guard()
			Dog _dogg2 = (Dog)a; // casting
			System.out.println("".format("this is a guard dog? %b", _dogg2.isM_is_guard()));
		}
		else if (a instanceof Cat) {
			System.out.println("this is a cat....");
		}
		
		a.make_sound();
	}

//	public static void printDogName(Dog d) {
//		System.out.println("".format("Dog name is %s", d.getM_name()));
//	}
//	
//	public static void printCatName(Cat c) {
//		System.out.println("".format("Cat name is %s", c.getM_name()));
//	}	
	
}
