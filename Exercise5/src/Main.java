
//2.write a java program that prints all the prime number between 2 and 1000,inclusive. display 8 prime number per line
	
public class Main {
	public static void main(String[] args) {
			final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 8 per line
			int count = 0; // Count the number of prime numbers

			System.out.println(
				"The prime numbers between 2 and 1,000, inclusive are \n");

			// Repeatedly find prime numbers
			for (int n = 2; n <= 1000; n++) {
				// Assume the number is prime
				boolean isPrime = true;	// Is the current number prime?

				// Test whether number is prime
				for (int divisor = 2; divisor <= n / 2; divisor++) {
					if (n % divisor == 0)	{ // If true, number is not prime
						isPrime = false;	// Set isPrime to false
						break;	// Exit the for loop
					}
				}

				// Display the prime number and increase the count
				if (isPrime) {
					count++;	// Increase the count

					if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
						// Display the number and advance to the new line
						System.out.println(n);
					}
					else
						System.out.print(n + " ");
				}
			}
		}
		}
		


