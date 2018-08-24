package calc.logic;

import calc.exceptions.EmptyNumberException;
import calc.exceptions.NullDividerException;
import calc.exceptions.NumberWrongFormatException;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    @Test(expected = EmptyNumberException.class)
    public void divisionCalc_1() throws NullDividerException, NumberWrongFormatException, EmptyNumberException {
        Calc calc = new Calc();
        calc.division("","");
    }

    @Test
    public void divisionCalc_5() throws NumberWrongFormatException, EmptyNumberException, NullDividerException {
        Calc calc = new Calc();
        assertEquals("3.0", calc.division("15.0", "5.0"));
    }

    @Test(expected = NullDividerException.class)
    public void divisionCalc_7() throws EmptyNumberException, NumberWrongFormatException, NullDividerException {
        Calc calc = new Calc();
        calc.division("5", "0");
    }
}