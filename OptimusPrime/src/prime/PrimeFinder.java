package prime;

import java.util.ArrayList;

public class PrimeFinder{
	public static void findPrime(int limit){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		for(int x = 1; x < limit; x++){
			if(x % 2 != 0 && x % 3 != 0 && x % 5 != 0 && x % 7 != 0){
				primes.add(x);
			}
		}
		printList(primes);
	}
	
	public static void printList(ArrayList<Integer> primes){
		for(int x = 0; x < primes.size(); x++){
			System.out.println(primes.get(x));
		}
	}

	public static void main(String[] args){
		PrimeFinder.findPrime(10000);
	}
}