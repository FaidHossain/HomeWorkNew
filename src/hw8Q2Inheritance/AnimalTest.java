package hw8Q2Inheritance;

public class AnimalTest {

	public static void main (String[]args) {
		Animal animal= new Animal();
		animal.animalInfo();
		
		
	System.out.println("\n---------------------\n");
	Mammal mammal= new Mammal();
	mammal.mammalInfo();
	mammal.animalInfo();
	
	System.out.println("\n------------------------\n");
	Reptile reptile= new Reptile();
	reptile.reptileInfo();
	reptile.animalInfo();
	
	System.out.println("\n------------------------\n");
	Birds birds=new Birds();
	birds.birdsInfo();
	birds.animalInfo();
	-	
	System.out.println("\n--------------------\n");
	Dog dog= new Dog();
	dog.dogInfo();
	
	System.out.println("\n------------------\n");
	Snake snake=new Snake();
	snake.snakelInfo();
	snake.animalInfo();
	

	System.out.println("\n---------------------\n");
	Robin robin= new Robin();
	robin.robinlInfo();
	robin.animalInfo();
	
	
	System.out.println("\n---------------------\n");
	BullDog bullDog = new BullDog();
	bullDog.bullDogInfo();
	
	System.out.println("\n--------------------\n");
	Cobra cobra= new Cobra();
	cobra.cobraInfo();
	
	
// Now extends BullDog, Cobra, and Robin class to their parents class and shows their hierarchy till Animal Class, for example: bulldog -- dog, -- mammal --Animal, Cobra -- snake,--reptile--Animal, Robin -- Bird ,-- Animal etc. We know, An object Can call other methods if the class is extended, if yes, show all the possible calls. Use Java comments to show single inheritance, multilevel inheritance, Hierarchical inheritance by example form the above. Also, show by java comments who is Parent class and who is child class for at least one class. Organize the code. Push the code in Github. Paste your github link below.
	
	}
}