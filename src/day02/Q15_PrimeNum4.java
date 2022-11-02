package day02;
//1.반복문 돌면서 2~1000까지의 값을 prime에 저장

//2. 2부터 시작해서 특정 수의 배수에 해당하는 수를 모두 지운다==>0을 넣는다
//   지울 때 자기자신은 지우지 않고, 이미 지워진 수는 건너뛴다

//3. 2부터시작해서 배열에 남아있는 수를 모두 출력한다(단, 0값은 제외하고 출력)

public class Q15_PrimeNum4 {
	public static void getPrime() {
		int [] prime=new int[1001];
		int cnt=0;
		prime[0] = prime[1] = 0;

        for(int i = 2; i <prime.length; i++) {
        	prime[i] = i;
        }

        for(int i = 2; i < prime.length;i++){
            if(prime[i] == 0) continue; 
            for(int j = 2*i; j <prime.length; j+=i) {
            	cnt++;
            	prime[j] = 0;
            }
        }
        for(int i = 0; i <prime.length; i++){
            if (prime[i] != 0) {
            	System.out.println(prime[i]);
            }
        };
        System.out.println(cnt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPrime();
	}

}
