package com.forcollege;

//Given an area of N X M. You have infinite number of tiles of size 2i X 2i, where i = 0, 1, 2,… so on. The task is to find minimum number of tiles required to fill the given area with tiles.
//https://www.geeksforgeeks.org/minimum-tiles-of-sizes-in-powers-of-two-to-cover-whole-area/
public class FindMinTiles {

	static int minTiles(int n, int m) {
		// base case, when area is 0.
		if (n == 0 || m == 0)
			return 0;

		// If n and m both are even,
		// calculate tiles for n/2 x m/2
		// Halving both dimensions doesn't
		// change the number of tiles
		else if (n % 2 == 0 && m % 2 == 0)
			return minTiles(n / 2, m / 2);

		// If n is even and m is odd
		// Use a row of 1x1 tiles
		else if (n % 2 == 0 && m % 2 == 1)
			return (n + minTiles(n / 2, m / 2));

		// If n is odd and m is even
		// Use a column of 1x1 tiles
		else if (n % 2 == 1 && m % 2 == 0)
			return (m + minTiles(n / 2, m / 2));

		// If n and m are odd
		// add row + column number of tiles
		else
			return (n + m - 1 + minTiles(n / 2, m / 2));
	}

	// Driver code
	public static void main(String[] args) {
		int n = 5, m = 6;
		System.out.println(minTiles(n, m));
	}
}