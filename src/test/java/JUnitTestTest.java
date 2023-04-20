import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class JUnitTestTest {

    @Test
    void checkEquals_100(){
        int a = 50;
        int b = 50;
        int expected = a + b;
        int actual = JUnitTest.add(a,b);

        assertEquals(actual,expected);
        assertTrue(actual==expected);
    }
        @Test
        public void testDividedByThreeAndFivePrintsFizzBuzz() {
            assertEquals("fizzbuzz", JUnitTest.FizzBuzz(15));
        }
        @Test
        public void testDividedByThreeOnlyPrintsFizz() {
            assertEquals("fizz", JUnitTest.FizzBuzz(3));
        }
        @Test
        public void testDividedByFiveOnlyPrintsBuzz() {
            assertEquals("buzz", JUnitTest.FizzBuzz(5));
        }
        @Test
        public void testNonDividedByThreeOrFivePrintsTheNumber() {
            assertEquals("fizzbuzz", JUnitTest.FizzBuzz(15));
        }

        @Test
        public void testBiggerThan100ThenFalse(){
        //given
        int num = 98;
        //when
        boolean res = JUnitTest.smallerThanZero(num);
        //then
        assertFalse(res);

        }
}
