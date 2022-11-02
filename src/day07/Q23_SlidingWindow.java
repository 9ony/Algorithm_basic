package day07;

import java.util.Scanner;

public class Q23_SlidingWindow {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("몇일의 매출기록을 입력하실래요?");
		int n=sc.nextInt();
		System.out.println("연속 몇일의 매출을 구할까요??");
		int k=sc.nextInt();
		System.out.printf("%d일간의 매출 기록을 입력하세요\n",n);
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int max=getMaxOut(n,k,a);
		System.out.printf("연속 %d일간의 최대 매출액 %d\n",k,max);
	}

	private static int getMaxOut(int n, int k, int[] a) {
		// TODO Auto-generated method stub

		int max=0;
		for(int i=0;i<=n-k;i++) {
			int sum=0;
			for(int j=i;j<i+k;j++) {
				sum+=a[j];
			}
			max = (max>sum)?max:sum;
		}
		return max;
	}

}
