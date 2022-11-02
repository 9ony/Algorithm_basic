package day01;

import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("숫자두개를 입력하세요");
		int a=50;
		int b=100;
		int c=45;
		int d=79;
		int f=130;
//		int c=x.nextInt();
		System.out.printf("%d와%d중 큰수는?"+max2(a,b),a,b);
		System.out.printf("\n%d와%d와%d중 큰수는?"+max3(a,b,c),a,b,c);
		System.out.printf("\n%d와%d와%d와%d중 큰수는?"+max4(a,b,c,d),a,b,c,d);
		
		System.out.println();
		System.out.println(mid(a,b,c));
		System.out.println(mid5(a,b,c,d,f));
	}
	public static int max2(int a, int b) {
		int max=0;
		max = (a>b)?a:b;
		return max;
	}
	public static int max3(int a, int b,int c) {
		int max=a;
		max = (b>max)?b:max;
		max = (c>max)?c:max;
		return max;
	}
	public static int max4(int a, int b,int c,int d) {
		int max=a;
		max = (b>max)?b:max;
		max = (c>max)?c:max;
		max = (d>max)?d:max;
		return max;
	}
	public static int mid(int a,int b,int c) {
		int mid[] = {a,b,c};
		int item = mid.length;
		int count=0;
		for(int j=0; j<item; j++) {
			for(int i=0;i<item-1;i++) {
				int temp=0;
				if(mid[i]>mid[i+1]) {
					temp=mid[i+1];
					mid[i+1]=mid[i];
					mid[i]=temp;
				}
				count++;
			}
		}
//		System.out.println(item/2); 입력값이 홀수개수일때 중간인덱스
		for(int i=0;i<mid.length;i++) {
			System.out.print(mid[i]+" ");
		}
		System.out.println();
		System.out.println("반복횟수: "+count);
		return mid[item/2];
	}
	public static int mid2(int a,int b,int c) {
		int res =0;
		
		return res;
	}
	public static int mid5(int a,int b,int c,int d,int f) {
		int mid[] = {a,b,c,d,f};
		int item = mid.length;
		int count=0;
		for(int j=0; j<item; j++) {
			for(int i=0;i<item-1;i++) {
				int temp=0;
				if(mid[i]>mid[i+1]) {
					temp=mid[i+1];
					mid[i+1]=mid[i];
					mid[i]=temp;
				}
				count++;
			}
		}
		for(int i=0;i<mid.length;i++) {
			System.out.print(mid[i]+" ");
		}
		System.out.println();
		System.out.println("반복횟수: "+count);
		System.out.println(item/2);
		return mid[item/2];
	}
}
