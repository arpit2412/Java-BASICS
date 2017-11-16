import java.io.*;
class FileSplit
{	
	public FileSplit (File file, long size, long length) 
	{
	try
	{
	FileInputStream fis = new FileInputStream(file);
	int ch=0,c=0,n=0;
	for(long i=0;i<length;i+=size)
	{
		n++;
	}
	String str1 = file.getName();
	String str2 = new String(); 
	FileOutputStream fos[] = new FileOutputStream[n];
	for(int i=0;i<n;i++)
	{
		str2 = (i+"."+str1);
		fos[i]= new FileOutputStream(str2);
	}
	int i=0;
	while(i<n)
	{
		while((ch=fis.read())!=-1)
		{
			fos[i].write(ch);
			c++;
			if(c>size-1)
			{
				c=0;
				break;
			}
		}
	i++;
	}
	fis.close();
	file.delete();
	}
	catch(Exception e)
	{
		e.getMessage();
	}

	}
	
}