import java.lang.reflect.Array;

public class Bubble {
	public static void main (String[] args){
		int nums [] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
		
		System.out.print("Unsorted array: ");
		display(nums);
		for (int a=0; a<Array.getLength(nums)-1; a++){
			for(int b = a+1; b<Array.getLength(nums); b++)
				if (nums[a] > nums[b]){
					int temp = nums[a];
					nums[a] = nums[b];
					nums[b] = temp;
				}
		}
		System.out.print("Sorted array: ");
		display(nums);
		
		//code from the book
		/*int a, b, t;
		int size = 10;
		
		System.out.print("Unsorted array: ");
		for (int i=0; i<Array.getLength(nums); i++)
			System.out.print(nums[i]+" ");
		System.out.println();
		
		for (a=1; a<size; a++){
			for (b=size-1; b>= a; b--){
				t = nums[b-1];
				nums[b-1]= nums[b];
				nums[b] = t;
			}
		}
		
		System.out.print("Unsorted array: ");
		for (int i=0; i<Array.getLength(nums); i++)
			System.out.print(nums[i]+" ");
		System.out.println();*/
	}
	
	static void display(int[] array){
		for (int i=0; i<Array.getLength(array); i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
}
