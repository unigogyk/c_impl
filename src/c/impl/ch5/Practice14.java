package c.impl.ch5;

/*
 * practice14 题目：
编写程序按下列公式计算e的值（精度为1e-6）。
e=1+1/1!+1/2!+1/3!...+1/n!
 */
public class Practice14 {
	
	public static double compute(){
		double e = 1.0;
		double t = 1;
		
		while(1/t > 0.000001){
			e += 1/t;
			t = t*(t+1);
		}
		return e;
	}
	
	public static double test(){
		int i;
	    double e=0,t=1;
	    for(i=1;t>0.000001;i++)
	    {
	        for(int j=1;j<=i;j++)
	        	t*=j;
	        t=(double)1/t;
	        e+=t;
	    }

		return e;
	}

	public static void main(String[] args) {
		System.out.println(compute());
		System.out.println(test());
	}

}
