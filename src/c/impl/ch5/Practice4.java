package c.impl.ch5;

import java.util.Scanner;

/*
 * practice 题目：
输入一个字符串，将其中的大写字母改为小写字母，小写字母改为大写字母，然后输出。
 */
public class Practice4 {

	public static char invertChar(char ch){
		if(ch >= 65 && ch <= 90){
			ch = (char)((int)ch + 32);
		} else{
			ch = (char)((int)ch - 32);
		}
		return ch;
	}
	
	public static char invertChar2(char ch){
		if(ch > 'A' && ch < 'Z'){
			ch = (char)(ch + 32);	//char类型可以直接和int类型运算
		} else{
			ch = (char)(ch - 32);
		}
		
		return ch;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		while(sc.hasNextLine()){
			str = sc.nextLine();
			
			for(char ch : str.toCharArray()){
				//ch = invertChar(ch);
				ch = invertChar2(ch);
				System.out.print(ch);
			}
		}
	}

}
