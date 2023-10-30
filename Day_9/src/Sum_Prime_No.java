
import java.util.Scanner;

public class Sum_Prime_No {
	
	public static boolean isPrime(int s) {
		if (s <= 1) {
			return false;
			}
		for (int i = 2; i < s; i++) {
			if (s % i == 0) {
				return false;
				}
			}
		return true;
		}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10]; 
		System.out.println("Enter The Element in Array:");
		
		for(int i=0 ; i<10; i++ ) {
			int arr = sc.nextInt();
			array[i]=arr;	
		}
		
		int primeSum = 0;
		
		for (int i : array) {
	           if (isPrime(i)) {
	               primeSum += i;
	           }
	       }
		 
	       System.out.println("Sum of prime numbers in the array: " + primeSum);
	}

}
	