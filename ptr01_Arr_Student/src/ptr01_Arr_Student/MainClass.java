package ptr01_Arr_Student;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("처음 프로그램에 접속하셨습니다. 필수 정보를 입력하겠습니다.");
		 int num = inputnum();
		 int control = 0;
		 String[] name  = new String[num];
		 int[] score = new int[num];
		 
		 Scanner s0 = new Scanner(System.in);
		 
		 for(int i = 0; i < num; i++)
		 {
			 System.out.printf("%d번째 학생의 이름을 입력하세요\n", i+1);
			 name[i] = inputn();
			 
			 System.out.printf("%d번째 학생의 점수를 입력하세요\n", i+1);
			 score[i] = intputs();
		 }
		 System.out.println("입력을 완료하였습니다.");
		 while(true)
		 {
			 System.out.println("1.입력 \t2.출력 \t3.프로그램 종료");
			 control = s0.nextInt();
			 
			 switch(control)
			 {
			 case 1:
				 for(int i = 0; i < num; i++)
				 {
					 System.out.printf("%d번째 학생의 이름을 입력하세요\n", i+1);
					 name[i] = inputn();
					 
					 System.out.printf("%d번째 학생의 점수를 입력하세요\n", i+1);
					 score[i] = intputs();
				 }
				 System.out.println("입력을 완료하였습니다.");
				 break;
			 case 2:
				 int [] arr1 = new int[num];
				 int [] arr2 = new int[num];
				 String[] name2 = new String[num];
				// int x = 1;
				 for(int i = 0; i < num; i++)
				 {
					 arr1[i] = score[i];
					 System.out.printf("%d번 이름 : %s 점수 : %d\n", i+1, name[i], score[i]);						 
							 }
				 
				 System.out.println("출력을 완료하였습니다.");
				 break;
			 case 3:
				 System.out.println("프로그램을 종료합니다.");
				 return;
			 default:
				  System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
			 }
			 
		 }
		}
		 
		public static int inputnum()
		{
			Scanner s2 = new Scanner(System.in);
			  System.out.println("입력하실 학생의 수를 기입해주세요.");
			  int num = s2.nextInt() ;
			  
			  return num;
		}
		
		public static String inputn()
		{
		
			Scanner s = new Scanner(System.in);
		  String name = s.next();
		   System.out.println("입력이 완료되었습니다.");
			return name;
		}
		
		public static int intputs()
		{
			Scanner s1 = new Scanner(System.in);
			int score = 0;
			while(true)
			{
			score	= s1.nextInt();
			 if(score > 100)
			 {
				 System.out.println("100이상의 상수를 입력할 수 없습니다.\n 다시 입력해 주십시오.");
			 }
			 else
				 break;
			}
			System.out.println("입력이 완료되었습니다.");
			
			return score;
			
		}
}
