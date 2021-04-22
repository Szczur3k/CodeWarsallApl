package NumberFun;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberFunTest {

    @Test
    public void test1() {
        assertEquals(144, NumberFun.findNextSquare(121L));
    }

    @Test
    public void test2() {
        assertEquals(676, NumberFun.findNextSquare(625L));
    }

    @Test
    public void test3() {
        assertEquals(-1, NumberFun.findNextSquare(114L));
    }


}
