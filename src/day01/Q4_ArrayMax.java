package day01;

import java.util.Scanner;

public class Q4_ArrayMax {

	public static int[] max_min(int []arr){
		int m[]=new int[2];
		int p=arr.length; //사람수
		for(int j=0; j<p; j++) {//작은키부터 큰키까지 정렬
			for(int i=0;i<p-1;i++) {
				int temp=0;
				if(arr[i]>arr[i+1]) {
					temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
			}
		}
//		for(int i=0;i<p;i++) {//인원수의 키출력 임시
//			System.out.print(arr[i]+" ");
//		}
		m[0]=arr[0]; //작은키
		m[1]=arr[p-1]; //큰키
		return m;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("인원수를 입력하세요 [키의 최대.최소 구합니다]: ");
		int num=sc.nextInt();
		int height[]=new int[num];
		//반복문 돌면서 height에 랜덤한 키를 저장하기(100~190)
		for(int i=0;i<num;i++) {
			height[i]=(int)(Math.random()*90)+100;
		}
		int m[]=max_min(height);
		System.out.println();
		System.out.println("제일 큰키: "+m[1]);
		System.out.println("제일 작은 키: "+m[0]);
	}
}
