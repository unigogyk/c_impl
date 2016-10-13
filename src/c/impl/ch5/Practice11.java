package c.impl.ch5;

/*
 * practice11 题目：
输出九九乘法表。
 */
public class Practice11 {
	
	public static void printEndChar(){
		System.out.print(" |");
	}
	
	public static void printFormula(int i, int j){
		if(i*j>9)
			System.out.print(i + "*" + j + "=" + i*j);
		else
			System.out.print(i + "*" + j + "= " + i*j);
	}
	
	public static void printTable(){
		for(int i=1; i<=9; i++){
			for(int j=1; j<=i; j++){
				printFormula(j,i);
				printEndChar();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printTable();
	}

}
