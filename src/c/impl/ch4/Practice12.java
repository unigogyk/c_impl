package c.impl.ch4;

/*
 * practice12 题目：
要求输入 x 的值，输出 y 的值。分别用不嵌套的 if 语句，嵌套的 if 语句，switch语句编写。
 */
public class Practice12 {
	
	//不嵌套的 if 语句
	public static int computeY(int x){
		int y = 0;
		if(x == 0){
			 y = x;
		} else if(x>-5 && x <0){
			y = x-1;
		} else if(x>0 && x<8){
			y = x+1;
		}	
		return y;
	}
	
	//嵌套的 if 语句
	public static int computeY2(int x){
		int y = 0;
		if(x > -5){
			if(x < 0){
				y = x - 1;
			}
			else if(x == 0){
				y = x;
			}
			else if(x < 8){
				y = x + 1;
			}
		}
		return y;
	}
	
	//switch语句
	public static int computeY3(int x){
		int y = 0;
		
		int m = 0;
		if(x>-5 && x<8){
			if(x == 0){
				m=0;
			}else if(x < 0){
				m = -1;
			} else{
				m = 1;
			}
		}
		
		switch(m){
		case -1:
			y = x -1;break;
		case 0:
			y = x; break;
		case 1:
			y = x+1; break;
		}
		
		return y;
	}

	public static void main(String[] args) {
		int x = 9;
		System.out.println(computeY(x));
		System.out.println(computeY2(x));
		System.out.println(computeY3(x));
	}

}
