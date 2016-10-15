package c.impl.ch6;

import java.util.Scanner;

/*
 * practice2 题目：
编写一个函数，由参数传入一个字符串，统计此字串中字母、数字和其他字符的个数，在主函数中输入字符串并显示统计结果。
 */
public class Practice2 {
	
	public static int[] statics(String s){
		int[] result = new int[3];
		char[] arr = s.toCharArray();
		
		for(int i=0; i<s.length(); i++){
			if((arr[i] >= 'A' && arr[i] <= 'Z') || (arr[i] >= 'a' && arr[i] <= 'z'))
				result[0] += 1;
			else if(arr[i] >= '0' && arr[i] <= '9')
				result[1] += 1;
			else
				result[2] +=1;
		}
		
		return result; 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()){
			String s = sc.next();
			int[] a = statics(s);
			System.out.print(a[0] + " " + a[1] + " " + a[2]);
		}
	}

}
