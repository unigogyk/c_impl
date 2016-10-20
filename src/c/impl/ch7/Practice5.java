package c.impl.ch7;

import java.util.Scanner;

/*
 * Practice5:
编写程序，输入一组整数，将它们排序后由小到大输出。

【提示】假设为具有 10 个元素的正整数数组；外层循环从数组的第一个元素开始选取；
内层循环从外层循环选定的元素下一个元素开始选取，依次与外层循环选定的元素进行比较，将小者放入外层循环选定的元素中。
 */
public class Practice5 {

	// 冒泡
	public static void sortAndOutput(int... T) {
		for (int i = 1; i < T.length; i++) {
			for (int j = 0; j < T.length - 1; j++) {
				if (T[j] > T[j + 1]) {
					int tmp = T[j];
					T[j] = T[j + 1];
					T[j + 1] = tmp;
				}
			}
		}

		for (int i : T) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// 冒泡2 内层循环优化
	public static void sortAndOutput2(int... T) {
		for (int i = T.length-1; i >= 1 ; i--) {
			for (int j = 0; j < i; j++) {
				if (T[j] > T[j + 1]) {
					int tmp = T[j];
					T[j] = T[j + 1];
					T[j + 1] = tmp;
				}
			}
		}

		for (int i : T) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("input numbers:");
		while (sc.hasNextLine()) {
			String[] s = sc.nextLine().split(" ");
			int[] t1 = new int[s.length];
			
			for (int i = 0; i < s.length; i++) {
				t1[i] = Integer.parseInt(s[i]);
			}
			
			//数组深copy
			//int[] t2 = t1.clone();
			int[] t2 = new int[t1.length];
			System.arraycopy(t1, 0, t2, 0, t1.length);

			sortAndOutput(t1);

			sortAndOutput2(t2);
			System.out.println("input numbers:");
		}
	}

}
