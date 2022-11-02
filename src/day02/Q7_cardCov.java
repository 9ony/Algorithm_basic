package day02;
import java.util.*;
public class Q7_cardCov {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char arr[]=new char[32];
		System.out.println("음수가 아닌 정수를 입력: ");
		int n=sc.nextInt();
		System.out.print("몇진수로 변환할까요? (2~36):");
		int radix=sc.nextInt();
		printRadix(n,radix,arr);
	}
	public static void printRadix(int num,int r,char[] arr) {
		System.out.printf("%d를 %d진수로 변환 ",num,r);
		
		int i=conversion(num,r,arr);
//		System.out.println("!!!!:"+num);
		for(int k=0;k<i-1;k++) {
			System.out.print(arr[i-1-k]);
		}
		//arr에 저장된 값을 역으로 출력
	}
	public static int conversion(int num,int radix,char[] arr) {
		//기수 변환 (2진수 변환) radix=2
		String str="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int cnt=0;
		do {
			int mod=num%radix;
			arr[cnt++]=str.charAt(mod);
			num=num/radix;
			//num/=radix;
		}while(num!=0);
		
		return cnt;
	}

}
