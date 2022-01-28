package hw6Q2IfElseCondition;

public class Voter01 {
	public static void main(String[] args) {
		int age = 18;

		if (age == 24) {
			System.out.println(" I am a voter ");
		} else if (age < 18) {
			System.out.println(" I am a voter ");
		} else if (age >= 18) {
			System.out.println(" I am not a voter ");
			System.out.println(" Plese add a valid age ");
		}
	}
}
