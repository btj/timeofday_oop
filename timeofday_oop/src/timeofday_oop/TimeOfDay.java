package timeofday_oop;

/**
 * @invar This object's hours are between 0 and 23
 *     | 0 <= getHours() && getHours() <= 23 
 * @invar This object's minutes are between 0 and 59
 *     | 0 <= getMinutes() && getMinutes() <= 59
 */
public class TimeOfDay {
	/**
	 * @invar {@code hours} is between 0 and 23
	 *     | 0 <= minutesSinceMidnight && minutesSinceMidnight < 24 * 60
	 */
	private int minutesSinceMidnight;
	
	public int getHours() {
		return minutesSinceMidnight / 60;
	}
	
	public int getMinutes() {
		return minutesSinceMidnight % 60;
	}
	
	public TimeOfDay(int hours, int minutes) {
		if (!(0 <= hours && hours <= 23))
			throw new IllegalArgumentException("hours is out of range");
		if (!(0 <= minutes && minutes <= 59))
			throw new IllegalArgumentException("minutes is out of range");
		this.minutesSinceMidnight = hours * 60 + minutes;
	}
	
	/**
	 * @post This object's hours equal the given hours
	 *     | result.getHours() == value
	 * @post This object's minutes have remained unchanged
	 *     | result.getMinutes() == getMinutes()
	 * @throws IllegalArgumentException if the given value is not between 0 and 23
	 *    | !(0 <= value && value <= 23)
	 */
	public TimeOfDay withHours(int value) {
		return new TimeOfDay(value, getMinutes());
	}
	
	/**
	 * @post This object's minutes equal the given minutes
	 *     | result.getMinutes() == value
	 * @post This object's hours have remained unchanged
	 *     | result.getHours() == getHours()
	 *     
	 * @throws IllegalArgumentException if the given value is not between 0 and 59
	 *    | !(0 <= value && value <= 59)
	 */
	public TimeOfDay withMinutes(int value) {
		return new TimeOfDay(getHours(), value);
	}
}
