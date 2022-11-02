package day04;

import java.util.Scanner;

public class BinaryNum {
	public static void binaryNum(int num) {
		if(num<=0) return;
		binaryNum(num/2);
		System.out.print(num%2);
	}
	public static void radixNum(int num,int radix) {
		if(num<=0) return;
		radixNum(num/radix,radix);
		int mod=num%radix;
		String str="0123456789ABCDEF";
		System.out.print(str.charAt(mod));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int num=sc.nextInt();
		System.out.println("몇진수 할껀지 입력하세요: ");
		int radix=sc.nextInt();
		binaryNum(num);
		System.out.println();
		radixNum(num,radix);
	}

}
