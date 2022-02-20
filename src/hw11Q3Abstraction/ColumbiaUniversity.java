package hw11Q3Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	public ColumbiaUniversity() {

	}

	public void biology() {
		System.out.println("This method from ColumbiaUniversity Class ");
	}

	@Override
	public void commonRoom() {
		System.err.println("This Method from Collage Interface ");

	}

	@Override
	public void laboratory() {

		System.err.println("This Method from Collage Interface");
	}

	@Override
	public void languageClub() {

		System.out.println("This Method from Collage Interface");
	}

	@Override
	public void dorm() {
		System.out.println("This Method from Collage Interface");

	}

	@Override
	public void emergencyRoom() {

		System.out.println("This method from  RockefflerUniversity class");

	}

	@Override
	public void cafeteria() {
		System.err.println("This method from Hospital Interface");

	}

	@Override
	public void morgue() {
		System.out.println("This method from Hospital Interface");

	}

	@Override
	public void lawInfo() {
		System.err.println("This method from LawSchool Interface");
	}

	@Override
	public void vocationalInfo() {
		System.err.println("This method from VocationalSchool Interface");

	}

	@Override
	public void classSize() {
		System.out.println("This Method from Unoversity Interface");

	}

	@Override
	public void playGround() {
		System.out.println("This method from University Interface");

	}

	@Override
	public void teacher() {
		System.out.println("This method from University Interface");
	}

	@Override
	public void gymnasium() {
		System.out.println("This method from University Interface");

	}

	@Override
	public void anatomyLab() {
		System.out.println("This method from MedicalSchool Abastrct class");

	}

	@Override
	public void hygiene() {
		System.out.println("This method from NursingSchool Abastract class");
	}

	@Override
	public void sugeryRoom() {
		System.out.println("this method from Hospital Interface");

	}

}
