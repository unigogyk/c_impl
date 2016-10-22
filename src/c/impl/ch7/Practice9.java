package c.impl.ch7;

/*
 * Practice9:
输入一行字符串，统计该字符串中字符对 ab 的个数
 */
public class Practice9 {

	public static int countCharPair(String str){
		char[] arr = str.toCharArray();
		int count = 0;
		
		for(int i=0; i<arr.length-1; i++){
			if(arr[i] == 'a' && arr[i+1] == 'b')
				count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(countCharPair("abcdefabdeg"));
		System.out.println(countCharPair(""));
		System.out.println(countCharPair("dbdagdbldebabe"));
		System.out.println(countCharPair("dbdeaba"));
	}

}
