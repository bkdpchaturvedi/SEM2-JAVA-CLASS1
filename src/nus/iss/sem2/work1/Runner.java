/**
 * 
 */
package nus.iss.sem2.work1;

/**
 * @author student Chaturvedi
 *
 */
public class Runner {

	public void PrintMessage() {
		System.out.println("Welcome to my first Program");
		System.out.println(intvariable);
		System.out.println(shortvariable);
		System.out.println(longvariable);
		System.out.println(bytevariable);
		System.out.println(floatvariable);
		System.out.println(doublevariable);
		System.out.println(boolvariable);
	}
	int intvariable =20;
	short shortvariable = 20;
	long longvariable=20L;
	byte bytevariable=20;
	float floatvariable=0.56565f;
	double doublevariable=3456.1232d;
	boolean boolvariable=true;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner run=new Runner();
		run.PrintMessage();
	}

}
