package hw5Q2Constructor;

public class StudentTest {
	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	public StudentTest() {
		System.out.println("This is from default Constructor of Student class");
	}
	public StudentTest(String stName, int stID, char sex, boolean isProgrammer, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;

		System.out.println("stName:" + stName + ", stID: " + stID + ", sex: " + sex + ", isProgrammer:" + isProgrammer
				+ ", grade:" + grade + " ");
	}
	public static void main(String[] args) {
		StudentTest studenttest = new StudentTest();// Initialized constructor.
		StudentTest studenttest1 = new StudentTest("Faid", 4041, 'M', false, 3.933f);
		StudentTest studentTest2 = new StudentTest("Zohan", 2213, 'M', false, 1.991f);

	}

}