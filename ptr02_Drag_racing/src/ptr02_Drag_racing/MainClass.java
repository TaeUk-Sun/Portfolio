package ptr02_Drag_racing;


import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Racing r = new Racing();
		int gamemode;
		int user;
		double math;
		
		System.out.println(" -- ���� �巹�� ���̽� ���ӿ� ���Ű� �������� ȯ���մϴ�! -- ");
		System.out.println(" ���ӿ� �����Ͻ� �е��� ����Դϱ�?");
		user = s.nextInt();
		
		
		System.out.println(" -- ���Ӹ�带 ������ �ֽʽÿ�. --");
		System.out.println(" 1.1�� �¸���\t2. ��ŷ������");
		while(true)
		{
		gamemode = s.nextInt();
		if(gamemode == 1)
		{
			System.out.println("1�� �¸����� �����ϼ̽��ϴ�.");
			break;
		}
		else if(gamemode == 2)
		{
			System.out.println("��ŷ�������� �����ϼ̽��ϴ�.");
			if(user < 3)
			{
				System.out.println("3�� �̸��� ��ŷ�������� �� �� �����ϴ�.");
				System.out.println("�ٽ� ����ֽʽÿ�");
			}
			
			else
			{
			break;
			}
		}
		else
		{
			System.out.println("�߸� �����ϼ̽��ϴ�. �ٽ� ������ �ֽʽÿ�.");
		}

		
		}
		
		Cars[] cars = new Cars[user];
		String[] winnername = new String[cars.length];
		double[] winnerrecord = new double[cars.length];
		for(int i = 0 ; i < cars.length;i++)
		{
			cars[i] = new Cars(i+1);
			cars[i].info();
			math = (double)cars[i].speed() + (double)cars[i].oil()/2;
			winnername[i] = cars[i].model();
			winnerrecord[i] = math;
		}
		
		r.sort(winnername,winnerrecord,gamemode);
		
		
		
		
	}
	
	
	
	
	
	
}
