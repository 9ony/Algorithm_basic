package day04;

import java.util.Scanner;

public class Fibonacci {
	public static void fibo(int n) {//n은 항
		int j=1;
		int temp=0;
		for(int i = 0; i<n; i++) {
			j+=temp;
			System.out.print(j+" ");
			temp=j-temp;
			
		}
	}
	public static int fibo2(int n) {
		if(n==1) return 1;
		if(n==2) return 1;
		return fibo2(n-1)+fibo2(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int n = sc.nextInt();
		fibo(n);
		System.out.println();
		System.out.println(fibo2(n));
	}

}
