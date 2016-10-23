package c.impl.ch7;

/*
 * Practice11:
已知数组 a 中有 m 个按升序排列的元素，数组 b 中有 n 个按降序排列的元素，编程将 a 与 b 中的所有元素按降序存入数组 c 中。
【提示】将 a 中的元素最大值与 b 中元素最大值相比，将最大值存入 c 数组中，然后调整 c 、a 或 b 元素指针(地址)，依次重复前序工作，即可。

 */
public class Practice11 {
	
	public static int[] mergeArray(int[] a, int[] b){
		int idxa = a.length-1;
		int idxb = 0;
		int[] c = new int[a.length + b.length];
		
		for(int i=0; i < c.length; i++){
			if(idxa >= 0 && idxb < b.length){
				if(a[idxa] >= b[idxb]){
					c[i] = a[idxa];
					idxa--;
				} else {
					c[i] = b[idxb];
					idxb++;
				}
			} else{
				if(idxa < 0){
					c[i] = b[idxb];
					idxb++;
				} else{
					c[i] = a[idxa];
					idxa--;
				}
			}
		}
		
		return c;
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {6,5,4,3};
		int[] c = mergeArray(a, b);
		
		for(int i : c)
			System.out.print(i + " ");
	}

}
