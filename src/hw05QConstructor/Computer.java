package hw05QConstructor;

public class Computer {
	public String Brand;
	public String Model;
	public String Os;
	public short Price;
	public boolean MadeInUSA;
	public char Grade;

	public Computer(){ 
System.out.println();	
}
	public Computer(String Brand){
	this.Brand = Brand;
	
System.out.println("Computer name: "+ Brand+ "");
}

	public static void main(String[] args) {

	}

}
