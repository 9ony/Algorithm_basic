package day08;

import java.util.Scanner;
import java.util.Stack;

public class Q27_Bracket2 {
	public String solution(String str) {
		if(str.length()>=100) return "100글자가 초과됬어요";
		Stack<Character> stack=new Stack<>();
        String result="";
        int cnt=0; // 스택안에 ) 유무체크
		for (int i=str.length()-1; i>=0;i--) { 
			//result 역순미리고려해서 역으로 뒷글자부터 푸쉬
			char temp = str.charAt(i);
			if(temp==')') cnt++;
			if(temp=='('&cnt>0) {
				cnt--;
				while(stack.pop() != ')');
			}
			else stack.push(temp); // ')'  나올때까지 pop
		}//for
		
		while(!stack.isEmpty()) {
			result+=String.valueOf(stack.pop());
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열을 입력하세요:");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Q27_Bracket2 app=new Q27_Bracket2();
		System.out.println(app.solution(str));
	}

}