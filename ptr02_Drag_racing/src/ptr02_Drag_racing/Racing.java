package ptr02_Drag_racing;

import java.util.Scanner;

public class Racing {

	
	
	public Racing() {
		// TODO Auto-generated constructor stub
	}
	
	public void sort(String[] arr1, double[] arr2, int num)
	{
		
		Scanner s = new Scanner(System.in);
		double temp;
		String temps;
		String[][] alls = new String[arr2.length][2];
		
		
		for(int j = 0; j < arr2.length; j++) {
			for(int i = 0; i < arr2.length-1; i++)
			{
				if(arr2[i] >= arr2[i+1])
				{
					arr2[i] = arr2[i];
					arr2[i+1] = arr2[i+1];
					
					arr1[i] = arr1[i];
					arr1[i+1] = arr1[i+1];
				}
				
				else if(arr2[i] < arr2[i+1])
				{
					temp = arr2[i];
					arr2[i] = arr2[i+1];
					arr2[i+1] =temp;
					
					temps = arr1[i];
					arr1[i] = arr1[i+1];
					arr1[i+1] =temps;
					
					
				}
				
			}
			
			
		}
		
		
		for(int x = 0; x < arr2.length; x++) {
			alls[x][0] = arr1[x];
			alls[x][1] = Double.toString(arr2[x]);
			//System.out.printf("%s\t",alls[x][0]);
			}
		System.out.println("");
		
		for(int y = 0; y < arr2.length; y++) {

			//System.out.printf("%s\t",alls[y][1]);
			}
		
		System.out.println("--  ����� ��ǥ�ұ��! --");
		System.out.println(" �ƹ� Ű�� �����ֽʽÿ�");
		String start = s.next();
		
	   
		if(num == 1)
		{
			System.out.println("1����!!!!!!!!!!!!!!");
			System.out.printf("%s���� ����� %s�Դϴ�!\n", alls[0][1], alls[0][0]);
			System.out.println("");
			
			System.out.println("��� ������ ���ðڽ��ϱ�?");
			System.out.println("1��:�³�\t\t2��:����");
			int x = s.nextInt();
			while(true)
			{
			if(x == 1)
			{
				for(int i = 0; i < alls.length; i++)
				{
					System.out.println("");
					System.out.printf("%d��\t ���� : %s \t ���� : %s\n ",i+1, alls[i][0], alls[i][1] );
					
				}
				
				break;
			}
			
			else if(x == 2)
			{
				System.out.println("������ �����մϴ�.");
				break;
			}
			
			else
			{
				System.out.println("�߸� �����Ͽ����ϴ�.");
			}
			}
			
		}
		
		else if(num == 2)
		{
			System.out.println("������ ��ǥ�ϰڽ��ϴ�!");
			for(int i = 0; i < 3; i++)
			{
				System.out.printf("%d��\t %s\t %s�� \n",i+1 , alls[i][0], alls[i][1]);
			}
			
			System.out.println("��� ������ ���ðڽ��ϱ�?");
			System.out.println("1��:�³�\t\t2��:����");
		
			int x = s.nextInt();
			while(true)
			{
			if(x == 1)
			{
				for(int i = 0; i < alls.length; i++)
				{
					System.out.println("");
					System.out.printf("%d��\t ���� : %s \t ���� : %s\n ",i+1, alls[i][0], alls[i][1] );
					
				}
				break;
			}
			
			else if(x == 2)
			{
				System.out.println("������ �����մϴ�.");
				break;
			}
			
			else
			{
				System.out.println("�߸� �����Ͽ����ϴ�.");
			}
			}
		}
		
		s.close();
	}
	
	
	
	
	 
}
