package Training;

import java.util.Calendar;

public class GithubWork1 {
	public static void main(String[] args) {
		
		work1();

	}

	public static void work1() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 1);
		int year = c.get(Calendar.YEAR);
	    int month = c.get(Calendar.MONTH) + 1;
	    int day = c.get(Calendar.DATE);
		
		System.out.println("今日は"+year+"年"+ month+"月"+day+"日です。");
		
	}
}
