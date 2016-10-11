package c.impl.ch3;

import java.util.Scanner;

/*
 * practice11 题目：
	求前驱字符和后继字符。
	输入一个字符，找出它的前驱字符和后继字符，并按ASCII码值，
	按从大到小的顺序输出这3个字符及其对应的ASCII码值
 */
public class Practice11 {
	
	public static char getPreChar(char ch){
		char preChar;
		
		if(ch == 'a')
			preChar = 'a';
		else if(ch == 'A')
			preChar = 'A';
		else
			preChar = (char)((int)ch - 1);
		//System.out.println(preChar);
		
		return preChar;
	}
	
	public static char getNextChar(char ch){
		char nextChar;
		
		if(ch == 'z')
			nextChar = 'z';
		else if(ch == 'Z')
			nextChar = 'Z';
		else
			nextChar = (char)((int)ch + 1);
		
		return nextChar;
	}

	public static void main(String[] args) {
		/*int a = 97;
		System.out.println((char)a);
		
		char b = 'b';
		System.out.println((int)b);*/
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("input a char:");
			
			char ch = sc.nextLine().charAt(0);
			
			System.out.println(getNextChar(ch) + " " + (int)getNextChar(ch));
			System.out.println(ch + " " + (int)ch);
			System.out.println(getPreChar(ch) + " " + (int)getPreChar(ch));
		}
		
	}

}
