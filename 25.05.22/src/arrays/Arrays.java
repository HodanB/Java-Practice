package arrays;

public class Arrays {
	public static void main(String[] args) {
//	Create an array that will hold 10 integer values, populate the array with values, then call and output each element
	int [] ages; 
	ages = new int []{0,1,2,3,4,5,6,7,8,9};
	for(int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
	}
	 
//Create a for loop that populates an integer array with values, outputting them at each iteration.
	 int [] pupil = new int [10];
	 for(int a = 0; a < pupil.length; a++) {
			System.out.println(pupil[a]*10);
	 
	}
	 

	}
	
}



