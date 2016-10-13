package c.impl.ch5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * practice12 题目：
输入一串字符，直到输入一个星号为止，
统计（输出）其中的正整数和负整数个数以及所有正整数的平均值和所有负整数的平均值。
 */
public class Practice12 {

	public static double compute(List<Integer> list){
		if(list.size() == 0)
			return 0.0;
		
		int result = 0;
		
		for(Integer i : list){
			result += i;
		}
		
		return (double)result/list.size();
	}
	
	public static void main(String[] args) {
		List<Integer> posList = new ArrayList<Integer>();
		List<Integer> negList = new ArrayList<Integer>();
		
		int tmp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("input numbers:");
		while(sc.hasNextLine()){
			String s = sc.nextLine();
			if(s.equals("*"))
				break;
			tmp = Integer.parseInt(s);
			if(tmp < 0)
				negList.add(tmp);
			else
				posList.add(tmp);
		}
		
		System.out.println("pos: " + compute(posList));
		System.out.println("neg: " + compute(negList));
	}

}
