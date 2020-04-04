package com.java.serverManger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CreateID {
	static String name;
	static int age;
    static String sex;
	static String id;
	static String password;
	static String date;
	
	private int sexNum;
	
	int num;
	
	Scanner s = new Scanner(System.in);
	
	public CreateID() {
		
	}
	
	public CreateID(int i) {
		System.out.println(" 회원가입을 진행합니다.");
		create();
	}
	
	private void create()
	{
		System.out.println(" 이름을 입력해주십시오. ");
		this.name = s.next();
		
		System.out.println("나이를 입력해주십시오.");
		this.age = s.nextInt();
		
		while(true)
		{
		System.out.println(" 성별을 입력해주십시오. ");
		System.out.println(" 남자 : 1번\t\t여자 : 2번");
		this.sexNum = s.nextInt();
		
		if(this.sexNum == 1)
		{
			this.sex="남";
			break;
		}
		
		else if(this.sexNum == 2)
		{
			this.sex="여";
			break;
		}
		
		else
		{
			System.out.println(" 성별입력이 잘못 되었습니다. ");
			System.out.println(" 다시 입력해주십시오. ");
		}
		}
		
		System.out.println("아이디를 입력해주십시오.");
		this.id = s.next();
		
		System.out.println("비밀번호를 입력해주십시오.");
		this.password = s.next();
		this.date = dateUp();
		createInfo();
	}
	
	private void createInfo()
	{
		System.out.printf("이름 : %s\t나이 : %d\n성별 : %s\t아이디 : %s\n비밀번호 : %s\n가입날짜 : %s\n", this.name, this.age, this.sex, this.id, this.password, this.date);
		System.out.println("입력한 정보가 맞습니까?");
		while(true)
		{
		System.out.println("맞다 : 1번\t\t 아니다 : 2번");
		this.num = s.nextInt();
		if(this.num == 1)
		{
			System.out.println("회원가입이 완료되었습니다. 정보를 저장합니다.");
			
			break;
		}
		
		else if(this.num == 2)
		{
			System.out.println("정보 입력이 실패하셨습니다. 다시 입력하겠습니다.");
			create();
		}
		else
		{
			System.out.println("잘못된 입력입니다. 다시 입력해 주십시오.");
		}
		}
	}
	
	private String dateUp()
	{
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd HH:mm");
		String result = date.format(new Date());
		return result;
	}
}
