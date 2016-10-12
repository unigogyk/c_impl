package c.impl.ch5;

import java.util.Scanner;

/*
 * practice10 题目：
输入一个正整数，各输出n行的正（倒）三角形宝塔图案。
 */
public class Practice10 {

	public static void printBlank(int n){
		while(n > 0){
			System.out.print(" ");
			n--;
		}
	}
	
	public static void printStar(){
		System.out.print("*");
	}
	
	public static void printLine(int n){
		if(n == 1){
			printStar();
		} else {
			while(n > 1){
				printStar();
				printBlank(1);
				n--;
			}
			printStar();
		}
	}
	
	//打印正三角形
	public static void printTriangle(int n){
		for(int i=1; i<=n; i++){
			printBlank(n-i);
			printLine(i);
			System.out.println();
		}
	}
	//打印倒三角形
	public static void printTriangleReverse(int n){
		for(int i=n; i>=1; i--){
			printBlank(n-i);
			printLine(i);
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		while(sc.hasNextLine()){
			n = sc.nextInt();
			
			printTriangle(n);
			System.out.println();
			printTriangleReverse(n);
		}
	}

}
