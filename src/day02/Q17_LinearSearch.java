package day02;

import java.util.Scanner;

public class Q17_LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("배열 크기 입력: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("저장할 값을 입력하세요:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("검색할 값 입력:");
		int key=sc.nextInt();
		
		int idx=searchSentinel(arr,n,key);
		//             배열,크기,검색값
		//검색한 값이 없다면 -1을 반환 있으면 해당 인덱스 번호 반환
		System.out.println((idx<0)?key+"값은 배열에 없어요":key+"값은 배열 인덱스"+idx+"에 있어요");
	}
	public static int searchSentinel(int[] arr,int n,int key) { //보초법
		
		return 1;
	}
	
	public static int search(int[] arr,int n,int key) {
		int idx=-1;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==key) {idx=i; break;}
			}
		return idx;
	}

}
