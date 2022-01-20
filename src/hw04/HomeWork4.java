package hw04;


public class HomeWork4 { 
	public String myinfo;
	public String name = (" Faid Hossain");
	public char gender = 'm';
	public double heights = 3.4;
	public float weight = 199f;
	public long password = 2022l;
	public int zipcode = 20710;
	public short carpayment = 900;
	public boolean resident = false;
	public byte age = 45;

	public static void main(String[] args) {
		HomeWork4 homeWork = new HomeWork4();

		System.out.println("My Name: " + homeWork.name + ", My Hights: " + homeWork.heights + ", My Age: "
				+ homeWork.age + ", My carpayment $ " + homeWork.carpayment + ", My weight:" + homeWork.weight);

	}

}
