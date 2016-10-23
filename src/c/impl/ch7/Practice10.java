package c.impl.ch7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Practice10:
 从键盘输入 10 个字符串，找出一个最长的字符串。
 */

public class Practice10 {
	
	public static String findString(List<String> list){
		int maxLength = 0;
		String result = null;
		
		for(String s : list){
			if(s.length() > maxLength){
				maxLength = s.length();
				result = s;
			}
		}
			
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input String:");
		List<String> list = new ArrayList<String>();
		
		while(true){
			String t = sc.next();
			if(t.equals("null")){
				break;
			}
			list.add(t);
		}
		System.out.println(findString(list));
	}

}
