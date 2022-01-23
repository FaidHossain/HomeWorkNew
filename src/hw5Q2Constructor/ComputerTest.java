package hw5Q2Constructor;

public class ComputerTest {
	public String brand;
	public String model;
	public String operatingsystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public ComputerTest(){
	}
	public ComputerTest(String brand, String model, String operatingsystem, int price,  char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingsystem = operatingsystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
	
		System.out.println("MyBrand : " + brand + ",  Model Name: " + model + ", Operatingsystem Name: " + operatingsystem + ", Price: $"+ price
				+ ", Grade: " + grade + ", MadeInUSA: " + madeInUSA+"");
	}
	public static void main(String[] args) {
		ComputerTest computertest = new ComputerTest();
		ComputerTest computertest1 = new ComputerTest("Apple", "MacBook Air", "MacOS Mojave", 800, 'A', false);
		ComputerTest computertest2 = new ComputerTest ("Hp ", "ENVYx360 ", "Window ", 700, 'A', false);

	}
	}

