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
		ArrayList<Integer> newList = removeDuplicates(primes);
		
		for(int x = 0; x < newList.size(); x++){
			System.out.println(newList.get(x));
		}
	}
	
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list){
		ArrayList<T> newList = new ArrayList<T>();
		
		for(T element : list){
            if(!newList.contains(element)){
                newList.add(element);
            }
        }
        return newList;
    }

	public static void main(String[] args){
		PrimeFinder.findPrime(10000);
	}
}