package day05;

import java.util.Arrays;

//정렬을 완료한 2개의 배열을 병합해보자
public class MergeArray {

	public static void main(String[] args) {
		int a[] = {2,4,6,8,11,13};
		int b[] = {1,2,3,5,9,12,15,21};
		int result[] = new int[a.length+b.length];
		System.out.println("a: "+Arrays.toString(a));
		System.out.println("b: "+Arrays.toString(b));
		System.out.println("c: "+Arrays.toString(result));
		
		merge(a,b,result);
		
		System.out.println("========a와b를 병합하여 result에저장했습니다");
		System.out.println("result: "+Arrays.toString(result));
	}
	public static void merge(int a[],int b[],int result[]) {
		int pa=0;
		int pb=0;
		int pr=0;
		//a에 저장된 값과 b에 저장된값을 비교해서 더작은쪽을 c에 저장한다. 그러면서 작은쪽의 포인터를 증가
//		while(pa<a.length&&pb<b.length) {
//			if(a[pa]<b[pb]) {
//				result[pr++]=a[pa++];
//			}else {
//				result[pr++]=b[pb++];
//			}
//		}
		//3항연산자로변경
		while(pa<a.length&&pb<b.length)
			result[pr++]=(a[pa]<b[pb])?a[pa++]:b[pb++];
		printProcess(a,b,result);
		//남아있는 요소가 있을수 있음
		while(pa<a.length) {
			result[pr++]=a[pa++];
		}
		while(pb<b.length) {
			result[pr++]=b[pb++];
		}
	}
	static public void printProcess(int[] a, int[] b, int[] c) {
		System.out.println("---------------------");
		System.out.println("a: "+Arrays.toString(a));
		System.out.println("b: "+Arrays.toString(b));
		System.out.println("c: "+Arrays.toString(c));
		System.out.println("---------------------");
	}
}
