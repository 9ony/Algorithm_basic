package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n=sc.nextInt();
		System.out.print(Arrays.toString(result(n)));
	}
	public static int[] result(int n) {
		String str = String.valueOf(n);
		int result[] = new int[str.length()];
		int j=0;
		for(int i=(str.length()-1);i>=0;i--) {
			result[j++] = str.charAt(i)-'0';
		}
		return result;
	}

}
