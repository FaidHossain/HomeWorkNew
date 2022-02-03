package hw5Q2Constructor;

public class Student {
	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	public Student() {
		System.out.println("This is from default Constructor of Student class");
	}
	public Student(String stName, int stID, char sex, boolean isProgrammer, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;

		System.out.println("stName: " + stName + ",stID: "  + stID +  ", sex: " + sex + ", Java Programmer? Ans: " + isProgrammer
				+ ", grade: " + grade + "");
	}
	}
