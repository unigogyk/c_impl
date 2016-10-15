package c.impl.ch6;

import java.util.Scanner;

/*
 * practice 题目：
写两个函数，分别求两个整数的最大公约数和最小公倍数，
用主函数调用这两个函数，并输出结果。两个整数由键盘输入。
 */
public class Practice1 {
	
	//最大公约数
	public static int getGreatestCommonDivisor(int a, int b){
		int min = Math.min(a, b);
		int result = 0;
		
		for(int i=min; i>=1; i--){
			if(a%i==0 && b%i==0){
				result = i;
				break;
			}
		}
		return result;
	}
	
	//最小公倍数
	public static int getLeastCommonMultiple(int a, int b){
		int max = Math.max(a, b);
		int result = 0;
		
		int i = max;
		while(true){
			if(i%a==0 && i%b==0){
				result = i;
				break;
			}
			i++;
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		while(sc.hasNextLine()){
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println(getGreatestCommonDivisor(a, b));
			System.out.println(getLeastCommonMultiple(a, b));
		}
	}

}
