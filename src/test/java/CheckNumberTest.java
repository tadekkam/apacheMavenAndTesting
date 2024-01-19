import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckNumberTest {

    @Test
    void isEven4() {
        Assertions.assertTrue(CheckNumber.isEven(4));
    }

    @Test
    void isOdd3() {
        Assertions.assertTrue(CheckNumber.isOdd(3));
    }
    @Test
    void isEven3() {
        Assertions.assertFalse(CheckNumber.isEven(3));
    }

    @Test
    void isOdd4() {
        Assertions.assertFalse(CheckNumber.isOdd(4));
    }
}