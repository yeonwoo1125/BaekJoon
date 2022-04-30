import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for(int i=0; i<N; i++) {
		  String str = br.readLine();
		  Stack<Character> stack = new Stack<>();
		  for(int j=0; j<str.length(); j++) {
			char ch = str.charAt(j);
	
			if(ch == '(') stack.push(ch);
			else {
				if(stack.empty()) {
					stack.push(ch);
					break;
				}
				else stack.pop();	
			}
		  }
		  if(stack.isEmpty()) System.out.println("YES");
		  else System.out.println("NO");
        }
	} 
} 