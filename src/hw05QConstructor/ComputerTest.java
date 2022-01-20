package hw05QConstructor;
public class ComputerTest {
	public String Brand;
	public String Model;
	public String Os;
	public int Price;
	public boolean MadeInUSA;
	public char Grade;

	public ComputerTest(){ 
	System.out.println();	
	}
	public ComputerTest (String Brand, String Model, String Os, int Price, boolean MadeInUSA, char Grade ){
		this.Brand = Brand;
		this.Model = Model;
		this.Os = Os;
		this.Price = Price;
		this.MadeInUSA = MadeInUSA;
		this.Grade = Grade;
		
		
	System.out.println("Brand Name: "+ Brand+ ",  Model Name: "+ Model+ ", Os Name: " + Os+ ", Price: " + Price+ ", MadeInUSA: "+ MadeInUSA+ ",Grade: "+ Grade+"");

	
	}
	
	public static void main(String[] args){
		ComputerTest computertest = new ComputerTest();
		ComputerTest computertest1 = new ComputerTest("Apple", "MacBook Air", "MacOS Mojave", 800, false, 'A');
		
			
	}

}
