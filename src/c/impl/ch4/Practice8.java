package c.impl.ch4;

import java.util.Scanner;

/*
 * practice8 题目：
输入整数 a 和 b ，如果 a 能被 b 整除，就输出算式和商，否则输出算式、整数商和余数
 */
public class Practice8 {

	//判断a能够被b整除
	public static boolean canBeDivide(int a, int b){
		if(a % b == 0)
			return true;
		
		return false;
	}
	
	public static void compute(int a, int b){
		if(canBeDivide(a, b)){
			System.out.println(a + "/" + b + "=" + a/b);
		} else {
			System.out.println(a + "/" + b + "=" + a/b + "..." + a%b);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		System.out.println("input 2 numbers:");
		while(sc.hasNext()){
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			compute(a, b);
			System.out.println("input 2 numbers:");
		}
	}

}
