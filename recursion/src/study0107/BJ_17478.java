package study0107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_17478 {
	static int cnt = 0;
	static int cnt1 = 0;
	static String first = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.";
	static String a = "\"재귀함수가 뭔가요?\"";
	static String b = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
	static String c = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
	static String d = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
	static String e = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
	static String last = "라고 답변하였지.";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		statement(num);
		
	}
	
	
	static void statement(int n) {
		if(n<0) {
			return;
		}
		if(cnt == 0) {
			System.out.println(first);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}
		else if(cnt>0 && n>0) {
			a = "----" + a;
			b = "----" + b;
			c = "----" + c;
			d = "----" + d;
			e = "----" + e;
			last = "----" + last;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}
		else{
		a = "----" + a;
		last = "----" + last;
		e = "----" + e;

		System.out.println(a);
		answer(cnt);
		}
		
		cnt ++;
		statement(n-1);
	}
	
	static void answer(int c){
		if(cnt1 == 0) {
			System.out.println(e);
			System.out.println(last);
			cnt1++;
		}
		else if(cnt1 > 0 && c>0) {
			last = last.substring(4, last.length());
			System.out.println(last);
			cnt1++;
		}
		else if(c==0) {
			last = last.substring(4, last.length());
			System.out.println(last);
		}
		if(c<0) {
			return;
		}
		answer(c-1);
	}
	
}
