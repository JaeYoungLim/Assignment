
public class DayDriver {
	
	public static void main(String [] args) {
		Day day = new Day("Monday");
		System.out.println("Current Day: " + day);
		System.out.println("Next Day: " + day.nextDay());
		System.out.println("Previous Day: " + day.previousDay());
		System.out.println("4 next Day: " + day.calculateDay(4));		
	}

}
