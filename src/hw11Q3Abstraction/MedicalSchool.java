package hw11Q3Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	public MedicalSchool() {
		System.out.println();
	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("medical School where medical students studies");
	}

	public static void medicalSchool() {
		System.out.println();
	}
}
