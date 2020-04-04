package ptr04_FileIo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class File {
	Scanner s1 = new Scanner(System.in);
	
	public void load()
	{
		String fileName;
		InputStream in = null;
		DataInputStream datain = null;
		
		System.out.println("불러올 파일의 이름을 입력하십시오. --( 오직영어로, .txt 확장자 제외 )--");
		fileName = s1.next();
		
		try {
			in = new FileInputStream("C:\\java\\ptj2_ex\\"+fileName+".txt");
			datain = new DataInputStream(in);
			
			System.out.println(datain.readUTF());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try{if(datain != null) datain.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			try {if(in != null) in.close();
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}
	}

	
	public void output()
	{
		String fileName;
		String str;
		OutputStream out = null;
		DataOutputStream dataout = null;
		System.out.println("복사할 파일의 이름을 입력하십시오. --( 오직영어로, .txt 확장자 제외 )--");
		fileName = s1.next();
		
		System.out.println("내용을 입력해주십시오.");
		str = s1.next();
		
		try {
			out = new FileOutputStream("C:\\java\\ptj2_ex\\"+fileName+".txt");
			dataout = new DataOutputStream(out);
			
			dataout.writeUTF(str);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			
			try {
				if(dataout != null) dataout.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			try {
				if(out != null) out.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}
	
	public void copy()
	{
		String fileName;
		InputStream in = null;
		DataInputStream datain = null;
		
		OutputStream out = null;
		DataOutputStream dataout = null;
		
		String str;
		
		System.out.println("복사할 파일의 이름을 입력하십시오. --( 오직영어로, .txt 확장자 제외 )--");
		fileName = s1.next();
		
		try {
			in = new FileInputStream("C:\\java\\ptj2_ex\\"+fileName+".txt");
			datain = new DataInputStream(in);
			
			str = datain.readUTF();
			
			out = new FileOutputStream("C:\\java\\ptj2_ex\\"+fileName+"Copy.txt");
			dataout = new DataOutputStream(out);
			
			dataout.writeUTF(str);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally {
			
			try { if(datain != null)
			{
				datain.close();
			}
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			try {
				if(in != null)
				{
					in.close();
				}
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			try {
				if(dataout != null)
				{
					dataout.close();
				}
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			try {
				if(out != null)
				{
					out.close();
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
	}
}
