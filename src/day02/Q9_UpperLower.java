package day02;

import java.util.Scanner;

public class Q9_UpperLower {
	public String change(String str) {
		String res="";
		
		int a;
		for(int i=0;i<str.length();i++) {
			a=(int)str.charAt(i);
		if((65<=a)&&(a<=90)) {
			res +=(char)(a+32);
		}else if((97<=a)&&(a<=122)) {
			res +=(char)(a-32);
		}else {
			res +=(char)a;
		}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("알파벳을 문자열을 입력하세요");
		String str=sc.next();
	}

}
