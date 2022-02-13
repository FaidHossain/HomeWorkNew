package hw10Q2UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println();
	}

	public Father(String name, int age, char sex, boolean usCitizen) {

		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println("Name: " + name + ", Age: " + age + ", Sex: " + " and UsCitizen " + usCitizen);
	}

	public void father() {
		System.out.println();
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println("Name: " + name + ", Age: " + age + ", Sex: " + " and UsCitizen " + usCitizen);
	}

}
