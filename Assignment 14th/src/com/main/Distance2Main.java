package com.main;

public class Distance2Main {
	public static int main(String[] args) {
		int[] distanceArray = { 50, 100, 150 };
		int max = distanceArray[0];
		for (int d = 0; d < distanceArray.length; d++) {
			if (distanceArray[d] > max)
				max = distanceArray[d];
		}
		System.out.println("Longest distance: " + distanceArray.length);
		return max;
	}
}

