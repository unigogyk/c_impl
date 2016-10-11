package c.impl.ch4;

/*
 * practice9 题目：
输入某个点 A 的平面坐标 (x,y)，判断（输出）A点是在圆内、圆外还是在圆周上，其中圆心坐标为 (2,2)，半径为 1。
 */
public class Practice9 {
	
	//圆心(x,y)
	private int x;
	private int y;
	
	//半径
	private int R;
	
	public Practice9(int x, int y, int r){
		System.out.println("set Yuan xin");
		this.x = x;
		this.y = y;
		this.R = r;
	}
	
	public void setYuanXin(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public double computeDistance(int pointX, int pointY){
		
		return Math.sqrt(Math.pow((pointX-x), 2) + Math.pow((pointY-y), 2));
	}
	
	public LocationEnum computeLocation(double distance){
		if(distance > R)
			return LocationEnum.outer;
		else if(distance < R)
			return LocationEnum.inner;
		else
			return LocationEnum.edge;
	}

	public static void main(String[] args) {
		Practice9 p = new Practice9(2, 2, 1);
		
		double d = p.computeDistance(2, 1);
		LocationEnum e = p.computeLocation(d);
		
		switch(e){
		case inner:
			System.out.println("inner");
			break;
		case edge:
			System.out.println("edge");
			break;
		case outer:
			System.out.println("outer");
			break;
		}
	}

}

enum LocationEnum {
    inner, edge, outer;
}
