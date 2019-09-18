/*
Editor:Chen Yihao
Date:2019/9/15
Content:Improve the calculator's functions of(完善计算器功能)
*/

//package ch01.Exer1_5;

public class TestCalculator
{
	public static void main(String args[])
	{
		Calculator cal=new Calculator(5);
		
		cal.add(4);
		System.out.println(cal.getResult());
		
		cal.substract(5);
		System.out.println(cal.getResult());
		
		cal.multiply(3);
		System.out.println(cal.getResult());
		
		cal.divide(2);
		System.out.println(cal.getResult());
		
		cal.square();
		System.out.println(cal.getResult());
		
		cal.power(3);
		System.out.println(cal.getResult());
		
		cal.clear();
		System.out.println(cal.getResult());
	}
}

class Calculator {

    public static double result; // 静态变量，用于存储运行结果
	
	public Calculator(double result){
		this.result=result;
	}

    public void add(double n) {

        result = result + n;

    }

    public void substract(double n) {

        result = result - n;  

    }

    public void multiply(double n) {
		
		result=result*n;

    }         // 此方法尚未写好，请补充

    public void divide(double n) {
		
		result=result/n;

    	          // 此方法尚未写好，请补充
    }

    public void square() {
		
		result=Math.pow(result,2);

    	         // 此方法尚未写好，请补充
    }

    public void power(double n) {
		
		result=Math.pow(result,n);

             // 此方法尚未写好，请补充
    }

    public void clear() {     // 将结果清零

        result = 0;

    }

    public double getResult() {

        return result;

    }

	
}

