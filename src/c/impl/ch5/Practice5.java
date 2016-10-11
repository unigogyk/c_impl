package c.impl.ch5;

/*
 * practice5 题目：
设某县2000年工业总产值为200亿元，如果该县预计平均年工业总产值增长率为4.5%，
那么多少年后该县年工业总产值将超500亿元
 */
public class Practice5 {

	public static void main(String[] args) {
		int count = 0;
		double price = 200;
		
		do{
			price *= (1+0.045);
			count++;
		}while(price <= 500);
		
		System.out.println(count);
	}

}
