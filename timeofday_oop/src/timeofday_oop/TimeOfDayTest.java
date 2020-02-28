package timeofday_oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {
	

	@Test
	void test() {
		TimeOfDay myTime = new TimeOfDay();
		myTime.setHours(12);
		myTime.setMinutes(45);
		assert myTime.getHours() == 12;
		assert myTime.getMinutes() == 45;
	}

}
