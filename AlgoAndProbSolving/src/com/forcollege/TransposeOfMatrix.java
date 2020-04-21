package com.forcollege;

import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String args[]){
		int i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int column = sc.nextInt();
		int matrix[][] = new int[row][column];
		System.out.println("Enter matrix:");
		for(i = 0; i < row; i++){
			
			for(j = 0; j < column; j++){
				
				matrix[i][j] = sc.nextInt();
				System.out.print(" ");
			}
		}
		System.out.println("The Input Matrix is ");
		for(i = 0; i < row; i++){
			for(j = 0; j < column; j++){
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}


	
		System.out.println("The above matrix after Transpose is ");
		for(i = 0; i < column; i++){
			for(j = 0; j < row; j++){
				System.out.print(matrix[j][i]+" ");
			}
				System.out.println(" ");
			}
		}
}
