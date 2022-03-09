import java.io.*;
import java.util.*;
 
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr;
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0 ; i < n ; i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			int stu = Integer.parseInt(st.nextToken());
			arr = new int[stu];
			
			double sum = 0;
			
			for(int j = 0 ; j < stu ; j++) {
				int val = Integer.parseInt(st.nextToken());	
				arr[j] = val;
				sum += val;	
			}
			
			double mean = (sum / stu) ;
			double count = 0;
			
			for(int j = 0 ; j < stu ; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/stu)*100);
			
		}
	}
}