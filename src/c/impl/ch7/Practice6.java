package c.impl.ch7;

/*
 * Practice6
从键盘输入一个4×4整数矩阵，以主对角线(\)为对称轴，将左下角元素中较大元素代替右上角对应元素，将右上角(含对角线元素)输出。
【提示】
a[0][0] a[0][1] a[0][2] a[0][3]
a[1][0] a[1][1] a[1][2] a[1][3]
a[2][0] a[2][1] a[2][2] a[2][3]
a[3][0] a[3][1] a[3][2] a[3][3]

e.g
1    2    3    4
5    6    7    8
9    10   11   12
13   14   15   16
----------------------
1    5    9    13
     6    10   14
          11   15
               16

 */
public class Practice6 {

	public static void coumpute() {
		int[][] a = new int[4][4];
		int t = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = t;
				t++;
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("===============");

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a[i].length; j++) {	//仔细考虑问什么j的初始值不能为0？
				if (a[i][j] < a[j][i]) {
					int tmp = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = tmp;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i <= j) {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println();
		}

		System.out.println("===============");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		coumpute();
	}

}
