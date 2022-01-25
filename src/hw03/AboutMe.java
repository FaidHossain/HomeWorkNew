package hw03;
public class AboutMe {
	public String myinfo;// This is declared variable
	public String name = ("Faid Hossain");
	public char gender = 'M';
	public double height = 5.6; // Here height 5.6 is initialize
	public float weight = 200f;
	public int zipcode = 20770;
	public short mortgage = 2000;
	public long phonenumber = 3012328903l;
	public boolean citizenship = true;
	public byte age = 75;

	public static void main(String[] args) {
		AboutMe aboutMe1 = new AboutMe();

		System.out.println("My name : " + "" + aboutMe1.name + "");
		System.out.println("My gender : " + "" + aboutMe1.gender + "");
		System.out.println("My height : " + "" + aboutMe1.height + "");
		System.out.println("My weight : " + "" + aboutMe1.weight + "");
		System.out.println("My zipcode : " + "" + aboutMe1.zipcode + "");
		System.out.println("My mortgage : " + "" + aboutMe1.mortgage + "");
		System.out.println("My phonenumber : " + "" + aboutMe1.phonenumber + "");
		System.out.println("My citizenship : " + "" + aboutMe1.citizenship + "");
		System.out.println("My age : " + "" + aboutMe1.age + "");
	}
	}