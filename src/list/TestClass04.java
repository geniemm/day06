package list;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass04 {
public static void main(String[] args) {
	ArrayList<String> arr = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<3;i++) {
		System.err.println(i+"번째 입력: ");
		String msg= sc.next();
		arr.add(msg);
		//arr.add(sc.next());
	}
	
	System.out.println("arr: "+arr);
	System.out.println("찾는값입력: ");
	String search = sc.next();
	System.out.println("contains : "+arr.contains(search));
	System.out.println("indexOf: "+arr.indexOf(search)); //참이면 해당하는 인덱스번호 거짓이면 -1
	
}
}
