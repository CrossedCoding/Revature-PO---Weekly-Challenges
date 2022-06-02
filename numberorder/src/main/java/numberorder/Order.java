package numberorder;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using random for array size and values 
		Random random = new Random();

		int n = random.nextInt(50);

		int[] ascending = new int[n];

		System.out.println("Ascending: ");
		
		for (int i = 0; i < ascending.length; i++)

		{

			ascending[i] = random.nextInt(100);
			
			// Sort with Arrays.sorts()
			Arrays.sort(ascending);
			
		}
		
		// Printing the array in its own loop to prevent duplicates 
		
		for(int num : ascending) {
			
			System.out.print(num + " ");
			
		}

		System.out.println(" ");
		System.out.println("----------------------------------");
		System.out.println("Descending: ");
		
		// Simply copy the sorted array in reverse order for Descending
		
		int[] descending = new int[ascending.length];
		
		for(int i = descending.length - 1; i >= 0; i--) {
			
			descending[i] = ascending[i];
			
			System.out.print(descending[i] + " ");
			
		}
		
		// Or print out original array in reverse order after sorting 

		System.out.println("");
		System.out.println("----------------------------------");
		System.out.println("Original Array Descending: ");
		
		for(int i = ascending.length - 1; i >= 0; i--) {
			
			System.out.print(ascending[i] + " ");
			
		}
		
	}

}
