package c.impl.ch5;

import java.util.Scanner;

/*
 * practice2 题目：
输入一串字符，直到输入一个星号（＊）为止，统计（输出）其中的字母个数和数字字符个数。
 */
public class Practice2 {

	public static void computeChar(char[] arr){
		int charNums = 0;
		int nNums = 0;
		int i = 0;
		
		while(i < arr.length){
			if(arr[i]>='a' && arr[i]<='z' || arr[i]>='A'&& arr[i]<='Z')
				charNums++;
			else if(arr[i] >='0' && arr[i] <= '9')
				nNums++;
			i++;
		}
		System.out.println(charNums);
		System.out.println(nNums);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		char ch;
		int i=0;
		char[] arr = new char[100];
		
		System.out.println("input:");
		while (sc.hasNextLine()) {
			ch = sc.next().charAt(0);
			
			if(ch == '*')
				break;

			arr[i] = ch;
			i++;
		}
		computeChar(arr);
	}

}
