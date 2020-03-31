package ptr02_Drag_racing;


import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Racing r = new Racing();
		int gamemode;
		int user;
		double math;
		
		System.out.println(" -- 랜덤 드레그 레이싱 게임에 오신걸 진심으로 환영합니다! -- ");
		System.out.println(" 게임에 참가하실 분들은 몇명입니까?");
		user = s.nextInt();
		
		
		System.out.println(" -- 게임모드를 선택해 주십시오. --");
		System.out.println(" 1.1위 승리전\t2. 랭킹결정전");
		while(true)
		{
		gamemode = s.nextInt();
		if(gamemode == 1)
		{
			System.out.println("1위 승리전을 선택하셨습니다.");
			break;
		}
		else if(gamemode == 2)
		{
			System.out.println("랭킹결정전을 선택하셨습니다.");
			if(user < 3)
			{
				System.out.println("3명 미만은 랭킹결정전을 할 수 없습니다.");
				System.out.println("다시 골라주십시오");
			}
			
			else
			{
			break;
			}
		}
		else
		{
			System.out.println("잘못 선택하셨습니다. 다시 선택해 주십시오.");
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
