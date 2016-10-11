package c.impl.ch3;

import java.util.Scanner;

/*
 * practice10 题目：
	输入任意大小的3个整数，判断其中是否有两个奇数一个偶数。
	若是则输出YES，不是则输 出NOT（要求用条件表达式进行判断，不使用if语句）
 */
public class Practice10 {

	public static boolean judge(int a, int b, int c){
		boolean  bool = (a%2==0)?((b%2!=0 && c%2!=0)?true:false):(b%2==0?(c%2==0?false:true):(c%2==0?true:false));
		
		return bool;
	}
	
	public static boolean judge2(int a, int b, int c){
		int oddCounter = 0;	//奇数计数变量
		
		oddCounter += a%2!=0 ? 1 : 0;
		oddCounter += b%2!=0 ? 1 : 0;
		oddCounter += c%2!=0 ? 1 : 0;
		
		return oddCounter==2 ? true : false;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("input 3 numbers:");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			//boolean bool = judge(a, b, c);
			boolean bool = judge2(a, b, c);
					
			if(bool){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}
