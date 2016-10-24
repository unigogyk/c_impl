package c.impl.ch8;

import java.lang.reflect.Array;
import java.util.Scanner;

/*
 * Practice8:
编写函数 fun，函数的功能是，从字符串中删除指定的字符。同一字母的大、小写按不同字符处理。
例如，程序执行时输入字符串为 turbo c and borland c++，从键盘输入字符 n，则输出后变为 turbo c ad borlad c++。
如果输入的字符在字符串中不存在，则字符串照原样输出。
 
 */
public class Practice4 {
	
	public static String fun(String s, char ch){
		char[] arr = s.toCharArray();
		int i=0;
		int j=0;
		int count = 0;
		
		while(i < arr.length){
			if(arr[i] == ch){
				i++;
				count++;
			} else {
				arr[j] = arr[i];
				i++;
				j++;
			}
		}
		
		char[] t = new char[arr.length - count];
		System.arraycopy(arr, 0, t, 0, arr.length-count);
		
		return String.valueOf(t);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = null;
		char ch;
		
		System.out.println("input a char:");
		while(sc.hasNextLine()){
			s = sc.next();
			ch = sc.next().charAt(0);
			
			System.out.println(fun(s, ch));
		}
	}

}
