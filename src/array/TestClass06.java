package array;

import java.util.Scanner;

public class TestClass06 {
public static void main(String[] args) {
	int arr[]= {10,54,30,13,17,25};
	Scanner sc = new Scanner(System.in);
	
	System.out.print("짝수, 홀수 입력: ");
	String input = sc.next();
	
		for(int i=0;i<arr.length;i++) {
			if(input.equals("짝수")) {
				if(arr[i]%2==0)
				System.out.println("짝수: "+arr[i]);
		}
			else if(input.equals("홀수")) {
				if(arr[i]%2==1)
				System.out.println("홀수: "+arr[i]);
		}
	}
}
}
