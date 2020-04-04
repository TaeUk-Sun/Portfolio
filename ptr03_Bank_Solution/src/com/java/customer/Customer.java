package com.java.customer;

import java.util.Scanner;

public class Customer {
	int age;
	public int asset;
	public static int assetAll;
	int customerNum;
	
	
	String phoneInput;
	public String name;
	String phone;
	
	Scanner s0 = new Scanner(System.in);
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int x) {
		// TODO Auto-generated constructor stub
	}
	
	public void create()
	{
		System.out.println("고객님의 정보를 입력합니다.");
		System.out.println("이름을 입력해 주십시오.");
		name = s0.next();
		
		System.out.println("나이를 입력해 주십시오.");
		age = s0.nextInt();
		
		System.out.println("전화번호를 입력해주십시오. (숫자만)");
		phoneInput = s0.next();
		phone = phoneNum(phoneInput);
		
		System.out.println("자산을 입력해주십시오. (숫자만 만원단위)");
		asset = s0.nextInt();
		assetAll =+ asset;
	}
	
	public void info()
	{
		System.out.printf(" --%s 회원님의 정보입니다.-- \n",name);
		System.out.printf("이름 : %s\t\t나이 : %d\n전화번호 : %s\n 자산 : %d 만원\n", name, age, phone, asset );
	}
	
	public void addAsset()
	{
		int addAsset;
		System.out.println("입금할 금액을 입력해 주십시오.");
		addAsset = s0.nextInt();
		
		asset = asset + addAsset;
		assetAll =+ addAsset;
	}
	
	public void subtractAsset()
	{
		int subtractAsset;
		System.out.println("인출할 금액을 입력해 주십시오.");
		subtractAsset = s0.nextInt();
		
		asset = asset - subtractAsset;
		assetAll =- subtractAsset;
		
	}
	private String phoneNum(String src)
	{
		if (src == null) {
			return "";
		}
		
		if (src.length() ==8)
		{
			return src.replaceFirst("^([0-9]{4})([0-9]{4})$", "$1-$2");
		}
		
		else if (src.length() ==12)
		{
			return src.replaceFirst("^([0-9]{4})([0-9]{4})([0-9]{4})$", "$1-$2-$3");
		}
		return src.replaceFirst("^(02|[0-9]{3})([0-9]{3,4})([0-9]{4})$", "$1-$2-$3");
		
	}

}
