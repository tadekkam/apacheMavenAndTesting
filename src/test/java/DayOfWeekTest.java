import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfWeekTest {

    @Test
    void checkDayMonday() {
        //given
        byte day = 1;
        //when
        String dayCheck = DayOfWeek.CheckDay(day);
        //then
        Assertions.assertEquals("Monday", dayCheck);
    }

    @Test
    void checkDayWeekend() {
        //given
        byte day = 6;
        //when
        String dayCheck = DayOfWeek.CheckDay(day);
        //then
        Assertions.assertEquals("Weekend", dayCheck);
    }

    @Test
    void checkDayWeekendError() {
        //given
        byte day = 8;
        //when
        String dayCheck = DayOfWeek.CheckDay(day);
        //then
        Assertions.assertEquals("There is no such a day!", dayCheck);
    }
}