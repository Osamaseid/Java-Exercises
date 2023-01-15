
//1.write a java program that finds the smallest integer n such taht n^2 is grater than 9999.

		
public class Main {

public static void main(String[] args) {

		    int n = 0;

		    while (Math.pow(n, 2) < 9999) {
		        n++;
		    }

		    System.out.println(n + " is the lowest number, such that n^2 is greater than 9999");
		    System.out.println("Proof: " + (n - 1) + "^2 = " + Math.pow(n - 1, 2));
		    System.out.println("Proof: " + n + "^2 = " + Math.pow(n, 2));

		}
		}
		
