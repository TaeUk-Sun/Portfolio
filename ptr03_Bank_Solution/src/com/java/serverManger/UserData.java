package com.java.serverManger;

import java.util.Scanner;

public class UserData {
   
	
	
	private int num;
	Scanner s = new Scanner(System.in);
	
	public UserData() {
		System.out.println("등록된 사용자의 정보를 열람하시겠습까?");
		System.out.println("1번 : 수락\t\t 2번: 거절");
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
			System.out.println("잘못 입력하셨습니다.");
		}
		}
		
	}
	
	private void showInfo()
	{
		System.out.println("등록된 회원의 정보는");
		System.out.printf("이름 : %s\t나이 : %d\n성별 : %s\t아이디 : %s\n비밀번호 : %s\n 가입날짜 : %s\n", CreateID.name, CreateID.age, CreateID.sex, CreateID.id, CreateID.password, CreateID.date);
		//System.out.println("이름" + newid.name);
		System.out.println("입니다.");
	}
	
}
