/*
Editor:Chen Yihao
Date:2019/9/15
Content:Calculate future Investment Value(����δ��Ͷ��ֵ)
*/

package ch01.Exer1_3;
import java.util.Scanner;

public class CalInvest{
	public static void main(String args[]){
		System.out.println("������Ͷ���ܶ�����ʺ�����");
		Scanner sc=new Scanner(System.in);
		double SumValue=sc.nextFloat();
		double Rate=sc.nextFloat();
		double Years=sc.nextFloat();
		
		sc.close();
		double Future=SumValue*(Math.pow(1+Rate/12,Years*12));
		System.out.println(Future);
	}
}