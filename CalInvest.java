/*
Editor:Chen Yihao
Date:2019/9/15
Content:Calculate future Investment Value(计算未来投资值)
*/

package ch01.Exer1_3;
import java.util.Scanner;

public class CalInvest{
	public static void main(String args[]){
		System.out.println("请输入投资总额、年利率和年数");
		Scanner sc=new Scanner(System.in);
		double SumValue=sc.nextFloat();
		double Rate=sc.nextFloat();
		double Years=sc.nextFloat();
		
		sc.close();
		double Future=SumValue*(Math.pow(1+Rate/12,Years*12));
		System.out.println(Future);
	}
}