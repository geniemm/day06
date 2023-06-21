package list;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("===========");
	System.out.println("1. 로그인");
	System.out.println("2. 회원가입");
	System.out.println("3. 회원정보 확인");
	System.out.print("메뉴 선택: ");
	int choice = sc.nextInt();
	int i =0;
	String inputId;
	String inputPwd;
	ArrayList<String> id= new ArrayList<>();
	ArrayList<String> pwd= new ArrayList<>();
	
	while(true) {
		switch(choice) {
		case 1:
			System.out.print("아이디 입력: ");
			inputId = sc.next();
			for(i=0;i<id.size();i++) {
				if(id.contains(inputId)) {
					System.out.print("비밀번호 입력: ");
					inputPwd = sc.next();
					if (inputPwd.equals(pwd.get(i))) {
					System.out.println("== 로그인 완료 ==\n");
					
					System.out.println("1. 비밀번호 변경");
					System.out.println("2. 회원 탈퇴");
					System.out.print("번호 입력: ");
					int num = sc.nextInt();
					if(num==1) {
						System.out.print("변경하실 비밀번호를 입력하세요: ");
						String chPwd=sc.next();
						pwd.set(i,chPwd);
						System.out.println("비밀번호가 변경되었습니다. 다시 로그인해주세요.");
						break;	
					}else if(num==2) {
						System.out.println("회원탈퇴 완료.");
						id.remove(i);
						pwd.remove(i);
					}	
						
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
					continue;
				}
			}
			
			break;
			}
		case 2: 
			System.out.println("=== 회원가입 ===");
			while(true) {
				System.out.print("등록할 아이디 입력: ");
				inputId=sc.next();
				
			}
			
			
	}
	
	}
	}
}
