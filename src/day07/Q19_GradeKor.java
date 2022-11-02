package day07;
import java.util.Arrays;
import java.util.Scanner;
public class Q19_GradeKor {
	public int[] getKorGrade(int n,int[] kor) {
		int grade[] = new int[n];
		for(int i=0;i<n;i++) {
			int cnt=1;
			for(int j=0;j<n;j++) {
				if(j==i) continue;
				if(kor[i]<kor[j]) cnt++;
			}
			grade[i]=cnt;
		}
		return grade;
	}
	public static void main(String[] args) {
		Q19_GradeKor app = new Q19_GradeKor();
		//학생수 입력받기
		//학생수 만큼 국어 성적 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력해 주세요");
		int n = sc.nextInt();
		int kor[] = new int[n];
		for(int i = 0; i<n;i++) {
			System.out.println((i+1)+"번째 학생의 국어 성적을 입력해주세요");
			kor[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(kor));
		System.out.println(Arrays.toString(app.getKorGrade(n,kor)));
	}
}
