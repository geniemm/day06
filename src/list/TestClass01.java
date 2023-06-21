package list;

import java.util.ArrayList;

public class TestClass01 {
public static void main(String[] args) {
	/*
	 Collection Framework
	 - 데이터 군을 저장하는 클래스들을 표준화한 설계
	 
	 Collection
	 - 자료구조
	 	-> 데이터를 사용하는 방식
	 Framework
	 - 표준화되어있는 틀
	 
	 List
	 - ArrayList
	 - LinkedList
	 ...
	 
	 list : 데이터의 순서가 존재한다. index를 사용할 수 있다.
	 		저장데이터의 중복은 허용된다.
	 배열은 고정크기, arraylist는 가변크기	
	 */
	
	ArrayList<String> arr = new ArrayList<>();
	arr.add("안녕");
	arr.add("하세요");
	arr.add("요오");
	
//	String [] str = new String[2];
//	str[0] = "안녕";
//	str[1] = "하세요";
	
	System.out.println("arr: "+arr);
	
		
	
	
	
}
}
