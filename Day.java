/**
 * 
 * @author jl23868
 * Name: Jae Young Lim
 * Date: 28 Apr 2015
 * This program is, if the user set the current day, to calculate each 'next day', 'previous day', and '4 next day' from the current day that user set.   
 * 
 */
public class Day {
	private	String day;
	private String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	/**
	 * initialize to Monday
	 */
	public void Day() {
		this.day = "Monday";
	}
	/**
	 * initialize day of the week
	 * @param day of the week
	 */
		
	public Day(String day) {		
		super();
		this.day = day;
	}
	/**
	 * return current day
	 * @return get the current day
	 */
	
	public String getDay() {
		return day;
	}
	/**
	 * 
	 * @param day
	 */
	
	public void setDay(String day) {
		this.day = day;
	}
	/**
	 * 
	 * @param numOfDays
	 * @return
	 */
	
	public String calculateDay(int numOfDays) {
		String message = "";
		int dayIndex = getDayIndex(this.day);
		if(dayIndex!=-1) {
			//%7 to loop back to beginning index of days array tp prevent
			//index out of bounds errors
			message = days[(dayIndex+numOfDays)%7];			
		} else {
			message = "Invalid Day!";
		}
		return message;
	}
	/**
	 * 
	 * @return
	 */
	
	public String previousDay() {
		return calculateDay(-1+7);
	}
	/**
	 * 
	 * @return
	 */
	
	public String nextDay() {
		return calculateDay(1);
	}
	/**
	 * 
	 * @param day
	 * @return
	 */
	
	private int getDayIndex(String day) {
		for(int i=0; i<days.length; i++) {
			if (days[i]==this.day) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * 
	 */
	
	public String toString() {
		return "[" + day + "]";
	}

}
