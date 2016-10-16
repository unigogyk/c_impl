package c.impl.ch6;

import java.util.Scanner;

/*
 * practice3 题目：
按照第5章第8题的要求编写判断水仙花数的函数，从主函数输入正整数n，
在主函数中调用判断水仙花数的函数，找出n以内所有的水仙花数。
【输入一个3位数，判断是否是一个“水仙花数”。
水仙花数是指3位数的各位数字的立方和等于这个3位数本身。例如，153＝1*1*1+5*5*5+3*3*3】
 */
public class Practice3 {
	
	public static boolean isShuiXianHua(int n){
		if(n <= 100)
			return false;
		
		int result = 0;
		int square = 0;
		int m = n;
		
		if(n < 1000){
			square = 3;
		} else if(n < 10000){
			square = 4;
		} else if(n < 100000){
			square = 5;
		}
		
		while(m%10 != 0 || m/10 != 0){
			result += Math.pow(m%10, square);
			m = m/10;
		}
		
		if(result == n)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input a number:");
		while(sc.hasNextLine()){
			int n = sc.nextInt();
			
			for(int i=1; i<=n; i++){
				//System.out.println("validate " + i + "...");
				if(isShuiXianHua(i)){
					System.out.println(i);
				}
			}
		}
	}

}
