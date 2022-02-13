package hw10Q2UseOfSuperInChildClass;

public class TestFamilyClass {

	public static void main(String[] args) {
		
		System.out.println("Default cnostructor initialized for Daughter class");
		Daughter daughter01 = new Daughter();
		
		System.out.println("---parameterized conostructor for Daughter class--");
		Daughter daughter02 = new Daughter("January" , 20);
		
		System.out.println("----void type initialized for Daughter Class-----");
		daughter02.daughter();
		
		System.out.println("----parameterized method initialized for daughter class--");
		daughter02.daughterInfo("March", 23);
		
		System.out.println("Default cnostructor initialized for Father class");
		Father father01 = new Father();
		
		System.out.println("--parameterized conostructor for Father class-");
		Father father02 = new Father("Zohan" , 21 , 'M' , false);
		
		System.out.println("--void type initialized for Father Class--");
		father02.father();
		
		System.out.println("---parameterized method initialized for Father class-");
		father02.fatherInfo("Zohan", 21, 'M' , false);
		
		
		
		

	}

}
