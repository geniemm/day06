package array;

public class TestClass04 {
public static void main(String[] args) {
	int[] arr = {100,200,300};
	double[] dos= {1.11,2.22,3.33};
	String[] str = {"가나","다라","마바"};
	
	for(int num:arr) { // 향상된 for문
		System.out.println(num);
	}
	
	for(double d:dos) {
		System.out.println(d);
	}
	for(String st:str) {
		System.out.println(st);
	}
	
	
}
}
