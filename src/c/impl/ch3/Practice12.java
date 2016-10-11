package c.impl.ch3;

import java.util.Scanner;

/*
 * practice12 题目：
	输入三角形的边长，求三角形面积（面积＝sqrt(s(s-a)(s-b)(s-c)),s=(a+b+c)/2）
 */
public class Practice12 {

	public static double getTriangleArea(double a, double b ,double c){
		double s = (a+b+c)/2;
		
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		return area;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("input 3 numbers:");
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double area = getTriangleArea(a, b, c);
			
			System.out.println(area);
		}
	}

}
