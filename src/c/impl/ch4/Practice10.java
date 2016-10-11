package c.impl.ch4;

/*
 * practice10 题目：
输入年号和月份，输出这一年该月的天数（一个年份，先判断是否闰年）
 */
public class Practice10 {
	
	
	public static boolean isRunYear(int year){
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {  
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int year = 2000;
		boolean b = isRunYear(year); 
		
		int days = 0;
		if(b){
			days = RunYear.YearDays();
		} else{
			days = PingYear.YearDays();
		}
		
		System.out.println(days);
	}

}

enum RunYear{
	January(MonthDays.BIG),
	February(MonthDays.RUNFEB),
	March(MonthDays.BIG),
	April(MonthDays.SMALL),
	May(MonthDays.BIG),
	June(MonthDays.SMALL),
	July(MonthDays.BIG),
	August(MonthDays.BIG),
	September(MonthDays.SMALL),
	October(MonthDays.BIG),
	November(MonthDays.SMALL),
	December(MonthDays.BIG);
	
	RunYear(MonthDays m){
	}

	public static int YearDays() {
		int days = 0;
		for(RunYear y : RunYear.values()){
			//days += y.;
		}
		return 0;
	}
}

enum PingYear{
	January(MonthDays.BIG),
	February(MonthDays.PingFEB),
	March(MonthDays.BIG),
	April(MonthDays.SMALL),
	May(MonthDays.BIG),
	June(MonthDays.SMALL),
	July(MonthDays.BIG),
	August(MonthDays.BIG),
	September(MonthDays.SMALL),
	October(MonthDays.BIG),
	November(MonthDays.SMALL),
	December(MonthDays.BIG);
	
	PingYear(MonthDays m){
	}

	public static int YearDays() {
		
		return 0;
	}
}

enum MonthDays{
	BIG(31), SMALL(30), PingFEB(28), RUNFEB(29);
	
	MonthDays(int i){		
	}
}


