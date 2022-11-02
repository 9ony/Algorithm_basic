package day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Player{
	int height;
	int weight;
	
	public Player(int h,int w) {
		this.height=h;
		this.weight=w;
	}
}
public class Q24_PlayerSelect {
	public static int choice(List<Player> arr,int n) {
		int cnt=0;//선발인원수
		//Arrays.sort(배열),Collections.sort(ArrayList)
		
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Player> arr = new ArrayList<>();
		System.out.println("씨름선수 후보 인원수: ");
		int n=sc.nextInt();
		System.out.println("키와 몸구게 순서로 입력하세요 ");
		for(int i=0;i<n;i++) {
			int h=sc.nextInt();
			int w=sc.nextInt();
			arr.add(new Player(h,w));
		}
	}
}
