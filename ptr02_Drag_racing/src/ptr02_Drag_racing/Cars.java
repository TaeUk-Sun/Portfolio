package ptr02_Drag_racing;

public class Cars {

	private int oil = (int) (Math.random() * 91) +10 ; //10~100 
	private int speed = (int) (Math.random() * 201) +100; //100~ 300
	
	private int random1 = (int) (Math.random() *6) ; //model random 0~5
	private int random2 = (int) (Math.random() *7) ; // color random 0~6
	
	private int oilmax = 100;
	private int speedmax = 300;
	
	private int sendoil;
	private int sendspeed;
	
	
	String[] model = {"Benz", "BMW", "KIA", "Hyundai", "AUDI", "Lamborghini"};
	String[] color = {"red", "blue", "white", "black", "green", "gray", "carbon"};
	
	public Cars(int x) {
		System.out.printf("%d번 참가 차량 등장합니다!\n\n",x);
	}
	
	public void info()
	{
		if(random1 == 5)
		{
			if(random2 == 6)
			{
				System.out.println("아아 전설적인 슈퍼카가 등장했습니다!!");
				System.out.println("심지어 가벼운 카본으로 중무장했습니다!!");
				System.out.printf("차량 이름 : %s 차량 컬러 : %s\n\n",
						model[random1], color[random2]);
				
			}
			else
			{	
			System.out.println("아아 전설적인 슈퍼카가 등장했습니다!");
			System.out.printf("차량 이름 : %s 차량 컬러 : %s\n\n",
					model[random1], color[random2]);
			
			}
		}
		
		else if(random1 != 5)
		{
			if(random2 == 6)
			{
			System.out.println("가벼운 소재의 차량이 등장했습니다!");
			System.out.printf("차량 이름 : %s 차량 컬러 : %s\n\n",
					model[random1], color[random2]);
			
			}
			else
			{
				System.out.printf("차량 이름 : %s 차량 컬러 : %s\n\n",
						model[random1], color[random2]);
				
			}
		}
		
	}
	public String model()
	{
		String carname = model[random1];
		return carname;
	}
	public int speed()
	{
		if(random1 == 5 )
	{
		sendspeed = speedmax;
	}
	
	else
	{
		sendspeed = speed;
	}
		
		return sendspeed;
	}
	
	public int oil()
	{
		{
			if(random2 == 6 )
		{
				sendoil = oilmax;
		}
		
		else
		{
			sendoil = oil;
		}
			
			return sendoil;
		}
	}
	
}
