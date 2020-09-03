import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EuropeanToRomanTest {

    private EuropeanToRoman europeanToRoman;

    @BeforeEach
    void setUp() {
        europeanToRoman = new EuropeanToRoman();
    }

    @Test
    public void returns_NotDefined_if_0_passed(){
        assertEquals("Not defined", europeanToRoman.calculate(0));
    }

    @Test
    public void returnsAn_I_String_if_1_passed(){
        assertEquals("I", europeanToRoman.calculate(1));
    }

    @Test
    public void moreAssertions(){
        assertEquals("II", europeanToRoman.calculate(2));
        assertEquals("III", europeanToRoman.calculate(3));
        assertEquals("IV", europeanToRoman.calculate(4));
        assertEquals("V", europeanToRoman.calculate(5));
        assertEquals("VI", europeanToRoman.calculate(6));
        assertEquals("VII", europeanToRoman.calculate(7));
        assertEquals("VIII", europeanToRoman.calculate(8));
        assertEquals("IX", europeanToRoman.calculate(9));


        assertEquals("M", europeanToRoman.calculate(1000));
        assertEquals("MM", europeanToRoman.calculate(2000));
        assertEquals("MMMD", europeanToRoman.calculate(3500));
        assertEquals("MMMCM", europeanToRoman.calculate(3900));
        assertEquals("CM", europeanToRoman.calculate(900));
        assertEquals("D", europeanToRoman.calculate(500));
        assertEquals("CD", europeanToRoman.calculate(400));
        assertEquals("C", europeanToRoman.calculate(100));
        assertEquals("CC", europeanToRoman.calculate(200));

        assertEquals("MMMMCMLXVIII", europeanToRoman.calculate(4000 + 900 + 50 + 10 + 5 +3));
        assertEquals("CDLIX", europeanToRoman.calculate(400 + 50 + 9));

    }
}