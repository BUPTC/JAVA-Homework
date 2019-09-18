/*
Author:Chen Yihao
Date:2019/9/15
Content:Improve the calculator's functions完善计算器功能)
*/

package ch01.Exer1_5;

import java.util.Scanner;

public class TestCalculator
{
	public static void main(String args[])
	{	
		Calculator cal=new Calculator(0);
		System.out.println("请选择操作");
		System.out.println("1-加 2-减 3-乘 4-除 5-开方 6-乘方 7-清零 0-退出");
		Scanner sc=new Scanner(System.in);
		int cho=sc.nextInt();
		while(cho!=0)
		{
			switch(cho){
				case 1:
				{
					System.out.println("请输入第一操作数");
					double n1=sc.nextDouble();
					cal.result=n1;
					System.out.println("请输入第二操作数");
					double n2=sc.nextDouble();
					cal.add(n2);
					System.out.println(n1+"+"+n2+"="+cal.getResult());
					System.out.println("请选择操作");
					System.out.println("1-加 2-减 3-乘 4-除 5-开方 6-乘方 7-清零 0-退出");
					cho=sc.nextInt();
				}break;
				
				case 2:
				{
					System.out.println("请输入第一操作数");
					double n1=sc.nextDouble();
					cal.result=n1;
					System.out.println("请输入第二操作数");
					double n2=sc.nextDouble();
					cal.substract(n2);
					System.out.println(n1+"-"+n2+"="+cal.getResult());
					System.out.println("请选择操作");
					System.out.println("1-加 2-减 3-乘 4-除 5-开方 6-乘方 7-清零 0-退出");
					cho=sc.nextInt();
				}break;
				
				case 3:
				{
					System.out.println("请输入第一操作数");
					double n1=sc.nextDouble();
					cal.result=n1;
					System.out.println("请输入第二操作数");
					double n2=sc.nextDouble();
					cal.multiply(n2);
					System.out.println(n1+"*"+n2+"="+cal.getResult());
					System.out.println("请选择操作");
					System.out.println("1-加 2-减 3-乘 4-除 5-开方 6-乘方 7-清零 0-退出");
					cho=sc.nextInt();
				}break;
				
				case 4:
				{
					System.out.println("请输入第一操作数");
					double n1=sc.nextDouble();
					cal.result=n1;
					System.out.println("请输入第二操作数");
					double n2=sc.nextDouble();
					cal.divide(n2);
					System.out.println(n1+"/"+n2+"="+cal.getResult());
					System.out.println("请选择操作");
					System.out.println("1-加 2-减 3-乘 4-除 5-开方 6-乘方 7-清零 0-退出");
					cho=sc.nextInt();
				}break;
				
				case 5:
				{
					System.out.println("请输入第一操作数");
					double n1=sc.nextDouble();
					cal.result=n1;
					cal.square();
					System.out.println(n1+"的平方根="+cal.getResult());
					System.out.println("请选择操作");
					System.out.println("1-加 2-减 3-乘 4-除 5-开方 6-乘方 7-清零 0-退出");
					cho=sc.nextInt();
				}break;
				
				case 6:
				{
					System.out.println("请输入第一操作数");
					double n1=sc.nextDouble();
					cal.result=n1;
					System.out.println("请输入第二操作数");
					double n2=sc.nextDouble();
					cal.power(n2);
					System.out.println(n1+"的"+n2+"次方="+cal.getResult());
					System.out.println("请选择操作");
					System.out.println("1-加 2-减 3-乘 4-除 5-开方 6-乘方 7-清零 0-退出");
					cho=sc.nextInt();
				}break;
				
				case 7:
				{
					cal.result=0;
					System.out.println("清零，结果="+cal.getResult());
					System.out.println("请选择操作");
					System.out.println("1-加 2-减 3-乘 4-除 5-开方 6-乘方 7-清零 0-退出");
					cho=sc.nextInt();
				}break;
			}
		
		}
		
	}
}

class Calculator {
    public static double result; // 静态变量，用于存储运行结果
	
	public Calculator(double result){
		this.result=result;
	}

    public void add(double n) {  // +
        result = result + n;
    }

    public void substract(double n) {  // -
        result = result - n;  
    }

    public void multiply(double n) { // *		
		result=result*n;
    }         

    public void divide(double n) { // /	
		result=result/n; 	          
    }

    public void square() {  // 开方	
		result=Math.sqrt(result);	         
    }

    public void power(double n) { // 幂
		result=Math.pow(result,n);     
    }

    public void clear() {     // 将结果清零
        result = 0;
    }

    public double getResult() {
        return result;
    }	
}

