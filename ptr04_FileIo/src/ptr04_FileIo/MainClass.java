package ptr04_FileIo;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		File file1 = new File();
		Scanner s1 = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("���ϴ� ���񽺸� �����Ͻÿ�.");
		System.out.println("1. ���ϸ����\t\t2. ���Ϻҷ�����\n3. ���Ϻ���");
		num = s1.nextInt();
		
		switch(num)
		{
			case 1:
				System.out.println(" ������ �Է��ϰڽ��ϴ�.");
				file1.output();
				break;
			
			case 2:
				System.out.println(" ������ �ҷ����ڽ��ϴ�.");
				file1.load();
				break;
				
			case 3:
			System.out.println("������ �����ϰڽ��ϴ�.");
			file1.copy();
				break;
				
			default:
			System.out.println("�Է��� �߸��Ǽ� �ý����� �����մϴ�.");
				break;
			
		}
		
		
		
		
	}
}
