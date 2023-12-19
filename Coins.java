/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		//Receives a number of cents and prints the representation of them in quarters and cents using as many quarters as possible.
        	int cents = Integer.parseInt(args[0]);
		int quarter = cents / 25;
		int remnants = cents % 25;
		System.out.println("Use " + quarter + " quarters and " + remnants + " cents");
	}
}
