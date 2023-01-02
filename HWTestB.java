import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class HWTestB {
    @Test
    public void Case1() {
        letterGrade letterGrade = new letterGrade();
        int score = -1;
        char grade = letterGrade.letterGrade(score);
        assertSame('X', grade);
    }

    @Test
    public void Case2() {
        letterGrade letterGrade = new letterGrade();
        int score = 0;
        char grade = letterGrade.letterGrade(score);
        assertSame('F', grade);
    }

    @Test
    public void Case3() {
        letterGrade letterGrade = new letterGrade();
        int score = 1;
        char grade = letterGrade.letterGrade(score);
        assertSame('F', grade);
    }

    @Test
    public void Case4() {
        letterGrade letterGrade = new letterGrade();
        int score = 58;
        char grade = letterGrade.letterGrade(score);
        assertSame('F', grade);
    }
    @Test
    public void Case5() {
        letterGrade letterGrade = new letterGrade();
        int score = 59;
        char grade = letterGrade.letterGrade(score);
        assertSame('F', grade);
    }

    @Test
    public void Case6() {
        letterGrade letterGrade = new letterGrade();
        int score = 60;
        char grade = letterGrade.letterGrade(score);
        assertSame('D', grade);
    }

    @Test
    public void Case7() {
        letterGrade letterGrade = new letterGrade();
        int score = 61;
        char grade = letterGrade.letterGrade(score);
        assertSame('D', grade);
    }

    @Test
    public void Case8() {
        letterGrade letterGrade = new letterGrade();
        int score = 68;
        char grade = letterGrade.letterGrade(score);
        assertSame('D', grade);
    }
    @Test
    public void Case9() {
        letterGrade letterGrade = new letterGrade();
        int score = 69;
        char grade = letterGrade.letterGrade(score);
        assertSame('D', grade);
    }

    @Test
    public void Case10() {
        letterGrade letterGrade = new letterGrade();
        int score = 70;
        char grade = letterGrade.letterGrade(score);
        assertSame('C', grade);
    }

    @Test
    public void Case11() {
        letterGrade letterGrade = new letterGrade();
        int score = 71;
        char grade = letterGrade.letterGrade(score);
        assertSame('C', grade);
    }

    @Test
    public void Case12() {
        letterGrade letterGrade = new letterGrade();
        int score = 78;
        char grade = letterGrade.letterGrade(score);
        assertSame('C', grade);
    }

    @Test
    public void Case13() {
        letterGrade letterGrade = new letterGrade();
        int score = 79;
        char grade = letterGrade.letterGrade(score);
        assertSame('C', grade);
    }

    @Test
    public void Case14() {
        letterGrade letterGrade = new letterGrade();
        int score = 80;
        char grade = letterGrade.letterGrade(score);
        assertSame('B', grade);
    }

    @Test
    public void Case15() {
        letterGrade letterGrade = new letterGrade();
        int score = 81;
        char grade = letterGrade.letterGrade(score);
        assertSame('B', grade);
    }

    @Test
    public void Case16() {
        letterGrade letterGrade = new letterGrade();
        int score = 88;
        char grade = letterGrade.letterGrade(score);
        assertSame('B', grade);
    }

    @Test
    public void Case17() {
        letterGrade letterGrade = new letterGrade();
        int score = 89;
        char grade = letterGrade.letterGrade(score);
        assertSame('B', grade);
    }

    @Test
    public void Case18() {
        letterGrade letterGrade = new letterGrade();
        int score = 90;
        char grade = letterGrade.letterGrade(score);
        assertSame('A', grade);
    }

    @Test
    public void Case19() {
        letterGrade letterGrade = new letterGrade();
        int score = 91;
        char grade = letterGrade.letterGrade(score);
        assertSame('A', grade);
    }

    @Test
    public void Case20() {
        letterGrade letterGrade = new letterGrade();
        int score = 99;
        char grade = letterGrade.letterGrade(score);
        assertSame('A', grade);
    }

    @Test
    public void Case21() {
        letterGrade letterGrade = new letterGrade();
        int score = 100;
        char grade = letterGrade.letterGrade(score);
        assertSame('A', grade);
    }

    @Test
    public void Case22() {
        letterGrade letterGrade = new letterGrade();
        int score = 101;
        char grade = letterGrade.letterGrade(score);
        assertSame('X', grade);
    }
}
