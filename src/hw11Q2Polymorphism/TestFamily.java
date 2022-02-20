package hw11Q2Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("\n........................sister class...................\n");
		Sister sister = new Sister();
		sister.sister(25, 29);
		sister.sister(30, 31, 35);
		sister.sister(35, 36, "40");
		sister.sister(22, 26, 31, 36);
		Sister.sister(22, "30", "41");
		Sister.sister(32, 33, 34, "39");

		System.out.println("\n................Niece class............\n");
		Sister niece = new Sister();

		niece.sister(18, 25);
		niece.sister(24, 26, 27);
		niece.sister(41, 42, "43");
		
	}

}
