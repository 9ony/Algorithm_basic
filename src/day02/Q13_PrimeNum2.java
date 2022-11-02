package day02;
/*알고리즘 개선 [교재 74p]
 * n이 2또는 3으로 나누어 떨어지지 않으면 2x2인 4 또는 2x3 인 6으로도 나눠 떨어지지 않는다.
 * 즉 정수 n이 소수인지 여부는 2부터 n-1까지 어떤 소수로도 나누어 떨어지지 않는다.
 * 예를 들어 7이 소수인지는 7보다 작은 소수 2,3,5로 나눗셈을 하면 충분하다
 * 이렇게 하면 계산 시간을 줄일 수 있다.
 * */

public class Q13_PrimeNum2 {
	
	public static void getPrime() {
		int cnt=0;
		int[]prime = new int[1000];//소수저장
		int ptr=0;
		prime[ptr++]=2;
		for(int num=3;num<=1000;num+=2) {//판별대상은 홀수만하도록 +=2
			int i;
			for(i=1;i<ptr;i++) {
				cnt++;
				if(num%prime[i]==0) {
					break;
				}
			}
			if(ptr==i) {
				prime[ptr++]=num;
			}
		}
		for(int i=0;i<ptr;i++) {
			System.out.println(prime[i]);
		}
		System.out.println("수행횟수: "+cnt);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPrime();
	}

}