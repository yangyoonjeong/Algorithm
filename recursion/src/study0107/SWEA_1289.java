package study0107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1289 {
	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		for (int t = 1; t < n+1; t++) {
			int result = 0;
			String a = br.readLine();
			char arr[] = new char[a.length()];
			for (int i = 0; i < a.length(); i++) {
				arr[i] = a.charAt(i);
			}
			

			if(arr[0]=='1') {
				result++;
			}
			
			for (int i = 0; i < arr.length-1; i++) {
				if(arr[i] != arr[i+1]) {
					result++;
				}
			}
			
			
			
			
			
			System.out.println("#"+t+" "+result);
		}
		
		
		
	}
}
