package gr.codehub.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;


public class MainTest {

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
    void shouldAlwaysFail() {
        fail("This test will fail");
    }
}
