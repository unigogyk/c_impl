package c.impl.ch5;

import java.util.Scanner;

/*
 * practice 题目：
输入一个3位数，判断是否是一个“水仙花数”。
水仙花数是指3位数的各位数字的立方和等于这个3位数本身。例如，153＝1*1*1+5*5*5+3*3*3
 */
public class Practice8 {

	public static boolean isShuiXianHua(int num){
		int result = 0;
		int n = num;
		
		while(n%10 != 0){
			int m = n%10;
			result += Math.pow(m, 3);
			n = n/10;
		}
		System.out.println(result);
		
		if(num == result)
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.println("input a number:");
		while(sc.hasNextLine()){
			num = sc.nextInt();
			
			if(isShuiXianHua(num)){
				System.out.println(num + " is!");
			}else{
				System.out.println("Not");
			}
		}
	}

}
