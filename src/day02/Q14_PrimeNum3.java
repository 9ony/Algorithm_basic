package day02;

public class Q14_PrimeNum3 {
		
		public static void getPrime() {
			int cnt=0;
			int[]prime = new int[1000];//소수저장
			int ptr=0;
			prime[ptr++]=2;
			prime[ptr++]=3;
			for(int num=5;num<=1000;num+=2) {//판별대상은 홀수만하도록 +=2
				boolean flag=false;
				for(int i=1;prime[i]<=Math.sqrt(num);i++) {
					cnt++;
					if(num%prime[i]==0) {
						flag=true;
						break;
					}
				}
				if(!flag) {
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