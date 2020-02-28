package timeofday_oop;

public class TimeOfDay {
	/**
	 * @invar {@code hours) is between 0 and 23
	 *     | 0 <= hours && hours <= 23 
	 */
	private int hours;
	/**
	 * @invar {@code minutes} is between 0 and 59
	 *     | 0 <= minutes && minutes <= 59
	 */
	private int minutes;
	
	public int getHours() {
		return this.hours;
	}
	
	public int getMinutes() {
		return this.minutes;
	}
	
	/**
	 * @post This object's hours equal the given hours
	 *     | getHours() == value
	 * @post This object's minutes have remained unchanged
	 *     | getMinutes() == old(getMinutes())
	 * @throws IllegalArgumentException if the given value is not between 0 and 23
	 *    | !(0 <= value && value <= 23)
	 */
	public void setHours(int value) {
		if (!(0 <= value && value <= 23))
			throw new IllegalArgumentException("value is out of range");
		this.hours = value;
	}
	
	/**
	 * @post This object's minutes equal the given minutes
	 *     | getMinutes() == value
	 * @post This object's hours have remained unchanged
	 *     | getHours() == old(getHours())
	 *     
	 * @throws IllegalArgumentException if the given value is not between 0 and 59
	 *    | !(0 <= value && value <= 59)
	 */
	public void setMinutes(int value) {
		if (!(0 <= value && value <= 59))
			throw new IllegalArgumentException("value is out of range");
		this.minutes = value;
	}
}
