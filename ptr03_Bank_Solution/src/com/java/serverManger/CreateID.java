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
		System.out.println(" ȸ�������� �����մϴ�.");
		create();
	}
	
	private void create()
	{
		System.out.println(" �̸��� �Է����ֽʽÿ�. ");
		this.name = s.next();
		
		System.out.println("���̸� �Է����ֽʽÿ�.");
		this.age = s.nextInt();
		
		while(true)
		{
		System.out.println(" ������ �Է����ֽʽÿ�. ");
		System.out.println(" ���� : 1��\t\t���� : 2��");
		this.sexNum = s.nextInt();
		
		if(this.sexNum == 1)
		{
			this.sex="��";
			break;
		}
		
		else if(this.sexNum == 2)
		{
			this.sex="��";
			break;
		}
		
		else
		{
			System.out.println(" �����Է��� �߸� �Ǿ����ϴ�. ");
			System.out.println(" �ٽ� �Է����ֽʽÿ�. ");
		}
		}
		
		System.out.println("���̵� �Է����ֽʽÿ�.");
		this.id = s.next();
		
		System.out.println("��й�ȣ�� �Է����ֽʽÿ�.");
		this.password = s.next();
		this.date = dateUp();
		createInfo();
	}
	
	private void createInfo()
	{
		System.out.printf("�̸� : %s\t���� : %d\n���� : %s\t���̵� : %s\n��й�ȣ : %s\n���Գ�¥ : %s\n", this.name, this.age, this.sex, this.id, this.password, this.date);
		System.out.println("�Է��� ������ �½��ϱ�?");
		while(true)
		{
		System.out.println("�´� : 1��\t\t �ƴϴ� : 2��");
		this.num = s.nextInt();
		if(this.num == 1)
		{
			System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�. ������ �����մϴ�.");
			
			break;
		}
		
		else if(this.num == 2)
		{
			System.out.println("���� �Է��� �����ϼ̽��ϴ�. �ٽ� �Է��ϰڽ��ϴ�.");
			create();
		}
		else
		{
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��� �ֽʽÿ�.");
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
