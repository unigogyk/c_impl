package c.impl.ch5;

/*
 * practice9 题目：
计算斐波那契分数序列前n项之和（n是某个常数，波那契分数序列为2/1，3/2，5/3，8/5，...）。
 */
public class Practice9 {
	
	//按斐波那契序列顺序，从前往后计算
	public static double compute(int n){
		int loop = 1;	//循环次数
		
		//序列为：1、2、3、5、8、13.....
		int pre1 = 2;	//前一项 f(n-1)
		int pre2 = 1;	//前两项 f(n-2)
		
		double result = 0.0;
		
		while(loop <= n){
			result += (double)pre1/pre2;
			
			int temp = pre1 + pre2;
			pre2 = pre1;
			pre1 = temp;
					
			loop++;
		}
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(compute(5));
	}

}
