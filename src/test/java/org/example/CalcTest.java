package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }
    @Test
    public void testSubtraction() {
        Calc c = new Calc();
        // 断言：4减2的结果应该等于2
        assertEquals(2, c.subtract(4, 2));
    }
}
