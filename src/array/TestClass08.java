package array;

import java.util.Scanner;

public class TestClass08 {
	public static void main(String[] args) {
		String[] id = new String[5];
		String[] pwd = new String[5];
		String joinId;
		int i=0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("[1] 로그인");
			System.out.println("[2] 회원가입");
			System.out.println("[3] 모든 회원보기");
			System.out.println("[4] 프로그램 종료");
			System.out.print("번호 입력: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("=== 로그인 ===\n");
				for (i = 0; i < id.length; i++) {
					System.out.print("아이디 입력: ");
					String idInput = sc.next();
					if (idInput.equals(id[i])) {
						for (int j = 0; j < pwd.length; j++) {
							System.out.print("비밀번호 입력: ");
							String pwdInput = sc.next();
							if (pwdInput.equals(pwd[i])) {
								System.out.println("== 로그인 완료 ==");
								break;
							} else {
								System.out.println("비밀번호가 틀렸습니다.");
								continue;
							}
						}
					} else {
						System.out.println("존재하지 않는 아이디입니다.");
						break;
					}
				}
				
				break;
			case 2:
				System.out.println("=== 회원가입 ===\n");
				if (id[id.length-1]!=null){
					System.out.println("더 이상 저장할 공간이 없습니다.");
				}
			
				while(true){	
					
					System.out.print("아이디 입력: ");
					joinId = sc.next();
					
					for(i=0;i<id.length;i++) {
						if (joinId.equals(id[i])) {
								break;
							}else if(id[i] == null) {
								break;
							}
					}	
						if(id[i] == null) {
							break;
						}
						System.out.println("동일한 아이디가 존재합니다.");
						System.out.println("다시 입력해주세요");
 				}
						System.out.print("비밀번호 입력: ");
						String joinPwd = sc.next();
						pwd[i] = joinPwd;
						id[i] = joinId;
						System.out.println("가입을 축하합니다.");
						break;
			
									 
		

			case 3:
				if(id[i]==null) {
					System.out.println("등록된 정보가 없습니다.\n");
					break;
				}
				System.out.println("=== 모든 회원보기 ===\n");
				for (i = 0; i < id.length; i++) {
					System.out.println(id[i]);
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다. ");
				System.exit(0);
				
			default:
				System.out.println("잘못입력하셨습니다.");

			}
		}
	}
}
