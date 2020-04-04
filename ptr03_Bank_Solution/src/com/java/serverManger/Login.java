package com.java.serverManger;

import java.util.Scanner;
import com.java.controler.*;

public class Login {
	
	private String id = CreateID.id;
	private String password = CreateID.password;
	
	private String idInput;
	private String passwordInput;
	
	Scanner s = new Scanner(System.in);
	
	public Login() {
		System.out.println("로그인화면입니다.");
		compare();
	}
	
	private void compare()
	{
		int num = 0;
		while(true)
		{
		 System.out.println("아이디를 입력해주십시오");
		 idInput = s.next();
		 System.out.println("비밀번호를 입력해주십시오");
		 passwordInput = s.next();
		if(idInput.equals(id) && passwordInput.equals(password))
		{
			System.out.println("환영합니다." + id + "님");
			Controler controler =new Controler();
			
			break;
		}
		
		else 
		{
			System.out.println("입력된 정보가 틀립니다.");
			if(num < 3)
			{
				num++;
				System.out.println(num+"번째 입력오류입니다.");
				System.out.println("3번 입력오류 발생시 강제 종료됩니다.");
				
				
			}
			else
			{
				System.out.println("3회 입력 오류입니다.");
				System.out.println("시스템을 종료합니다.");
				break;
				
			}
		}
		}
	}
}
