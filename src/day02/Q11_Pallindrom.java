package day02;

import java.util.Locale;
import java.util.Scanner;

public class Q11_Pallindrom {
	public String isPallindrome(String str) {
		String res="";
		str=str.toUpperCase(Locale.ROOT);
		int a =str.length();
		for(int i=0;i<a/2;i++) {
			if(str.charAt(i)!=str.charAt(a-i-1)) {
				return res="Pallindrom No~";
			}
			
		}
		res="Pallindrom Ok~";
		return res;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		String str=sc.next();
		Q11_Pallindrom app = new Q11_Pallindrom();
		System.out.println(app.isPallindrome(str));
	}

}
