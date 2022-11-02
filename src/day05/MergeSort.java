package day05;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	static void merge(int[] a, int left, int right) {
		int tmp[]=new int[a.length];//임시 저장소
    	int index;
    	int pc=(left+right)/2;
    	int pl=left;//첫번째 배열방의 인덱스를  저장
    	int pr=pc+1;//두번째 배열방의 인덱스를  저장
    	index=left;
    	while(pl<=pc && pr<=right) {
    		tmp[index++]=a[pl]<a[pr] ? a[pl++]:a[pr++];
    	}
    	int i;
    	if(pl>pc) {
    		for(i=pr; i<=right;i++)
    			tmp[index++]=a[i];
    	}else {
    		//반대인 경우는 왼쪽에 있는 부분배열의 남은 값을 전부 복사
    		for(i=pl; i<=pc;i++)
    			tmp[index++]=a[i];
    	}
    	for(i=left;i<=right;i++)
    		a[i]=tmp[i];//원본배열에 임시배열값을 카피
	}//------------------------------------------


}
