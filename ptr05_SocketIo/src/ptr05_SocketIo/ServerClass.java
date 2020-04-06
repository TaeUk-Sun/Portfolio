package ptr05_SocketIo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ServerClass {
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		InputStream inputStream = null;
		DataInputStream dataInputStream = null;
		
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;

		
		try {
			serverSocket = new ServerSocket(9000);
			System.out.println(" --서버 준비 완료-- ");
			
			socket = serverSocket.accept();
			System.out.println(" -- 클라이언트 입장 -- ");
			System.out.println("socket : " + socket);
			
			inputStream = socket.getInputStream();
			dataInputStream = new DataInputStream(inputStream);
			
			outputStream = socket.getOutputStream();
			dataOutputStream = new DataOutputStream(outputStream);
			
		
			
			while(true) {
		
				String getMsg = dataInputStream.readUTF();
				String date = dateUp();
				System.out.println("Client : " + getMsg +"\t\t" +date);				
				
				
				if(getMsg.equalsIgnoreCase("STOP")) break;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();			
		}
		finally
		{
			try {
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
				if(dataInputStream != null) dataInputStream.close();
				if(inputStream != null) inputStream.close();
				if(dataOutputStream != null) dataOutputStream.close();
				if(outputStream != null) outputStream.close();
			
				
				
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
