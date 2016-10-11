package c.impl.ch5;

import java.util.Scanner;

/*
 * practice1 题目：
输入 n 个整数，求这 n 个数之中的偶数平均值，并输出
 */
public class Practice1 {

	public static double compute(String[] s){
		int[] nums = new int[s.length];
		for(int i=0; i<s.length; i++){
			nums[i] = Integer.parseInt(s[i]);
		}
		
		int count = 0;
		int sum = 0;
		
		for(int n : nums){
			if(n%2 == 0){
				System.out.print(n + " ");
				sum += n;
				count++;
			}
		}
		return (double)sum/count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input number:");
		
		
		while(sc.hasNextLine()){
			
			String[] s = sc.nextLine().split(" ");
			
			System.out.println(compute(s));
		}
		sc.close();
		
	}

}
