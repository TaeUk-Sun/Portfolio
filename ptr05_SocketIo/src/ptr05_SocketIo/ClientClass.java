package ptr05_SocketIo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ClientClass {
	
	public static void main(String[] args) {
		
		Socket socket = null;
		
		InputStream inputStream = null;
		DataInputStream dataInputStream = null;
		
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		Scanner scanner = null;
		try {
			socket = new Socket("localhost", 9000);
			System.out.println(" -- 입장완료 --");
			
			outputStream = socket.getOutputStream();
			dataOutputStream = new DataOutputStream(outputStream);
			
			inputStream = socket.getInputStream();
			dataInputStream = new DataInputStream(inputStream);
			
			scanner = new Scanner(System.in);
			
			while(true)
			{
				System.out.println(" -- 메시지 입력 --");
				String sendMsg = scanner.next();
				dataOutputStream.writeUTF(sendMsg);
				dataOutputStream.flush();
				
				
				if(sendMsg.equalsIgnoreCase("STOP")) break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(socket != null) socket.close();
				if(dataInputStream != null) dataInputStream.close();
				if(inputStream != null) inputStream.close();
				if(dataOutputStream != null) dataOutputStream.close();
				if(outputStream != null) outputStream.close();
				if(scanner != null) scanner.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	private static String dateUp()
	{
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd HH:mm");
		String result = date.format(new Date());
		return result;
	}

}
