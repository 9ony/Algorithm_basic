package day05;

import java.util.Arrays;

public class SelectionSort {
	//선택정렬
	public static void selectSort(int[] arr) {
		int i=0;
		int min=0;
		int j=0;
		for(i = 0; i<arr.length;i++) {
			min=i;
			for(j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			int tmp=arr[min];
			arr[min]=arr[i];
			arr[i]=tmp;
		}
	}
	//선택정렬 내림차순
	public static void selectSortDesc(int[] arr) {
		int i=0;
		int max=0;
		int j=0;
		for(i = 0; i<arr.length;i++) {
			max=i;
			for(j=i+1;j<arr.length;j++) {
				if(arr[max]<arr[j]) {
					max=j;
				}
			}
			int tmp=arr[max];
			arr[max]=arr[i];
			arr[i]=tmp;
		}
	}
	public static void main(String[] args) {
		int arr[]= {6,5,13,7,1,9,3};
		selectSort(arr);
		System.out.println("---선택정렬후----------");
		System.out.println(Arrays.toString(arr));
		selectSortDesc(arr);
		System.out.println("---선택정렬후 내림차순----------");
		System.out.println(Arrays.toString(arr));
	}

}
