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
		System.out.println("원하는 서비스를 선택해 주십시오.");
		while(true)
		{
			System.out.println("1번 : 사용자정보 열람\t\t2번 : 고객정보 관리\n3번 : 종료");
			num = s.nextInt();
			
			if(num == 1)
			{
				System.out.println("사용자정보 열람 페이지입니다.");
				UserData user = new UserData();
			}
			else if(num == 2)
			{
				System.out.println("고객정보 관리 페이지입니다.");
				while(true) {
				System.out.println("1번 : 고객정보 추가\t\t2번 : 고객정보 조회\n3번 : 입금\t\t4번 : 출금\n5번 : 종료");
				
				num2 = s.nextInt();
				
				if(num2 == 1)// 고객정보 추가
				{
					//System.out.println("몇명의 고객정보를 추가하시겠습니까?");
					//cnt = s.nextInt();
					
					for(int i =0 ; i < customer.length; i++)
					{
						customer[i] = new Customer();
						System.out.printf("%d번째 회원의 정보를 입력합니다.\n", i+1);
						customer[i].create();
					}
					//addCustomer();
				}
				
				else if(num2 == 2)// 고객정보 조회
				{
					
					showCustomer();
					
				}
				
				else if(num2 == 3)// 입금
				{
					add();
				}
				
				else if(num2 == 4)// 출금
				{
					subtract();
				}
				
				else // 종료
				{
					System.out.println("고객정보관리를 종료합니다.");
					break;
				}
				}
				
				
			}
			else
			{
				System.out.println("로그아웃합니다.");
				break;
			}
		}
	}
	
	private void addCustomer()
	{
		for(int i =0 ; i < customer.length; i++)
		{
			System.out.printf("%d번째 회원의 정보를 입력합니다.\n", i+1);
			customer[i].create();
		}
	}
	
	private void showCustomer()
	{
		int x;
		System.out.println("조회를 원하는 고객의 번호를 눌러 주십시오.");
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
		System.out.println("입금을 원하는 고객의 번호를 눌러 주십시오.");
		for(int i = 0; i < customer.length; i++)
		{
			System.out.printf("%d. %s\n", i+1, customer[i].name);
		}
		x = s.nextInt();
		customer[x-1].addAsset();
		System.out.println("변동된" + customer[x-1].name + "의 자산");
		System.out.println(customer[x-1].asset+"만원");
		System.out.println("-------------------------------------");
		System.out.println("은행 총 운용 자산");
		System.out.println(c.assetAll+"만원");
	}
	
	private void subtract()
	{
		int y;
		System.out.println("입금을 원하는 고객의 번호를 눌러 주십시오.");
		for(int i = 0; i < customer.length; i++)
		{
			System.out.printf("%d. %s\n", i+1, customer[i].name);
		}
		y = s.nextInt();
		customer[y-1].subtractAsset();
		System.out.println("변동된" + customer[y-1].name + "의 자산");
		System.out.println(customer[y-1].asset+"만원");
		System.out.println("-------------------------------------");
		System.out.println("은행 총 운용 자산");
		System.out.println(c.assetAll+"만원");
	}

}
