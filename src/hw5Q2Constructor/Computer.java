package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingsystem;
	public int price;
	public char grade;
	public boolean madeINUSA;
	// here default constructor declared
	public Computer() {
		System.out.println("This is from default Constructor of Computer class");
	}
	public Computer(String brand, String model, String operatingsystem, int price, char grade, boolean madeINUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingsystem = operatingsystem;
		this.price = price;
		this.grade = grade;
		this.madeINUSA = madeINUSA;

		System.out.println("Brand: " + brand + ", Model: " + model + ", Operatingsystem: " + operatingsystem + ",Price:$ "
				+ price + ",Grade: " + grade + ", MadeINUSA: " + madeINUSA + "");
	}
	}
