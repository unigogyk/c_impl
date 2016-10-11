package c.impl.ch3;

import java.util.Scanner;

/*
 * practice8 题目：
	输入一个数，计算以这个数为半径的圆周长和面积。
 */
public class Practice8 {
	
	private static double PI = 3.14;

	//用户输入
	public static double getInputR(Scanner sc){
		double r = 0.0;
		
		while(true){
			String s = sc.nextLine();
			if(s.equals("0")){
				System.out.println("END!");
				System.exit(0);
			}
			try{
				r = Double.parseDouble(s);
				if(r < 0){
					System.out.println("The R should greater than 0");
					continue;
				}
			}catch(Exception e){
				System.out.println("Input ERROR!");
				System.out.println(e.getStackTrace());
				//System.exit(1);
				continue;
			}
			break;
		}
		return r;
	}
	

	//计算圆周长
	public static double getCircumference(double r){
		
		return 2*PI*r;
	}
	
	//计算面积
	public static double getArea(double r){
		
		return PI*r*r;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = 0.0;
		
		while(true){
			r = getInputR(sc);
			
			System.out.println("Circumference :");
			System.out.println(getCircumference(r));
			
			System.out.println("Area :");
			System.out.println(getArea(r));
		}
	}

}
