package mymemo;

import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("숫자두개를 입력하세요");
		int a=x.nextInt();
		int b=x.nextInt();
		System.out.printf("%d와%d중 큰수는?"+max2(a,b),a,b);
	}
	public static int max2(int x, int y) {
		int result=0;
		int max = (x>y)?x:y;
		return result;
	}
	public static int max3(int x,int y,int z) {
		int result=0;
		return result;
	}

}
