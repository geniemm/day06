package list;

import java.util.ArrayList;

public class TestClass02 {
public static void main(String[] args) {
	ArrayList<String> arr =new ArrayList<>();
	arr.add("하");
	arr.add("하하");
	arr.add("하하하");
	arr.add("하하하하");
	System.out.println(arr);
	System.out.println(arr.size());
	// length, size 둘중에 하나는 꼭 있다.
	
	String s = arr.get(3);
	System.out.println("3: "+s);
	
	System.out.println("--- for each --- ");
	for(String ss : arr) {
		System.out.println(ss);
	}
}
}
