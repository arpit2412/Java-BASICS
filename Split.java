import java.io.*;

class Split
{
	public static void main(String args[]) throws IOException
	{
		Console con=System.console();
		System.out.print("enter the file name:");
		String str=con.readLine();
		System.out.print("enter the file size:");
		long size= Integer.parseInt(con.readLine());
		File file = new File(str);
		long length = file.length();
		
		FileSplit f = new FileSplit(file, size, length);
				
	}
}