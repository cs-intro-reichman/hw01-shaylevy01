/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		//Receives two integers and prints the result of their addition in a fancy way.
        	int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int result = a + b;
		System.out.println(a + " + " + b + " = " + (a + b));	
	}
}
