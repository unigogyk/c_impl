package c.impl.ch5;

/*
 * practice13 题目：
一个整数等于该数所有因子之和，则称该数是一个完数。
例如，6和28都是完数。因为6＝1+2+3，28＝1+2+4+7+14。输出3位数中所有的完数。
 */
public class Practice13 {

	public static boolean isWanShu(int n){
		int result = 0;
		
		for(int i=1; i<=n/2; i++){
			if(n%i == 0)
				result += i;
		}
		
		if(n == result)
			return true;
		
		return false;
	}
	
	//找到完数，并输出其所有因子
	public static void test(){
		int k1 = 0;
		int k2 = 0;
		int k3 = 0;
		int k4 = 0;
		int k5 = 0;
		int k6 = 0;
		int k7 = 0;
		int k8 = 0;
		int k9 = 0;
		int k10 = 0;
	    int i,a,n,s;
	    for (a = 100; a <= 999; a++)
	    {
	        n = 0; /* n累计因子的个数 */
	        s = a; /* s存放未求出的因子之和,初值为被测数本身 */
	        for (i = 1; i < a; i++)
	        if (a % i == 0) /* 由i到a循环检测i是否为a的因子 */
	        {
	            n++; /* 找到一个因子 */
	            s = s - i; /* 减去已找到的因子 */
	            switch (n) /* 将找到的因子赋绐k1, k2, ... */
	            {
	                case 1 : k1 = i; break;
	                case 2 : k2 = i; break;
	                case 3 : k3 = i; break;
	                case 4 : k4 = i; break;
	                case 5 : k5 = i; break;
	                case 6 : k6 = i; break;
	                case 7 : k7 = i; break;
	                case 8 : k8 = i; break;
	                case 9 : k9 = i; break;
	                case 10 : k10 = i; break;
	            }
	        }
	        if (s == 0) /* 已经找到全部因子 */
	        {
	            System.out.println("%d Its factors are " + a);
	            if (n > 1) System.out.print(k1 + "," + k2); /* n>1表示a至少有2个因子 */
	            if (n > 2) System.out.print("," + k3); /* 注意以下if的用法,追加的方法 */
	            if (n > 3) System.out.print("," + k4);
	            if (n > 4) System.out.print("," + k5);
	            if (n > 5) System.out.print("," + k6);
	            if (n > 6) System.out.print("," + k7);
	            if (n > 7) System.out.print("," + k8);
	            if (n > 8) System.out.print("," + k9);
	            if (n > 9) System.out.print("," + k10);
	            System.out.println();
	        }
	    }

	}
	
	public static void main(String[] args) {
		System.out.println(isWanShu(6));
		System.out.println(isWanShu(28));
		System.out.println(isWanShu(27));
		for(int i=100; i<=999; i++){
			if(isWanShu(i))
				System.out.println(i);
		}
		test();
	}

}
