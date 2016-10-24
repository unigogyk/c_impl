package c.impl.ch8;

import java.util.Scanner;

/*
 * Practice5:
编程将从键盘输入的每个单词的第一个字母转换为大写字母，输入时各单词必须用空格隔开，用“.”结束输入。
 */
public class Practice5 {

	public static String convert(String[] s) {
		for (int i = 0; i < s.length; i++) {
			char[] c = s[i].toCharArray();
			c[0] = (char) (c[0] - 32);
			s[i] = String.valueOf(c);
		}

		String g = "";
		for (String a : s)
			g += a + " ";

		return g;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("input words:");
		while (sc.hasNextLine()) {
			String[] s = sc.nextLine().split(" ");

			System.out.println(convert(s));
		}
	}

}
