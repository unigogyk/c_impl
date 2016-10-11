package c.impl.ch5;

/*
 * practice6 题目：
输出1～999中能被3整除，而且至少有一位数字是5的所有数字
 */
public class Practice6 {
	
	public static boolean isContainFive(int num){
		int n = 0;
		while(num%10 != 0){
			n = num%10;
			
			if(n == 5){
				return true;
			}
			num /= 10;
		}
		
		return false;
	}

	public static void main(String[] args) {
		for(int i=1; i<=999; i++){
			if(i%3 == 0){
				if(isContainFive(i)){
					System.out.println(i);
				}
			}
		}
	}

}
