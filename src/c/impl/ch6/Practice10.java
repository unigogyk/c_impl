package c.impl.ch6;

/*
 * practice10:
设计程序完成下列计算。
已经：y=f(x,n)/(f(x+2.3,n)+f(x-3.2,n+3))

其中：f(x,n)=1-x2/2!+x4/4-...+(-1)n•x2n/(2n)! (n≥0)

当：　x=5.6, n=7时，求：y
 */
public class Practice10 {
	
	//y
	public static double getY(double x, int n){
		return f(x, n)/(f(x+2.3,n)+f(x-3.2,n+3));
	}

	// f(x,n)
	public static double f(double x, int n) {
		double result = 1.0;
		int flag = -1;
		int i = 1;

		while (i <= n) {
			result = result + flag * (x * 2) / getFac(2 * i);
			i++;
			flag = flag * -1;
		}

		return result;
	}

	// 求阶乘
	public static int getFac(int n) {
		int result = 1;

		while (n >= 1) {
			result = result * n;
			n--;
		}
		return result;
	}

	public static void main(String[] args) {
		// System.out.println(getFac(1));
		// System.out.println(getFac(3));
		// System.out.println(getFac(5));

		System.out.println(getY(5.6,7));
	}

}
