package day05;

import java.util.Arrays;

public class Partition {

	public static void main(String[] args) {
		int arr[]= {1,8,7,4,5,2,6,3,9};
		partition(arr);
	}
	public static void partition(int arr[]) {
		int pl=0; //증가
		int pr=arr.length-1; //감소
		int pivot = arr[arr.length/2];
		do {
			while(arr[pl]<pivot) pl++;
			while(arr[pr]>pivot) pr--;
			if(pl<=pr) {
				swap(arr,pl,pr);
				pl++;
				pr--;
			}
			System.out.println("pivot값은: "+pivot+"입니다.");
		}while(pl<=pr);
		System.out.println("---------파티션 한 후 --------------");
		System.out.println(Arrays.toString(arr));
	}
	public static void swap(int[] arr,int i,int k) {
		int tmp=arr[i];
		arr[i]=arr[k];
		arr[k]=tmp;
	}
}
