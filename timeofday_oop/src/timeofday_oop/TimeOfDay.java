package timeofday_oop;

public class TimeOfDay {
	/**
	 * @invar {@code hours) is between 0 and 23
	 *     | 0 <= minutesSinceMidnight && minutesSinceMidnight < 24 * 60
	 */
	private int minutesSinceMidnight;
	
	public int getHours() {
		return minutesSinceMidnight / 60;
	}
	
	public int getMinutes() {
		return minutesSinceMidnight % 60;
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
		this.minutesSinceMidnight = getMinutes() + value * 60;
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
		this.minutesSinceMidnight = getHours() * 60 + value;
	}
}
