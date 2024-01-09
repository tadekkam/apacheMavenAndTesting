import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {
    @Test
    void shouldSumTwoValues1and5() {
        //given
        int value1 = 1;
        int value2 = 5;

        //when
        int sum = Calculator.add(value1, value2);

        //then
        Assertions.assertEquals(6, sum);
    }

    @Test
    void shouldSubTwoValues1and5() {
        //given
        int value1 = 1;
        int value2 = 5;

        //when
        int sub = Calculator.sub(value1, value2);

        //then
        Assertions.assertEquals(-4, sub);
    }

    @Test
    void shouldMulTwoValues2and10() {
        //given
        int value1 = 2;
        int value2 = 10;

        //when
        int mul = Calculator.mul(value1, value2);

        //then
        Assertions.assertEquals(20, mul);
    }

    @Test
    void shouldDivTwoValues50and10() {
        //given
        double value1 = 50;
        double value2 = 10;

        //when
        double mul = Calculator.div(value1, value2);

        //then
        Assertions.assertEquals(5, mul);
    }

    @Test
    void shouldDivDivisionBy0() {
        //given
        double value1 = 50;
        double value2 = 0;

        //when
        double mul = Calculator.div(value1, value2);

        //then
        Assertions.assertEquals(0, mul);
    }

}