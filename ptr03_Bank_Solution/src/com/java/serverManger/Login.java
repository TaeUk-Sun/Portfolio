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
		System.out.println("�α���ȭ���Դϴ�.");
		compare();
	}
	
	private void compare()
	{
		int num = 0;
		while(true)
		{
		 System.out.println("���̵� �Է����ֽʽÿ�");
		 idInput = s.next();
		 System.out.println("��й�ȣ�� �Է����ֽʽÿ�");
		 passwordInput = s.next();
		if(idInput.equals(id) && passwordInput.equals(password))
		{
			System.out.println("ȯ���մϴ�." + id + "��");
			Controler controler =new Controler();
			
			break;
		}
		
		else 
		{
			System.out.println("�Էµ� ������ Ʋ���ϴ�.");
			if(num < 3)
			{
				num++;
				System.out.println(num+"��° �Է¿����Դϴ�.");
				System.out.println("3�� �Է¿��� �߻��� ���� ����˴ϴ�.");
				
				
			}
			else
			{
				System.out.println("3ȸ �Է� �����Դϴ�.");
				System.out.println("�ý����� �����մϴ�.");
				break;
				
			}
		}
		}
	}
}
