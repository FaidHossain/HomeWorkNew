package hw5Q3Constructor;

public class Student {
	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	public Student() {
		System.err.println();
	}
	public Student(String stName, int stID, char sex, boolean isProgrammer, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;

		System.err.println("stName: " + stName + "stID: " + stID + "sex: " + sex + "isProgrammer: " + isProgrammer
				+ "grade: " + grade + "");
	}

}