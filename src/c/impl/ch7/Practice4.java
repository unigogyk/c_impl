package c.impl.ch7;

import java.util.Scanner;

/*
 * practice4:
求一组成绩的平均分数以及高于平均分的成绩，设给定的成绩为 90,85,92,77,80,62。

题目修改：
输入一组成绩，求平均分数以及高于平均分的成绩
 */
public class Practice4 {
	
	public static void compute(int... T){
		int sum = 0;
		for(int i : T){
			sum += i;
		}
		System.out.println(sum);
		double avg = (double)sum/T.length;
		System.out.println("avg: " + avg);
		
		for(int i : T){
			if(i > avg)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		String g = "90 80 70 60 50";
		String[] m = g.split(" ");
		for(String a : m)
			System.out.println(a);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input scores:");
		while(sc.hasNextLine()){
			String[] s = sc.nextLine().split(" ");
			int[] t = new int[s.length];
			for(int i=0; i<s.length; i++){
				t[i] = Integer.parseInt(s[i]);
			}
			
			compute(t);
		}
	}

}
