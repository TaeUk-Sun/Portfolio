package com.java.serverManger;

import java.util.Scanner;

public class UserData {
   
	
	
	private int num;
	Scanner s = new Scanner(System.in);
	
	public UserData() {
		System.out.println("��ϵ� ������� ������ �����Ͻðڽ���?");
		System.out.println("1�� : ����\t\t 2��: ����");
		while(true)
		{	
		num = s.nextInt();
		if(num == 1)
		{
			showInfo();
			break;
		}
		
		else if(num == 2)
		{
			break;
		}
		
		else
		{
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		}
		
	}
	
	private void showInfo()
	{
		System.out.println("��ϵ� ȸ���� ������");
		System.out.printf("�̸� : %s\t���� : %d\n���� : %s\t���̵� : %s\n��й�ȣ : %s\n ���Գ�¥ : %s\n", CreateID.name, CreateID.age, CreateID.sex, CreateID.id, CreateID.password, CreateID.date);
		//System.out.println("�̸�" + newid.name);
		System.out.println("�Դϴ�.");
	}
	
}
