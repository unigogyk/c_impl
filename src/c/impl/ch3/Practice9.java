package c.impl.ch3;

import java.util.Scanner;

/*
 * practice9 题目：
	输入任意一个3位数，将其各位数字反序输出（例如输入123，输出321）
 */
public class Practice9 {

	public static int getInputNumber(Scanner sc){
		int number = 0;
		while(true){
			String s = sc.nextLine();
			if(s.equals("0")){
				System.out.println("END!");
				System.exit(0);
			}
			try{
				number = Integer.parseInt(s);
				if(number < 0){
					System.out.println("Should greater than 0");
					continue;
				}
			}catch(Exception e){
				System.out.println("Your input is ERROR!");
				continue;
			}
			break;
		}
		return number;
	}
	
	public static int reverseNumber(int n){
		String s = String.valueOf(n);
		String[] numArr = s.split("");
		
		int pre = 0;
		int rear = numArr.length-1;
		
		while(rear > pre){
			String temp = numArr[pre];
			numArr[pre] = numArr[rear];
			numArr[rear] = temp;
			
			pre++;
			rear--;
		}
		
		/*for(String t : numArr){
			System.out.print(t + " ");
		}
		System.out.println();*/
		
		int MaxBit = 0;
		int sum = 0;
		for(int i=0; i < numArr.length; i++){
			MaxBit = numArr.length - (i+1);
			sum += Integer.parseInt(numArr[i]) * Math.pow(10, MaxBit);
		}
		
		return sum;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true){
			int n = getInputNumber(sc);
			
			System.out.println(reverseNumber(n));
		}
	}

}
