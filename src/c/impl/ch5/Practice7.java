package c.impl.ch5;

/*
 * practice 题目：
求爱因斯坦数学题。有一条长阶，
若每步跨2阶，则最后剩1阶，
若每步跨3阶，则最后剩2阶，
若每步跨5阶，则最后剩4阶，
若每步跨6阶，则最后剩5阶，
若每步跨7阶，最后正好1阶。
*/
public class Practice7 {

	public static void compute(){
		int x = 0;
		while(true){
			if(x%2==1 && x%3==2 && x%5==4 && x%6==5 && x%7==1){
				System.out.println(x);
				break;
			}
			x++;
		}
	}
	
	public static void main(String[] args) {
		compute();
	}

}
