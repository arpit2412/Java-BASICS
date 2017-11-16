import java.io.*;
class Merge
{
	public static void merger(File file1) throws Exception
	{
		String str = new String();
		String str2 = file1.getName();
		FileInputStream fis;
		FileOutputStream fos = new FileOutputStream(str2);
		for(int i=0;;i++)
		{
			str=(i+"."+str2);
			File f = new File(str);
			if(!f.exists())
				break;
			fis= new FileInputStream(str);
			int ch;
			while((ch=fis.read())!=-1)
			
				fos.write(ch);
			
		}
	}

public static void main(String args[])
{
	Console con =System.console();
	System.out.print("Enter file name:");
	String str=con.readLine();
	try
	{
	File file = new File(str);
	Merge.merger(file);
	}
	catch(Exception e)
	{
		e.getMessage();
	}
}
}