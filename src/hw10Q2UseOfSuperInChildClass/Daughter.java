package hw10Q2UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super("Zavian Nubaid", 20, 'M', false);
		super.father();
		super.fatherInfo("Zavian", 20, 'M', false);
		super.age = 20;
		super.usCitizen = false;
		super.sex = 'M';
		System.out.println("Name: " + name + ", Age: " + age + ", Sex: " + " and UsCitizen " + usCitizen);
		System.out.println();
	}

	public Daughter(String birthMonth, int age) {
		super.father();
		super.fatherInfo("Zavian", 20, 'M', false);
		super.age = 20;
		super.usCitizen = false;
		super.sex = 'M';	
		System.out.println();

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("birthMonth: " + birthMonth + " , age: " + age);
	}

	public void daughter() {
		super.father();
		super.fatherInfo("Zavian", 20, 'M', false);
		super.age = 20;
		super.usCitizen = false;
		super.sex = 'M';
		System.out.println();
		System.out.println();
	}

	public void daughterInfo(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("birthMonth: " + birthMonth + " , age: " + age);

		super.father();
		super.fatherInfo("Zavian", 20, 'M', false);
		super.age = 20;
		super.usCitizen = false;
		super.sex = 'M';
		System.out.println("Name: " + name + ", Age: " + age + ", Sex: " + " and UsCitizen " + usCitizen);
	}
}
