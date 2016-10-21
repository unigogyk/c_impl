package c.impl.ch7;

/*
 * Practice7:
通过键盘给 3×4 的二维数组输入数据，然后分别按行和按列输出数组元素。
 */
public class Practice7 {

	// 按行打印数组
	public static void printByRow(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 按列打印数组
	public static void printByCol(int[][] a){
		int row = a.length;
		int col = a[0].length;

		//注意内外层循环中，col和row的位置
		for(int i=0; i<col; i++){
			for(int j=0; j<row; j++){
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int t=1;
		int[][] a = new int[3][4];
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				a[i][j] = t;
				t++;
			}
		}
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		printByRow(a);
		System.out.println();
		printByCol(a);
	}

}
