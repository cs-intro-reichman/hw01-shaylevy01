/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		//Receives a range, generates three random numbers in it and prints them.
        	int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int randnum1 = (int) ((Math.random() * (b - a)) + a);
		int randnum2 = (int) ((Math.random() * (b - a)) + a);
		int randnum3 = (int) ((Math.random() * (b - a)) + a);
		System.out.println(randnum1);
		System.out.println(randnum2);
		System.out.println(randnum3);
		//Find the minimum number and prints it.
		int min = Math.min(randnum1 , randnum2);
		int minimum = Math.min(randnum3 , min);
		System.out.println("The minimal generated number was " + minimum);	
	}
}
