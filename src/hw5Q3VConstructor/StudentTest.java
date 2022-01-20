package hw5Q3VConstructor;

public class StudentTest {
	public String stName; 
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	public  StudentTest(){
		System.out.println ("This is from default Constructor of Student class");
}
		public StudentTest(String stName, int stID, char sex,  boolean isProgrammer, float grade) {
	this.stName = stName;
	this.stID = stID;
	this. sex = sex;
	this.isProgrammer = isProgrammer; 
	this.grade = grade;
	
	System.out.println("stName:" + stName+ " \n stID: " + stID +"\n sex: " + sex +"\n isProgrammer:" + isProgrammer + "\n grade:" + grade+"\n "); 
		}	

	
	public static void main(String[] args) {
		StudentTest studenttest = new StudentTest ();
		StudentTest studenttest1 = new StudentTest ("Faid", 4041, 'm' , false, 3.933f);
		
		
		
	}

}