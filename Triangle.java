/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		//Receives three numbers, checks if they can form a triangle and prints the result.
        	int tside1 = Integer.parseInt(args[0]);
		int tside2 = Integer.parseInt(args[1]);
		int tside3 = Integer.parseInt(args[2]);
		if ((tside1 + tside2 > tside3) && (tside1 + tside3 > tside2) && (tside2 + tside3 > tside1)) {
			System.out.println(tside1 + ", " + tside2 + ", " + tside3 + ": true");
		}
		else {
			System.out.println(tside1 + ", " + tside2 + ", " + tside3 + ": false");
		}	
	}
}
