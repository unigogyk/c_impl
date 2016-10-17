package c.impl.ch6;

/*
 * practice6 题目：
定义函数求F=(n+m)!+n!，m、n均为任意正整数。要求使用递归调用。
 */
public class Practice6 {
	
	public static int fib(int n){
		if(n == 0)
			return 1;
		if(n == 1)
			return 1;
		return fib(n-1) + fib(n-2);
	}
	
	//完全递归
	public static int compute(int m, int n){
		
		return fib(m+n)+fib(n);
	}
	
	public static int compute2(int m, int n){
		int a = fib(n);
		
		int t = m+n;
		int b = a;
		while(t > n){
			b = b * t;
			t--;
		}
		return b+a;
	}

	public static void main(String[] args) {
		System.out.println(fib(5));
		System.out.println(compute(3,2));
		System.out.println(compute2(3,2));
	}

}
