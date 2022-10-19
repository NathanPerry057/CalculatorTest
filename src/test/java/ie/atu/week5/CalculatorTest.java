package ie.atu.week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator myCount;

    @BeforeEach
    void setUp() {
        myCount = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(5, myCount.add(2, 3));
    }

    @Test
    void testSub() {
        assertEquals(4, myCount.sub(6, 2));
    }

    @Test
    void testMul() {
        assertEquals(20, myCount.mul(5, 4));
    }

    @Test
    void testDiv() {
        assertEquals(5, myCount.div(25, 5));
    }


}