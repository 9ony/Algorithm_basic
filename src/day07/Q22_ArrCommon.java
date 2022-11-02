package day07;

import java.util.Arrays;
import java.util.Scanner;

public class Q22_ArrCommon {
	//조건 : 배열에 중복값 없음
	public int[] common(int[]a,int[]b) {
		int cnt=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<b.length;j++) {
				if(a[i]==b[j]) {
					a[cnt]=a[i];
					//a배열을 temp대신 활용 어차피 전 인덱스로 돌아갈일X
					cnt++;
				}
			}
		}
		int result[] = new int[cnt];
		for(int i=0;i<cnt;i++) {
			result[i]=a[i];
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q22_ArrCommon app = new Q22_ArrCommon();
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
		
		System.out.println(Arrays.toString(app.common(a,b)));
	}

}
