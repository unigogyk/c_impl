package c.impl.ch6;

import java.util.Scanner;

/*
 * practice8:
如果有两个数，每一个数的所有约数（除了它本身以外）的和正好等于对方，则称这两个数为互满数，
求出30000以内所有的互满数，并显示输出，求一个数它的所有约数（除了它本身以处）的和，用函数实现。
 */
public class Practice8 {
	
	//求一个数所有约数的和
	public static int getYueShu(int n){
		int result = 0;
		
		for(int i=1; i < n; i++){
			if(n%i == 0)
				result += i;
		}
		
		return result;
	}

	//求n以内的所有互满数
	public static void compute(int n){
		for(int i=1; i<=n; i++){
			for(int j=i+1; j<=n; j++){
				if(getYueShu(i) == j && i == getYueShu(j)){
					System.out.println(i + " " + j);
				}
			}
		}
	}
	
	//方法2
	public static void compute2(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<i; j++){
				if(getYueShu(i) == j && i == getYueShu(j)){
					System.out.println(j + " " + i);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input a number:");
		while(sc.hasNextLine()){
			int n = sc.nextInt();
			compute(n);
			System.out.println("------");
			compute2(n);
			System.out.println("end");
		}
	}

}
