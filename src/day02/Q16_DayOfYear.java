package day02;

import java.util.Scanner;

public class Q16_DayOfYear {
	int [][]mdays= {{31,28,31,30,31,30,31,31,30,31,30,31},
			{31,29,31,30,31,30,31,31,30,31,30,31}};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q16_DayOfYear app=new Q16_DayOfYear();
		app.input_data();
	}
	
	public void input_data() {
		int no=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("년도 : ");
			int year=sc.nextInt();
			System.out.println("월 : ");
			int month=sc.nextInt();
			System.out.println("일 : ");
			int day=sc.nextInt();
			
			int totalDay=dayOfYear(year, month,day);
			System.out.printf("%d년 %d일째 입니다\n",year,totalDay);
			
			System.out.println("한번 더 하시겠습니다? [1.예 2.아니오]");
			no=sc.nextInt();
		}while(no==1);
		System.out.println("Bye Bye~~~");
	}
	public int dayOfYear(int yy, int mm, int dd) {
		int total=0;
		int yoon=0;
		//윤년: 년도를 4로 나누어 떨어지면서 100으로는 안되고 400으로는 나누어 떨어지면 윤년
		if(yy%400==0||yy%100!=0&&yy%4==0) {
			yoon=1;
		}
		for(int i=0;i<mm-1;i++) {
			total+=mdays[yoon][i];
		}
		total+=dd;
		return total;
	}
}///////////////////////////////
