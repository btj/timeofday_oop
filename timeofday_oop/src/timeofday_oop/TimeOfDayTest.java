package timeofday_oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {
	

	@Test
	void test() {
		TimeOfDay myTime = new TimeOfDay(12, 45);
		assert myTime.getHours() == 12;
		assert myTime.getMinutes() == 45;
		
		TimeOfDay yourTime = myTime.withHours(13);
		assert yourTime.getHours() == 13;
		assert yourTime.getMinutes() == 45;
		
	}

}
