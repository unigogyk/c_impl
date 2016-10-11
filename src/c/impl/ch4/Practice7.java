package c.impl.ch4;

import java.util.Scanner;

/*
 * practice7 题目：
输入两个字符，若这两个字符的序号（ASCII码）之差为偶数，则输出它们的后继字符，否则输出它们的前驱字符
 */
public class Practice7 {
	
	public static char getPreChar(char ch){
		if(ch == 'a')
			return 'a';
		else if(ch == 'A')
			return 'A';
		else
			return (char)((int)ch-1);
	}
	
	public static char getNextChar(char ch){
		if(ch == 'z')
			return 'z';
		else if(ch == 'Z')
			return 'Z';
		else
			return (char)((int)ch + 1);
	}

	//判断两个字符ASCII码之差是否为偶数
	public static boolean isEven(char a, char b){
		int asciiA = (int)a;
		int asciiB = (int)b;
		
		if(Math.abs(asciiB - asciiA) % 2 == 0)
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a;
		char b;
		
		while(sc.hasNext()){
			a = sc.next().charAt(0);
			b = sc.next().charAt(0);
			
			//System.out.println(a + " " + b);
			
			if(isEven(a, b))
				System.out.println(getNextChar(a) + " " + getNextChar(b));
			else
				System.out.println(getPreChar(a) + " " + getPreChar(b));
		}
	}

}
