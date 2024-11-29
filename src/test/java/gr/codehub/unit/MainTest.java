package gr.codehub.unit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MainTest {

    @BeforeAll  // BeforeClass
    static void beforeAll(){
        System.out.println("I am ready to run all tests");
    }

    @BeforeEach // Before
    void beforeEach(){
        System.out.println("Ready to run next test");
    }

    @Test
    void shouldAlwaysRun(){
        System.out.println("This is shouldAlwaysRun");
    }

    @Test
    void shouldReturnTripleValue(){
        int expected = 15;
        int actual = Main.getANumber(5);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnTripleValue2(){
        int expected = 15;
        int actual = Main.getANumber(5);
        assertTrue(expected == actual, "dougdouigdou");
    }

    @Test
    void shouldReturnTwoTripleValues(){
        int expected = 15;
        int actual = Main.getANumber(5);
        assertEquals(expected, actual);
        int expected2 = 15;
        int actual2 = Main.getANumber(5);
        assertEquals(expected2, actual2);
    }

    @Test
    void shouldReturnBothTripleValues(){
        int expected = 15;
        int actual = Main.getANumber(5);
        int expected2 = 15;
        int actual2 = Main.getANumber(5);
        assertAll("this messgae is for all",
                () -> assertEquals(expected, actual,"this message is for first of many"),
                () -> assertEquals(expected2, actual2)
        );
    }

    @Test
    void shouldAlwaysFail() {
        fail("This test will fail");
    }


    @Test
    void shouldThrowExceptionWhenIntegerDivideByZero(){
        assertThrows(ArithmeticException.class, () -> {
            Main.integerDivide(2, 0);
        });
    }

    @Test
    void shouldReturnNullWhenDoubleDivideByZero(){
        assertNull(Main.doubleDivide(2, 0));
    }


}















