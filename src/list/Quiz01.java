package list;

import java.util.Scanner;

public class Quiz01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]score=new int[10];
		int[]star=new int[10];
		int stdScore=0;
		int range=1;
		
		while(score[score.length-1]==0) {
			for (int i=0;i<score.length;i++) {
				if(score[i]==0) {
					System.out.print((i+1)+"번째 학생의 점수를 입력하세요 >> ");
					stdScore = sc.nextInt();
					
					if(stdScore>0 && stdScore <=100) {
						score[i]=stdScore;
						star[(stdScore-1)/10]++;
					}else {
						System.out.println("잘못입력하셨습니다.");
						System.out.println("점수는 0~100점 사이로 입력해주세요.\n");
						break;
					}
				}
			}
		}
		System.out.println();
		for(int i=0;i<score.length;i++) {
			System.out.print(range+"~"+(range+9)+"\t");
			for(int j=0;j<star[i];j++) {
				System.out.print("*");
			}
			System.out.println();
			range=range+10;
			
		}
	}

}
