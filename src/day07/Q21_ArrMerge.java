package day07;

import java.util.Arrays;
import java.util.Scanner;

public class Q21_ArrMerge {

	public int[] merge(int []a,int []b) {
		int sum[] = new int[a.length+b.length];
		for(int i=0;i<a.length+b.length;i++) {
			sum[i] = (i<a.length)?a[i]:b[i-a.length];
		}
		Arrays.sort(sum);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q21_ArrMerge app = new Q21_ArrMerge();
		Scanner sc=new Scanner(System.in);
		int a[],b[];
		System.out.println("배열 1의 크기: ");
		int n = sc.nextInt();
		a=new int[n];
		System.out.println("배열 2의 크기: ");
		int m = sc.nextInt();
		b=new int[m];
		System.out.println("배열 1의 값: ");
		for(int i=0; i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("배열 2의 값: ");
		for(int i=0; i<m;i++) {
			b[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(app.merge(a,b)));
	}

}
