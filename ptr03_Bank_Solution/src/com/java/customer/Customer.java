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
		System.out.println("������ ������ �Է��մϴ�.");
		System.out.println("�̸��� �Է��� �ֽʽÿ�.");
		name = s0.next();
		
		System.out.println("���̸� �Է��� �ֽʽÿ�.");
		age = s0.nextInt();
		
		System.out.println("��ȭ��ȣ�� �Է����ֽʽÿ�. (���ڸ�)");
		phoneInput = s0.next();
		phone = phoneNum(phoneInput);
		
		System.out.println("�ڻ��� �Է����ֽʽÿ�. (���ڸ� ��������)");
		asset = s0.nextInt();
		assetAll =+ asset;
	}
	
	public void info()
	{
		System.out.printf(" --%s ȸ������ �����Դϴ�.-- \n",name);
		System.out.printf("�̸� : %s\t\t���� : %d\n��ȭ��ȣ : %s\n �ڻ� : %d ����\n", name, age, phone, asset );
	}
	
	public void addAsset()
	{
		int addAsset;
		System.out.println("�Ա��� �ݾ��� �Է��� �ֽʽÿ�.");
		addAsset = s0.nextInt();
		
		asset = asset + addAsset;
		assetAll =+ addAsset;
	}
	
	public void subtractAsset()
	{
		int subtractAsset;
		System.out.println("������ �ݾ��� �Է��� �ֽʽÿ�.");
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
