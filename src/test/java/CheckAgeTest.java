import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CheckAgeTest {

    @Test
    void ageCheckTest18() {
       Assertions.assertTrue(CheckAge.ageCheck(18));
    }

    @Test
    void ageCheckTest8() {
        Assertions.assertFalse(CheckAge.ageCheck(8));
    }
}