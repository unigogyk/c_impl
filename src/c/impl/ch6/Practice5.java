package c.impl.ch6;

/*
 * practice5 题目：
已知二阶Fibonacci数列，定义递归函数求Fib(n)。
 */
public class Practice5 {

	//方法1：递归
	public static int fib(int n){
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		
		return fib(n-1) + fib(n-2);
	}
	
	//方法2：循环
	public static int fib2(int n){
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		
		int p1 = 0;
		int p2 = 1;
		
		int count = 0;
		int result = 0;
		
		//0 1 1 2 3 5 8 13 21
		while(count < n-1){
			result = p1 + p2;
			p1 = p2;
			p2 = result;
			
			count++;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(fib(5));
		System.out.println(fib2(5));
		
		System.out.println(fib(8));
		System.out.println(fib2(8));
	}

}
