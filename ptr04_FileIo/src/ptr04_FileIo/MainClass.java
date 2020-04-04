package ptr04_FileIo;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		File file1 = new File();
		Scanner s1 = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("원하는 서비스를 선택하시오.");
		System.out.println("1. 파일만들기\t\t2. 파일불러오기\n3. 파일복사");
		num = s1.nextInt();
		
		switch(num)
		{
			case 1:
				System.out.println(" 파일을 입력하겠습니다.");
				file1.output();
				break;
			
			case 2:
				System.out.println(" 파일을 불러오겠습니다.");
				file1.load();
				break;
				
			case 3:
			System.out.println("파일을 복사하겠습니다.");
			file1.copy();
				break;
				
			default:
			System.out.println("입력이 잘못되서 시스템을 종료합니다.");
				break;
			
		}
		
		
		
		
	}
}
