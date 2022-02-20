package hw11Q3Abstraction;

public  class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {
	public void maths() {

		System.out.println("Students can practice maths");
	}

	@Override
	public void aeronauticalInfo() {
	System.err.println("This method from AeronsuticalSchool");
	}

	@Override
	public void mechanicalLab() {
		System.out.println("This method from EngineeringSchool");
	}
}
