package c.impl.ch7;

/*
 * Practice8:
编写程序，将两个字符串连接起来，不要使用 strcat 函数。
 */
public class Practice8 {
	
	public static String concat(String s1, String s2){
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		char[] result = new char[arr1.length + arr2.length];
		int idx = 0;
		int i=0;
		int j=0;
		
		while(i < arr1.length){
			result[idx] = arr1[i];
			idx++;
			i++;
		}
		
		while(j < arr2.length){
			result[idx] = arr2[j];
			j++;
			idx++;
		}
		
		return String.valueOf(result);
	}

	public static void main(String[] args) {
		System.out.println(concat("abc", "def"));
		System.out.println(concat("abc", ""));
		System.out.println(concat("", "def"));
		System.out.println(concat("", ""));
	}

}
