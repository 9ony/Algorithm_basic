package day07;

import java.util.Scanner;

public class Q20_ArrMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	Q20_ArrMaxSum s = new Q20_ArrMaxSum();
	    Scanner sc = new Scanner(System.in);
	    System.out.println("N*N   /   N의 수 입력 : ");
	    int n = sc.nextInt();
	    int[][] arr = new int[n][n];
	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < n; j++) {  
	        arr[i][j] = (int)(Math.random() * 101 + 1);
	        System.out.print(arr[i][j]+"\t");
	      }
	      System.out.println();
	    }
	    System.out.println(s.max(arr, n));
	}
	public int max(int arr[][],int n) {
		int max=0;
	    int sumX, sumY, sumD1, sumD2;
	    for (int i = 0; i < n; i++) {
	      sumX = sumY = 0;
	      for (int j = 0; j < n; j++) {
	        sumX += arr[i][j];
	        sumY += arr[j][i];
	      }
	      if(max<sumX || max<sumY) max = (sumX>=sumY)?sumX:sumY; 
	    }
	    sumD1 = sumD2 = 0;
	    for (int i = 0; i < n; i++) {
	      sumD1 += arr[i][i]; 
	      sumD2 += arr[i][n - i - 1];
	    }
	    if(max<sumD1 || max<sumD2) max = (sumD1>=sumD2)?sumD1:sumD2;
		return max;
	}
}
