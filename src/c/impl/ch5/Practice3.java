package c.impl.ch5;

import java.util.Scanner;

/*
 * practice3 题目：
从键盘输入一个正整数 n，计算该数的各位数字之和并输出。
例如，输入数是5246，则计算5+2+4+6＝17并输出。
 */
public class Practice3 {
	
	public static int compute(int num){
		String[] s = String.valueOf(num).split("");
		int result = 0;
		
		for(String str : s){
			result += Integer.parseInt(str);
		}
		return result;
	}
	
	public static int compute2(int num){
		int result = 0;
		
		while(num/10 != 0){
			result += num%10;
			num = num/10;
		}
		
		//注意边界条件
		result += num;
		
		return result;
	}
	
	public static int compute3(int num){
		int result = 0;
		
		while(num%10 != 0){
			result += num%10;
			num = num/10;
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int result = 0;

		System.out.println("input a number:");
		while(sc.hasNextLine()){
			num = sc.nextInt();
			result = compute3(num);
			
			System.out.println(result);
			
			num = 0;
			result = 0;
		}
	}

}
