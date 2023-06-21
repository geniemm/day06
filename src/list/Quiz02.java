package list;

import java.util.Scanner;

public class Quiz02 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int cnt=0;
	int i;
	String[] cmd =new String[] {"count","member","grade","print","modify","remove","exit"};
	//System.out.println("학생 수: count\n ");
	System.out.println("명령어를 입력하세요: ");
	String msg = sc.next();
	while(true) {
		switch(msg) {
		case "count":
			
			if(cnt==0) {
				System.out.print("입력할 학생 수를 입력하세요: ");
				cnt=sc.nextInt();
			} else {
				System.out.println("이미 입력된 학생 수가 있습니다.");
				System.out.println("학생 정보를 전부 출력해주세요.");
				break;
			}
			
			break;
		case "member":
			for(i=0;i<cnt;i++) {
				System.out.println("이름을 입력하세요: ");
				
			}
			break;
		
		
		}
			
	}
	
	




}
}
