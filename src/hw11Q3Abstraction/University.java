package hw11Q3Abstraction;

import hw9Q3Abstraction.Collage;

public interface University extends Collage, Hospital {

	public void classSize();

	public void playGround();

	public void teacher();

	public void gymnasium();

	public static void library() {
		System.out.println();
		
		}
	public default void university() {
		
	}

}
