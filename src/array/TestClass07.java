package array;

import java.util.Scanner;

public class TestClass07 {
public static void main(String[] args) {
	int arr[]= {10,54,13,17,25,30};
	
	Scanner sc = new Scanner(System.in);
	System.out.println("짝수,홀수 입력: ");
	String msg = sc.next();
	
	for(int i=0;i<arr.length;i++) {
		if(msg.equals("홀수") && i%2==1) {
			System.out.println("홀수 index 수 출력: "+arr[i]);
		}
		else if (msg.equals("짝수") && i%2==0){
			System.out.println("짝수 index 수 출력: "+arr[i]);
		}
	}
	
	System.out.println("---------------------------------------");
	int k=0;
	if(msg.equals("짝수")) {
		k=0;
	}else {
		k=1;
	}
	for(;k<arr.length;k+=2) {
		System.out.println(k+"."+arr[k]);
	}
	
	System.out.println("--------------------------");
	//변수=(조건식)?참인경우:거짓인경우;
	for(int i=(msg.equals("짝수")?0:1);i<arr.length;i+=2) {
		System.out.println(i+"."+arr[i]);
	}
	


}
}
