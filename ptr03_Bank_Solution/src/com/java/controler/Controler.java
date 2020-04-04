package com.java.controler;

import java.util.Scanner;
import com.java.serverManger.*;
import com.java.customer.*;

public class Controler {
	Customer c = new Customer();
	Scanner s = new Scanner(System.in);
	private int num;
	private int num2;
	//private int cnt;
	
	Customer[] customer = new Customer[3];
	
	public Controler() {
		System.out.println("���ϴ� ���񽺸� ������ �ֽʽÿ�.");
		while(true)
		{
			System.out.println("1�� : ��������� ����\t\t2�� : ������ ����\n3�� : ����");
			num = s.nextInt();
			
			if(num == 1)
			{
				System.out.println("��������� ���� �������Դϴ�.");
				UserData user = new UserData();
			}
			else if(num == 2)
			{
				System.out.println("������ ���� �������Դϴ�.");
				while(true) {
				System.out.println("1�� : ������ �߰�\t\t2�� : ������ ��ȸ\n3�� : �Ա�\t\t4�� : ���\n5�� : ����");
				
				num2 = s.nextInt();
				
				if(num2 == 1)// ������ �߰�
				{
					//System.out.println("����� �������� �߰��Ͻðڽ��ϱ�?");
					//cnt = s.nextInt();
					
					for(int i =0 ; i < customer.length; i++)
					{
						customer[i] = new Customer();
						System.out.printf("%d��° ȸ���� ������ �Է��մϴ�.\n", i+1);
						customer[i].create();
					}
					//addCustomer();
				}
				
				else if(num2 == 2)// ������ ��ȸ
				{
					
					showCustomer();
					
				}
				
				else if(num2 == 3)// �Ա�
				{
					add();
				}
				
				else if(num2 == 4)// ���
				{
					subtract();
				}
				
				else // ����
				{
					System.out.println("������������ �����մϴ�.");
					break;
				}
				}
				
				
			}
			else
			{
				System.out.println("�α׾ƿ��մϴ�.");
				break;
			}
		}
	}
	
	private void addCustomer()
	{
		for(int i =0 ; i < customer.length; i++)
		{
			System.out.printf("%d��° ȸ���� ������ �Է��մϴ�.\n", i+1);
			customer[i].create();
		}
	}
	
	private void showCustomer()
	{
		int x;
		System.out.println("��ȸ�� ���ϴ� ���� ��ȣ�� ���� �ֽʽÿ�.");
		for(int i = 0; i < customer.length; i++)
		{
			System.out.printf("%d. %s\n", i+1, customer[i].name);
		}
		x = s.nextInt();
		customer[x-1].info();
	}
	
	private void add()
	{
		int x;
		System.out.println("�Ա��� ���ϴ� ���� ��ȣ�� ���� �ֽʽÿ�.");
		for(int i = 0; i < customer.length; i++)
		{
			System.out.printf("%d. %s\n", i+1, customer[i].name);
		}
		x = s.nextInt();
		customer[x-1].addAsset();
		System.out.println("������" + customer[x-1].name + "�� �ڻ�");
		System.out.println(customer[x-1].asset+"����");
		System.out.println("-------------------------------------");
		System.out.println("���� �� ��� �ڻ�");
		System.out.println(c.assetAll+"����");
	}
	
	private void subtract()
	{
		int y;
		System.out.println("�Ա��� ���ϴ� ���� ��ȣ�� ���� �ֽʽÿ�.");
		for(int i = 0; i < customer.length; i++)
		{
			System.out.printf("%d. %s\n", i+1, customer[i].name);
		}
		y = s.nextInt();
		customer[y-1].subtractAsset();
		System.out.println("������" + customer[y-1].name + "�� �ڻ�");
		System.out.println(customer[y-1].asset+"����");
		System.out.println("-------------------------------------");
		System.out.println("���� �� ��� �ڻ�");
		System.out.println(c.assetAll+"����");
	}

}
