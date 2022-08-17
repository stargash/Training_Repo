package com.main;

public class DistanceMain {

	public static void main(String[] args) {

	
		
		int[] distanceArray = { 50, 200, 100 };
		int max = distanceArray[0];
		for (int d = 0; d < distanceArray.length; d++){
			if (distanceArray[d] > max)
				max = distanceArray[d];

		}
		System.out.println("Longest distance: " + max);

		int[] hikeArray = { 55, 15, 155 };
	    
		distanceArray =  hikeArray;
		int high = hikeArray[0];
		for ( int h = 0; h < hikeArray.length; h++) 
			
			 high = hikeArray[h]+100;
		
		
		System.out.println("Person's hike is: "+high);
	}
	}



