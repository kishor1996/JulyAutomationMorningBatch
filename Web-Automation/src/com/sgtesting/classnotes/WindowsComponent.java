package com.sgtesting.classnotes;
public class WindowsComponent
{
	public static void main(String args[])
	{
		try
		{
		Runtime.getRuntime().exec("E:\\New folder\\Test1.exe");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}