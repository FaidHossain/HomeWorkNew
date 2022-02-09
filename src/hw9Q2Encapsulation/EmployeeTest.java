package hw9Q2Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Zohan Nawal");
		employee.setAge(25);
		employee.setSex('M');
		employee.setUsCitizen(true);

		System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge() + ", Sex: "
				+ employee.getSex() + " and UsCitizen: " + employee.isUsCitizen());
	}
}
