/*
Author:Chen Yihao
Date:2019/9/15
Content:Convert minutes to days and years(把分钟转化为年数和天数)
*/
package ch01.Exer1_4;
import java.util.Scanner;

public class CalYears{
	public static void main(String args[])
	{
		System.out.println("请输入分钟数");
		Scanner sc=new Scanner(System.in);
		int Minutes=sc.nextInt();
		double Days=Minutes/60/24;
		double Years=Days/365;
		
		sc.close();
		
		System.out.print(Minutes+"分钟是"+Days+"天，");
		System.out.println(Years+"年");
	}
}
