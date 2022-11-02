package day08;
import java.util.*;
public class Q26_Bracket {

	public String solution(String str) {
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			
			if(temp == ')' && stack.size() == 0) { 
				return "NO";
			} else if(temp == ')' && stack.size() > 0) {
				stack.pop();
			} else if(temp == '(') {
				stack.push(temp);
			}
		}
        
        if(stack.size() > 0) 
        	return "NO";
        else 
        	return "YES";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("괄호를 입력하세요:");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Q26_Bracket app=new Q26_Bracket();
		System.out.println(app.solution(str));
	}

}