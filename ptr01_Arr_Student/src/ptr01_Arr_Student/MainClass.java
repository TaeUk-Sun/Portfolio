package ptr01_Arr_Student;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("ó�� ���α׷��� �����ϼ̽��ϴ�. �ʼ� ������ �Է��ϰڽ��ϴ�.");
		 int num = inputnum();
		 int control = 0;
		 String[] name  = new String[num];
		 int[] score = new int[num];
		 
		 Scanner s0 = new Scanner(System.in);
		 
		 for(int i = 0; i < num; i++)
		 {
			 System.out.printf("%d��° �л��� �̸��� �Է��ϼ���\n", i+1);
			 name[i] = inputn();
			 
			 System.out.printf("%d��° �л��� ������ �Է��ϼ���\n", i+1);
			 score[i] = intputs();
		 }
		 System.out.println("�Է��� �Ϸ��Ͽ����ϴ�.");
		 while(true)
		 {
			 System.out.println("1.�Է� \t2.��� \t3.���α׷� ����");
			 control = s0.nextInt();
			 
			 switch(control)
			 {
			 case 1:
				 for(int i = 0; i < num; i++)
				 {
					 System.out.printf("%d��° �л��� �̸��� �Է��ϼ���\n", i+1);
					 name[i] = inputn();
					 
					 System.out.printf("%d��° �л��� ������ �Է��ϼ���\n", i+1);
					 score[i] = intputs();
				 }
				 System.out.println("�Է��� �Ϸ��Ͽ����ϴ�.");
				 break;
			 case 2:
				 int [] arr1 = new int[num];
				 int [] arr2 = new int[num];
				 String[] name2 = new String[num];
				// int x = 1;
				 for(int i = 0; i < num; i++)
				 {
					 arr1[i] = score[i];
					 System.out.printf("%d�� �̸� : %s ���� : %d\n", i+1, name[i], score[i]);						 
							 }
				 
				 System.out.println("����� �Ϸ��Ͽ����ϴ�.");
				 break;
			 case 3:
				 System.out.println("���α׷��� �����մϴ�.");
				 return;
			 default:
				  System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��� �ּ���.");
			 }
			 
		 }
		}
		 
		public static int inputnum()
		{
			Scanner s2 = new Scanner(System.in);
			  System.out.println("�Է��Ͻ� �л��� ���� �������ּ���.");
			  int num = s2.nextInt() ;
			  
			  return num;
		}
		
		public static String inputn()
		{
		
			Scanner s = new Scanner(System.in);
		  String name = s.next();
		   System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
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
				 System.out.println("100�̻��� ����� �Է��� �� �����ϴ�.\n �ٽ� �Է��� �ֽʽÿ�.");
			 }
			 else
				 break;
			}
			System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
			
			return score;
			
		}
}
